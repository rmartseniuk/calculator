package com.rmartseniuk.parser;

import com.rmartseniuk.parser.CalculatorParser.BracesContext;
import com.rmartseniuk.parser.CalculatorParser.CalculateContext;
import com.rmartseniuk.parser.CalculatorParser.ChangeSignContext;
import com.rmartseniuk.parser.CalculatorParser.DivisionContext;
import com.rmartseniuk.parser.CalculatorParser.FunctionContext;
import com.rmartseniuk.parser.CalculatorParser.MinusContext;
import com.rmartseniuk.parser.CalculatorParser.MultiplicationContext;
import com.rmartseniuk.parser.CalculatorParser.NumberContext;
import com.rmartseniuk.parser.CalculatorParser.PlusContext;
import com.rmartseniuk.parser.CalculatorParser.PowerContext;
import com.rmartseniuk.parser.CalculatorParser.SetVariableContext;
import com.rmartseniuk.parser.CalculatorParser.VariableContext;
import com.rmartseniuk.utils.NumberUtils;
import com.rmartseniuk.number.BinaryNumber;
import com.rmartseniuk.number.DecimalNumber;
import com.rmartseniuk.number.HexNumber;
import com.rmartseniuk.number.Number;
import com.rmartseniuk.number.OctalNumber;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class CalculatorBaseVisitorImpl extends CalculatorBaseVisitor<Number> {

    private final Map<String, Number> variables = new HashMap<>();

    private final Map<String, Function<Entry<Number, Integer>, Number>> functions = Map.of(
            "convert", entry -> entry.getKey().convert(entry.getValue())
    );

    @Override
    public Number visitNumber(NumberContext ctx) {
        String text = ctx.NUMBER().getText();
        int currentRadix = NumberUtils.getRadix(text);

        Number number = null;
        switch (currentRadix) {
            case 2:
                number = new BinaryNumber(text);
                break;
            case 8:
                number = new OctalNumber(text);
                break;
            case 16:
                String s = NumberUtils.parseHexMantissa(text);
                number = new HexNumber(s);
                break;
            default:
                number = new DecimalNumber(text);
        }

        return number;
    }

    @Override
    public Number visitPlus(PlusContext ctx) {
        return visit(ctx.plusOrMinus()).add(visit(ctx.multOrDiv()));
    }

    @Override
    public Number visitMinus(MinusContext ctx) {
        return visit(ctx.plusOrMinus()).subtract(visit(ctx.multOrDiv()));
    }

    @Override
    public Number visitMultiplication(MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()).multiply(visit(ctx.pow()));
    }

    @Override
    public Number visitDivision(DivisionContext ctx) {
        return visit(ctx.multOrDiv()).divide(visit(ctx.pow()));
    }

    @Override
    public Number visitSetVariable(SetVariableContext ctx) {
        Number value = visit(ctx.plusOrMinus());
        variables.put(ctx.ID().getText(), value);
        return value;
    }

    @Override
    public Number visitPower(PowerContext ctx) {
        if (ctx.pow() != null) {
            return visit(ctx.unaryMinus()).pow(visit(ctx.pow()));
        }
        return visit(ctx.unaryMinus());
    }

    @Override
    public Number visitChangeSign(ChangeSignContext ctx) {
        Number number = visit(ctx.unaryMinus());
        number.setValue("-".concat(number.getValue()));
        return number;
    }

    @Override
    public Number visitBraces(BracesContext ctx) {
        return visit(ctx.plusOrMinus());
    }

    @Override
    public Number visitVariable(VariableContext ctx) {
        return variables.get(ctx.ID().getText());
    }

    @Override
    public Number visitCalculate(CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
    }

    @Override
    public Number visitFunction(FunctionContext ctx) {
        int currentRadix = Integer.parseInt(ctx.plusOrMinus(1).getText());
        Number result = functions.get(ctx.ID().getText())
                .apply(Map.entry(visit(ctx.plusOrMinus(0)), currentRadix));
        String radix = currentRadix != 10 ? "<" + currentRadix + ">" : "";
        result.setValue(result.getValue() + radix);
        return result;
    }
}
