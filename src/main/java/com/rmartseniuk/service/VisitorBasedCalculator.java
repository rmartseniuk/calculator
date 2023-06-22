package com.rmartseniuk.service;

import com.rmartseniuk.parser.CalculatorLexer;
import com.rmartseniuk.parser.CalculatorParser;
import com.rmartseniuk.parser.CalculatorBaseVisitorImpl;
import com.rmartseniuk.number.Number;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Service;

@Service
public class VisitorBasedCalculator implements Calculator {

    @Override
    public Number calculate(String input) {
        CharStream chars = CharStreams.fromString(input);

        Lexer lexer = new CalculatorLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();

        CalculatorBaseVisitorImpl calculator = new CalculatorBaseVisitorImpl();
        return calculator.visit(tree);
    }
}
