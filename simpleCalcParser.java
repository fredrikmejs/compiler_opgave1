// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, MULTIDIV=19, OP=20, ID=21, FLOAT=22, ALPHA=23, NUM=24, WHITESPACE=25, 
		COMMENT=26, COMMENT2=27;
	public static final int
		RULE_start = 0, RULE_assign = 1, RULE_assignments = 2, RULE_exprList = 3, 
		RULE_conditional = 4, RULE_loop = 5, RULE_condition = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "assign", "assignments", "exprList", "conditional", "loop", 
			"condition", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'if'", "'('", "')'", "'then'", "'else'", "'while'", 
			"'do'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "MULTIDIV", "OP", "ID", "FLOAT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public AssignContext assign;
		public List<AssignContext> as = new ArrayList<AssignContext>();
		public ConditionalContext conditional;
		public List<ConditionalContext> con = new ArrayList<ConditionalContext>();
		public LoopContext loop;
		public List<LoopContext> lo = new ArrayList<LoopContext>();
		public ExprContext e;
		public TerminalNode EOF() { return getToken(simpleCalcParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16);
					((StartContext)_localctx).assign = assign();
					((StartContext)_localctx).as.add(((StartContext)_localctx).assign);
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(22);
				((StartContext)_localctx).conditional = conditional();
				((StartContext)_localctx).con.add(((StartContext)_localctx).conditional);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(28);
				((StartContext)_localctx).loop = loop();
				((StartContext)_localctx).lo.add(((StartContext)_localctx).loop);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			((StartContext)_localctx).e = expr(0);
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((AssignContext)_localctx).x = match(ID);
			setState(38);
			match(T__0);
			setState(39);
			((AssignContext)_localctx).e = expr(0);
			setState(40);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentsContext extends ParserRuleContext {
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
	 
		public AssignmentsContext() { }
		public void copyFrom(AssignmentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends AssignmentsContext {
		public AssignContext a1;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignmentContext(AssignmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends AssignmentsContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(AssignmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignments);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((AssignmentContext)_localctx).a1 = assign();
				}
				break;
			case 2:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((ExpressionContext)_localctx).e1 = expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public AssignmentsContext assignments;
		public List<AssignmentsContext> a1 = new ArrayList<AssignmentsContext>();
		public List<AssignmentsContext> assignments() {
			return getRuleContexts(AssignmentsContext.class);
		}
		public AssignmentsContext assignments(int i) {
			return getRuleContext(AssignmentsContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(46);
					((ExprListContext)_localctx).assignments = assignments();
					((ExprListContext)_localctx).a1.add(((ExprListContext)_localctx).assignments);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends ConditionalContext {
		public ConditionContext c1;
		public ExprListContext e1;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatementContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends ConditionalContext {
		public ConditionContext c1;
		public ExprListContext e1;
		public ExprListContext e2;
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfElseContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__2);
				setState(52);
				match(T__3);
				{
				setState(53);
				((IfStatementContext)_localctx).c1 = condition(0);
				}
				setState(54);
				match(T__4);
				setState(55);
				match(T__5);
				setState(56);
				((IfStatementContext)_localctx).e1 = exprList();
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__2);
				setState(59);
				match(T__3);
				{
				setState(60);
				((IfElseContext)_localctx).c1 = condition(0);
				}
				setState(61);
				match(T__4);
				setState(62);
				match(T__5);
				setState(63);
				((IfElseContext)_localctx).e1 = exprList();
				setState(64);
				match(T__6);
				setState(65);
				((IfElseContext)_localctx).e2 = exprList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends LoopContext {
		public ConditionContext c1;
		public ExprListContext e1;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public WhileContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__7);
			setState(70);
			match(T__3);
			setState(71);
			((WhileContext)_localctx).c1 = condition(0);
			setState(72);
			match(T__4);
			setState(73);
			match(T__8);
			setState(74);
			((WhileContext)_localctx).e1 = exprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessOrEqualContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessOrEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitLessOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitLessOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ConditionContext {
		public ConditionContext c1;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NotContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BiggerContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiggerContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterBigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitBigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitBigger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ConditionContext {
		public ConditionContext e1;
		public ConditionContext e2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public OrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ConditionContext {
		public ConditionContext e1;
		public ConditionContext e2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public AndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BiggerOrEqualContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiggerOrEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterBiggerOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitBiggerOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitBiggerOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new EqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				((EqualsContext)_localctx).e1 = expr(0);
				setState(78);
				match(T__9);
				setState(79);
				((EqualsContext)_localctx).e2 = expr(0);
				}
				break;
			case 2:
				{
				_localctx = new NotEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				((NotEqualContext)_localctx).e1 = expr(0);
				setState(82);
				match(T__10);
				setState(83);
				((NotEqualContext)_localctx).e2 = expr(0);
				}
				break;
			case 3:
				{
				_localctx = new LessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				((LessContext)_localctx).e1 = expr(0);
				setState(86);
				match(T__11);
				setState(87);
				((LessContext)_localctx).e2 = expr(0);
				}
				break;
			case 4:
				{
				_localctx = new BiggerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				((BiggerContext)_localctx).e1 = expr(0);
				setState(90);
				match(T__12);
				setState(91);
				((BiggerContext)_localctx).e2 = expr(0);
				}
				break;
			case 5:
				{
				_localctx = new LessOrEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				((LessOrEqualContext)_localctx).e1 = expr(0);
				setState(94);
				match(T__13);
				setState(95);
				((LessOrEqualContext)_localctx).e2 = expr(0);
				}
				break;
			case 6:
				{
				_localctx = new BiggerOrEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				((BiggerOrEqualContext)_localctx).e1 = expr(0);
				setState(98);
				match(T__14);
				setState(99);
				((BiggerOrEqualContext)_localctx).e2 = expr(0);
				}
				break;
			case 7:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__15);
				setState(102);
				match(T__3);
				setState(103);
				((NotContext)_localctx).c1 = condition(0);
				setState(104);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						match(T__16);
						setState(110);
						((AndContext)_localctx).e2 = condition(3);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(112);
						match(T__17);
						setState(113);
						((OrContext)_localctx).e2 = condition(2);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusMinusContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(simpleCalcParser.OP, 0); }
		public PlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumMultiAlphaContext extends ExprContext {
		public Token c;
		public Token x;
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public NumMultiAlphaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterNumMultiAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitNumMultiAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitNumMultiAlpha(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultidivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIDIV() { return getToken(simpleCalcParser.MULTIDIV, 0); }
		public MultidivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterMultidiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitMultidiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitMultidiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedConstantContext extends ExprContext {
		public Token op;
		public Token f;
		public TerminalNode OP() { return getToken(simpleCalcParser.OP, 0); }
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public SignedConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitSignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitSignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NumMultiAlphaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(120);
				((NumMultiAlphaContext)_localctx).c = match(FLOAT);
				setState(121);
				((NumMultiAlphaContext)_localctx).x = match(ID);
				}
				break;
			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				((ConstantContext)_localctx).c = match(FLOAT);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__3);
				setState(125);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(126);
				match(T__4);
				}
				break;
			case 5:
				{
				_localctx = new SignedConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				((SignedConstantContext)_localctx).op = match(OP);
				setState(129);
				((SignedConstantContext)_localctx).f = match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultidivContext(new ExprContext(_parentctx, _parentState));
						((MultidivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						((MultidivContext)_localctx).op = match(MULTIDIV);
						setState(134);
						((MultidivContext)_localctx).e2 = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
						((PlusMinusContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						((PlusMinusContext)_localctx).op = match(OP);
						setState(137);
						((PlusMinusContext)_localctx).e2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2\16"+
		"\2#\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4/\n\4\3\5\6\5\62\n"+
		"\5\r\5\16\5\63\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f"+
		"\b\16\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090\13\t\3\t\2\4\16"+
		"\20\n\2\4\6\b\n\f\16\20\2\2\2\u009d\2\25\3\2\2\2\4\'\3\2\2\2\6.\3\2\2"+
		"\2\b\61\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16l\3\2\2\2\20\u0084\3\2\2\2\22"+
		"\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\33\3\2\2\2\27\25\3\2\2\2\30\32\5\n\6\2\31\30\3\2\2\2\32\35\3\2\2\2\33"+
		"\31\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\33\3\2\2\2\36 \5\f\7\2\37\36"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\5\20"+
		"\t\2%&\7\2\2\3&\3\3\2\2\2\'(\7\27\2\2()\7\3\2\2)*\5\20\t\2*+\7\4\2\2+"+
		"\5\3\2\2\2,/\5\4\3\2-/\5\20\t\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\62\5"+
		"\6\4\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3"+
		"\2\2\2\65\66\7\5\2\2\66\67\7\6\2\2\678\5\16\b\289\7\7\2\29:\7\b\2\2:;"+
		"\5\b\5\2;F\3\2\2\2<=\7\5\2\2=>\7\6\2\2>?\5\16\b\2?@\7\7\2\2@A\7\b\2\2"+
		"AB\5\b\5\2BC\7\t\2\2CD\5\b\5\2DF\3\2\2\2E\65\3\2\2\2E<\3\2\2\2F\13\3\2"+
		"\2\2GH\7\n\2\2HI\7\6\2\2IJ\5\16\b\2JK\7\7\2\2KL\7\13\2\2LM\5\b\5\2M\r"+
		"\3\2\2\2NO\b\b\1\2OP\5\20\t\2PQ\7\f\2\2QR\5\20\t\2Rm\3\2\2\2ST\5\20\t"+
		"\2TU\7\r\2\2UV\5\20\t\2Vm\3\2\2\2WX\5\20\t\2XY\7\16\2\2YZ\5\20\t\2Zm\3"+
		"\2\2\2[\\\5\20\t\2\\]\7\17\2\2]^\5\20\t\2^m\3\2\2\2_`\5\20\t\2`a\7\20"+
		"\2\2ab\5\20\t\2bm\3\2\2\2cd\5\20\t\2de\7\21\2\2ef\5\20\t\2fm\3\2\2\2g"+
		"h\7\22\2\2hi\7\6\2\2ij\5\16\b\2jk\7\7\2\2km\3\2\2\2lN\3\2\2\2lS\3\2\2"+
		"\2lW\3\2\2\2l[\3\2\2\2l_\3\2\2\2lc\3\2\2\2lg\3\2\2\2mv\3\2\2\2no\f\4\2"+
		"\2op\7\23\2\2pu\5\16\b\5qr\f\3\2\2rs\7\24\2\2su\5\16\b\4tn\3\2\2\2tq\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\b\t\1\2z"+
		"{\7\30\2\2{\u0085\7\27\2\2|\u0085\7\27\2\2}\u0085\7\30\2\2~\177\7\6\2"+
		"\2\177\u0080\5\20\t\2\u0080\u0081\7\7\2\2\u0081\u0085\3\2\2\2\u0082\u0083"+
		"\7\26\2\2\u0083\u0085\7\30\2\2\u0084y\3\2\2\2\u0084|\3\2\2\2\u0084}\3"+
		"\2\2\2\u0084~\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008e\3\2\2\2\u0086\u0087"+
		"\f\6\2\2\u0087\u0088\7\25\2\2\u0088\u008d\5\20\t\7\u0089\u008a\f\5\2\2"+
		"\u008a\u008b\7\26\2\2\u008b\u008d\5\20\t\6\u008c\u0086\3\2\2\2\u008c\u0089"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u008e\3\2\2\2\16\25\33!.\63Eltv\u0084\u008c\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}