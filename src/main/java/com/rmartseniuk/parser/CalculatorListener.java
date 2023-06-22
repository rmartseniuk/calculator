package com.rmartseniuk.parser;// Generated from CalculatorLexer.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 */
	void enterToSetVar(CalculatorParser.ToSetVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 */
	void exitToSetVar(CalculatorParser.ToSetVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(CalculatorParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(CalculatorParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(CalculatorParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(CalculatorParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterToMultOrDiv(CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitToMultOrDiv(CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(CalculatorParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(CalculatorParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(CalculatorParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(CalculatorParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterToPow(CalculatorParser.ToPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitToPow(CalculatorParser.ToPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculatorParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPower(CalculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculatorParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPower(CalculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link CalculatorParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterChangeSign(CalculatorParser.ChangeSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link CalculatorParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitChangeSign(CalculatorParser.ChangeSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(CalculatorParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(CalculatorParser.ToAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToFunction}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterToFunction(CalculatorParser.ToFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToFunction}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitToFunction(CalculatorParser.ToFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(CalculatorParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(CalculatorParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link CalculatorParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CalculatorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link CalculatorParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CalculatorParser.FunctionContext ctx);
}