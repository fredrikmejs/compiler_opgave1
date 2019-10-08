// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, MULTIDIV=19, OP=20, ID=21, FLOAT=22, ALPHA=23, NUM=24, WHITESPACE=25, 
		COMMENT=26, COMMENT2=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "MULTIDIV", "OP", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", 
			"COMMENT", "COMMENT2"
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\7\26w\n\26\f\26\16\26z\13\26\3\27\6\27}\n\27"+
		"\r\27\16\27~\3\27\3\27\6\27\u0083\n\27\r\27\16\27\u0084\5\27\u0087\n\27"+
		"\3\30\3\30\3\31\3\31\3\32\6\32\u008e\n\32\r\32\16\32\u008f\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\7\33\u0098\n\33\f\33\16\33\u009b\13\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\7\34\u00a5\n\34\f\34\16\34\u00a8\13\34\3"+
		"\34\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\35\3\2\n\4\2,,\61\61\4\2--//\13\2C\\aac|\u00a7\u00a8"+
		"\u00ba\u00ba\u00c5\u00c5\u02de\u02de\u2022\u2022\u2028\u2028\3\2\62;\5"+
		"\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00b6\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t@\3"+
		"\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23T\3\2\2\2\25W"+
		"\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37d\3\2\2\2!"+
		"g\3\2\2\2#i\3\2\2\2%l\3\2\2\2\'o\3\2\2\2)q\3\2\2\2+s\3\2\2\2-|\3\2\2\2"+
		"/\u0088\3\2\2\2\61\u008a\3\2\2\2\63\u008d\3\2\2\2\65\u0093\3\2\2\2\67"+
		"\u009e\3\2\2\29:\7?\2\2:\4\3\2\2\2;<\7=\2\2<\6\3\2\2\2=>\7k\2\2>?\7h\2"+
		"\2?\b\3\2\2\2@A\7*\2\2A\n\3\2\2\2BC\7+\2\2C\f\3\2\2\2DE\7v\2\2EF\7j\2"+
		"\2FG\7g\2\2GH\7p\2\2H\16\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2\2LM\7g\2\2M"+
		"\20\3\2\2\2NO\7y\2\2OP\7j\2\2PQ\7k\2\2QR\7n\2\2RS\7g\2\2S\22\3\2\2\2T"+
		"U\7f\2\2UV\7q\2\2V\24\3\2\2\2WX\7?\2\2XY\7?\2\2Y\26\3\2\2\2Z[\7#\2\2["+
		"\\\7?\2\2\\\30\3\2\2\2]^\7@\2\2^\32\3\2\2\2_`\7>\2\2`\34\3\2\2\2ab\7@"+
		"\2\2bc\7?\2\2c\36\3\2\2\2de\7>\2\2ef\7?\2\2f \3\2\2\2gh\7#\2\2h\"\3\2"+
		"\2\2ij\7(\2\2jk\7(\2\2k$\3\2\2\2lm\7~\2\2mn\7~\2\2n&\3\2\2\2op\t\2\2\2"+
		"p(\3\2\2\2qr\t\3\2\2r*\3\2\2\2sx\5/\30\2tw\5/\30\2uw\5\61\31\2vt\3\2\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y,\3\2\2\2zx\3\2\2\2{}\5\61"+
		"\31\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0086\3\2\2\2\u0080"+
		"\u0082\7\60\2\2\u0081\u0083\5\61\31\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0080\3\2\2\2\u0086\u0087\3\2\2\2\u0087.\3\2\2\2\u0088\u0089\t\4\2\2"+
		"\u0089\60\3\2\2\2\u008a\u008b\t\5\2\2\u008b\62\3\2\2\2\u008c\u008e\t\6"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\32\2\2\u0092\64\3\2\2"+
		"\2\u0093\u0094\7\61\2\2\u0094\u0095\7\61\2\2\u0095\u0099\3\2\2\2\u0096"+
		"\u0098\n\7\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\b\33\2\2\u009d\66\3\2\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\7,\2"+
		"\2\u00a0\u00a6\3\2\2\2\u00a1\u00a5\n\b\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a5"+
		"\n\t\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\b\34\2\2\u00ad8\3\2\2\2\f\2vx~\u0084\u0086\u008f\u0099\u00a4\u00a6"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}