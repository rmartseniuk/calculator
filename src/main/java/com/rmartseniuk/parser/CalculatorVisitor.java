package com.rmartseniuk.parser;// Generated from CalculatorLexer.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVar(CalculatorParser.ToSetVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(CalculatorParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalculatorParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(CalculatorParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(CalculatorParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CalculatorParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPow(CalculatorParser.ToPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculatorParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CalculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link CalculatorParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSign(CalculatorParser.ChangeSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(CalculatorParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToFunction}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFunction(CalculatorParser.ToFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(CalculatorParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link CalculatorParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CalculatorParser.FunctionContext ctx);
}