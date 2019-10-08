// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionAndElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAndElse(simpleCalcParser.ConditionAndElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAnd(simpleCalcParser.ConditionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionOrElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOrElse(simpleCalcParser.ConditionOrElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOr(simpleCalcParser.ConditionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionElse(simpleCalcParser.ConditionElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionSimple}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionSimple(simpleCalcParser.ConditionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Notequal}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequal(simpleCalcParser.NotequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(simpleCalcParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bigger}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigger(simpleCalcParser.BiggerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqual(simpleCalcParser.LessOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraction(simpleCalcParser.SubstractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumMultiAlpha}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumMultiAlpha(simpleCalcParser.NumMultiAlphaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
}