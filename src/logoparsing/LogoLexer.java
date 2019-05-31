// Generated from grammar/Logo.g4 by ANTLR 4.7.1
		
  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, FLOAT=38, 
		ID=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "FLOAT", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'retour'", "'pour '", "'fin'", "'repete'", "'['", "']'", 
		"'tantque'", "'si'", "'av'", "'td'", "'tg'", "'lc'", "'bc'", "'ve'", "'re'", 
		"'fpos'", "'fcc'", "'donne \"'", "'store'", "'move'", "'loop'", "'('", 
		"')'", "'*'", "'/'", "'+'", "'-'", "'hasard'", "'cos('", "'sin('", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "FLOAT", "ID", "WS"
	};
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\7\'\u00e2\n\'\f\'\16"+
		"\'\u00e5\13\'\3\'\3\'\6\'\u00e9\n\'\r\'\16\'\u00ea\5\'\u00ed\n\'\3(\6"+
		"(\u00f0\n(\r(\16(\u00f1\3)\6)\u00f5\n)\r)\16)\u00f6\3)\3)\2\2*\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00fe\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3"+
		"\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13f\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3"+
		"\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27\177\3\2\2\2\31\u0082\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008b\3\2\2\2!\u008e\3\2\2\2#\u0091\3\2\2"+
		"\2%\u0096\3\2\2\2\'\u009a\3\2\2\2)\u00a2\3\2\2\2+\u00a8\3\2\2\2-\u00ad"+
		"\3\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2\63\u00b6\3\2\2\2\65\u00b8\3\2"+
		"\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c5\3\2\2\2?\u00ca"+
		"\3\2\2\2A\u00cf\3\2\2\2C\u00d1\3\2\2\2E\u00d3\3\2\2\2G\u00d6\3\2\2\2I"+
		"\u00d9\3\2\2\2K\u00dc\3\2\2\2M\u00df\3\2\2\2O\u00ef\3\2\2\2Q\u00f4\3\2"+
		"\2\2ST\7<\2\2T\4\3\2\2\2UV\7t\2\2VW\7g\2\2WX\7v\2\2XY\7q\2\2YZ\7w\2\2"+
		"Z[\7t\2\2[\6\3\2\2\2\\]\7r\2\2]^\7q\2\2^_\7w\2\2_`\7t\2\2`a\7\"\2\2a\b"+
		"\3\2\2\2bc\7h\2\2cd\7k\2\2de\7p\2\2e\n\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7r"+
		"\2\2ij\7g\2\2jk\7v\2\2kl\7g\2\2l\f\3\2\2\2mn\7]\2\2n\16\3\2\2\2op\7_\2"+
		"\2p\20\3\2\2\2qr\7v\2\2rs\7c\2\2st\7p\2\2tu\7v\2\2uv\7s\2\2vw\7w\2\2w"+
		"x\7g\2\2x\22\3\2\2\2yz\7u\2\2z{\7k\2\2{\24\3\2\2\2|}\7c\2\2}~\7x\2\2~"+
		"\26\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7f\2\2\u0081\30\3\2\2\2\u0082"+
		"\u0083\7v\2\2\u0083\u0084\7i\2\2\u0084\32\3\2\2\2\u0085\u0086\7n\2\2\u0086"+
		"\u0087\7e\2\2\u0087\34\3\2\2\2\u0088\u0089\7d\2\2\u0089\u008a\7e\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d\7g\2\2\u008d \3\2\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\"\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7r\2\2\u0093\u0094\7q\2\2\u0094\u0095\7u\2\2\u0095$\3\2\2\2\u0096"+
		"\u0097\7h\2\2\u0097\u0098\7e\2\2\u0098\u0099\7e\2\2\u0099&\3\2\2\2\u009a"+
		"\u009b\7f\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\u009e\7p\2\2"+
		"\u009e\u009f\7g\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7$\2\2\u00a1(\3\2"+
		"\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\u00a7\7g\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7g\2\2\u00ac,\3\2\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7r\2\2\u00b1"+
		".\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5"+
		"\62\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		":\3\2\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7f\2\2\u00c4<\3\2\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7*\2\2"+
		"\u00c9>\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2"+
		"\2\u00cd\u00ce\7*\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0B\3\2\2\2"+
		"\u00d1\u00d2\7@\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7?\2"+
		"\2\u00d5F\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00d8\7?\2\2\u00d8H\3\2\2\2"+
		"\u00d9\u00da\7?\2\2\u00da\u00db\7?\2\2\u00dbJ\3\2\2\2\u00dc\u00dd\7#\2"+
		"\2\u00dd\u00de\7?\2\2\u00deL\3\2\2\2\u00df\u00e3\t\2\2\2\u00e0\u00e2\t"+
		"\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00ec\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7\60"+
		"\2\2\u00e7\u00e9\t\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00edN\3\2\2\2\u00ee\u00f0\t\3\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"P\3\2\2\2\u00f3\u00f5\t\4\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9"+
		"\b)\2\2\u00f9R\3\2\2\2\b\2\u00e3\u00ea\u00ec\u00f1\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}