// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionAndElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void enterConditionAndElse(simpleCalcParser.ConditionAndElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionAndElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void exitConditionAndElse(simpleCalcParser.ConditionAndElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void enterConditionAnd(simpleCalcParser.ConditionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void exitConditionAnd(simpleCalcParser.ConditionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionOrElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void enterConditionOrElse(simpleCalcParser.ConditionOrElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionOrElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void exitConditionOrElse(simpleCalcParser.ConditionOrElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void enterConditionOr(simpleCalcParser.ConditionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void exitConditionOr(simpleCalcParser.ConditionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void enterConditionElse(simpleCalcParser.ConditionElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionElse}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void exitConditionElse(simpleCalcParser.ConditionElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionSimple}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void enterConditionSimple(simpleCalcParser.ConditionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionSimple}
	 * labeled alternative in {@link simpleCalcParser#condional}.
	 * @param ctx the parse tree
	 */
	void exitConditionSimple(simpleCalcParser.ConditionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Notequal}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotequal(simpleCalcParser.NotequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Notequal}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotequal(simpleCalcParser.NotequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Less}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLess(simpleCalcParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLess(simpleCalcParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bigger}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBigger(simpleCalcParser.BiggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bigger}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBigger(simpleCalcParser.BiggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqual(simpleCalcParser.LessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqual(simpleCalcParser.LessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubstraction(simpleCalcParser.SubstractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubstraction(simpleCalcParser.SubstractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumMultiAlpha}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumMultiAlpha(simpleCalcParser.NumMultiAlphaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumMultiAlpha}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumMultiAlpha(simpleCalcParser.NumMultiAlphaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
}