// Generated from de/bfs/eurdepparser/parser/eurdep/Eurdep.g4 by ANTLR 4.9.2
package de.bfs.eurdepparser.parser.eurdep;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EurdepLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGINEURDEP=2, ENDEURDEP=3, BEGINHEADER=4, ENDHEADER=5, BEGINLOCALITY=6, 
		ENDLOCALITY=7, BEGINRADIOLOGICAL=8, ENDRADIOLOGICAL=9, BEGINDEFAULT=10, 
		ENDDEFAULT=11, BEGINUNKOWN=12, ENDUNKOWN=13, BEGINCOMMENT=14, ENDCOMMENT=15, 
		LINE_BEGIN=16, LINE_END=17, REMARK=18, NEWLINE=19, STRING=20, WHITESPACE=21, 
		COMMA=22, DQOUTE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BEGINEURDEP", "ENDEURDEP", "BEGINHEADER", "ENDHEADER", "BEGINLOCALITY", 
			"ENDLOCALITY", "BEGINRADIOLOGICAL", "ENDRADIOLOGICAL", "BEGINDEFAULT", 
			"ENDDEFAULT", "BEGINUNKOWN", "ENDUNKOWN", "BEGINCOMMENT", "ENDCOMMENT", 
			"LINE_BEGIN", "LINE_END", "REMARK", "CHAR", "NEWLINE", "STRING", "WHITESPACE", 
			"COMMA", "DQOUTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\FIELD_LIST'", null, null, null, null, "'\\BEGIN_LOCALITY;'", 
			"'\\END_LOCALITY;'", "'\\BEGIN_RADIOLOGICAL;'", "'\\END_RADIOLOGICAL;'", 
			"'\\BEGIN_DEFAULT;'", "'\\END_DEFAULT;'", null, null, null, null, null, 
			null, null, null, null, null, "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BEGINEURDEP", "ENDEURDEP", "BEGINHEADER", "ENDHEADER", "BEGINLOCALITY", 
			"ENDLOCALITY", "BEGINRADIOLOGICAL", "ENDRADIOLOGICAL", "BEGINDEFAULT", 
			"ENDDEFAULT", "BEGINUNKOWN", "ENDUNKOWN", "BEGINCOMMENT", "ENDCOMMENT", 
			"LINE_BEGIN", "LINE_END", "REMARK", "NEWLINE", "STRING", "WHITESPACE", 
			"COMMA", "DQOUTE"
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


	public EurdepLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eurdep.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0152\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00eb\n\r"+
		"\r\r\16\r\u00ec\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00f8"+
		"\n\16\r\16\16\16\u00f9\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u0120"+
		"\n\21\3\22\5\22\u0123\n\22\3\22\3\22\3\22\7\22\u0128\n\22\f\22\16\22\u012b"+
		"\13\22\3\22\5\22\u012e\n\22\3\23\3\23\3\23\7\23\u0133\n\23\f\23\16\23"+
		"\u0136\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u013f\n\25\3\25\3"+
		"\25\3\26\6\26\u0144\n\26\r\26\16\26\u0145\3\27\6\27\u0149\n\27\r\27\16"+
		"\27\u014a\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)"+
		"\25+\26-\27/\30\61\31\3\2\5\t\2\13\f\17\17\"\"$$..==^^\4\2\f\f\17\17\4"+
		"\2\13\13\"\"\2\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5?\3\2\2\2\7O\3\2\2\2\t]\3\2\2\2\13"+
		"m\3\2\2\2\r{\3\2\2\2\17\u008c\3\2\2\2\21\u009b\3\2\2\2\23\u00b0\3\2\2"+
		"\2\25\u00c3\3\2\2\2\27\u00d3\3\2\2\2\31\u00e1\3\2\2\2\33\u00f0\3\2\2\2"+
		"\35\u00fd\3\2\2\2\37\u010e\3\2\2\2!\u011d\3\2\2\2#\u0122\3\2\2\2%\u012f"+
		"\3\2\2\2\'\u0139\3\2\2\2)\u013e\3\2\2\2+\u0143\3\2\2\2-\u0148\3\2\2\2"+
		"/\u014e\3\2\2\2\61\u0150\3\2\2\2\63\64\7^\2\2\64\65\7H\2\2\65\66\7K\2"+
		"\2\66\67\7G\2\2\678\7N\2\289\7F\2\29:\7a\2\2:;\7N\2\2;<\7K\2\2<=\7U\2"+
		"\2=>\7V\2\2>\4\3\2\2\2?@\7^\2\2@A\7D\2\2AB\7G\2\2BC\7I\2\2CD\7K\2\2DE"+
		"\7P\2\2EF\7a\2\2FG\7G\2\2GH\7W\2\2HI\7T\2\2IJ\7F\2\2JK\7G\2\2KL\7R\2\2"+
		"LM\3\2\2\2MN\5#\22\2N\6\3\2\2\2OP\7^\2\2PQ\7G\2\2QR\7P\2\2RS\7F\2\2ST"+
		"\7a\2\2TU\7G\2\2UV\7W\2\2VW\7T\2\2WX\7F\2\2XY\7G\2\2YZ\7R\2\2Z[\3\2\2"+
		"\2[\\\5#\22\2\\\b\3\2\2\2]^\7^\2\2^_\7D\2\2_`\7G\2\2`a\7I\2\2ab\7K\2\2"+
		"bc\7P\2\2cd\7a\2\2de\7J\2\2ef\7G\2\2fg\7C\2\2gh\7F\2\2hi\7G\2\2ij\7T\2"+
		"\2jk\3\2\2\2kl\5#\22\2l\n\3\2\2\2mn\7^\2\2no\7G\2\2op\7P\2\2pq\7F\2\2"+
		"qr\7a\2\2rs\7J\2\2st\7G\2\2tu\7C\2\2uv\7F\2\2vw\7G\2\2wx\7T\2\2xy\3\2"+
		"\2\2yz\5#\22\2z\f\3\2\2\2{|\7^\2\2|}\7D\2\2}~\7G\2\2~\177\7I\2\2\177\u0080"+
		"\7K\2\2\u0080\u0081\7P\2\2\u0081\u0082\7a\2\2\u0082\u0083\7N\2\2\u0083"+
		"\u0084\7Q\2\2\u0084\u0085\7E\2\2\u0085\u0086\7C\2\2\u0086\u0087\7N\2\2"+
		"\u0087\u0088\7K\2\2\u0088\u0089\7V\2\2\u0089\u008a\7[\2\2\u008a\u008b"+
		"\7=\2\2\u008b\16\3\2\2\2\u008c\u008d\7^\2\2\u008d\u008e\7G\2\2\u008e\u008f"+
		"\7P\2\2\u008f\u0090\7F\2\2\u0090\u0091\7a\2\2\u0091\u0092\7N\2\2\u0092"+
		"\u0093\7Q\2\2\u0093\u0094\7E\2\2\u0094\u0095\7C\2\2\u0095\u0096\7N\2\2"+
		"\u0096\u0097\7K\2\2\u0097\u0098\7V\2\2\u0098\u0099\7[\2\2\u0099\u009a"+
		"\7=\2\2\u009a\20\3\2\2\2\u009b\u009c\7^\2\2\u009c\u009d\7D\2\2\u009d\u009e"+
		"\7G\2\2\u009e\u009f\7I\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7P\2\2\u00a1"+
		"\u00a2\7a\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\7F\2\2"+
		"\u00a5\u00a6\7K\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9"+
		"\7Q\2\2\u00a9\u00aa\7I\2\2\u00aa\u00ab\7K\2\2\u00ab\u00ac\7E\2\2\u00ac"+
		"\u00ad\7C\2\2\u00ad\u00ae\7N\2\2\u00ae\u00af\7=\2\2\u00af\22\3\2\2\2\u00b0"+
		"\u00b1\7^\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b4\7F\2\2"+
		"\u00b4\u00b5\7a\2\2\u00b5\u00b6\7T\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8"+
		"\7F\2\2\u00b8\u00b9\7K\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00bb\7N\2\2\u00bb"+
		"\u00bc\7Q\2\2\u00bc\u00bd\7I\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7E\2\2"+
		"\u00bf\u00c0\7C\2\2\u00c0\u00c1\7N\2\2\u00c1\u00c2\7=\2\2\u00c2\24\3\2"+
		"\2\2\u00c3\u00c4\7^\2\2\u00c4\u00c5\7D\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7"+
		"\7I\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7a\2\2\u00ca"+
		"\u00cb\7F\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7H\2\2\u00cd\u00ce\7C\2\2"+
		"\u00ce\u00cf\7W\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7V\2\2\u00d1\u00d2"+
		"\7=\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7^\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6"+
		"\7P\2\2\u00d6\u00d7\7F\2\2\u00d7\u00d8\7a\2\2\u00d8\u00d9\7F\2\2\u00d9"+
		"\u00da\7G\2\2\u00da\u00db\7H\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\7W\2\2"+
		"\u00dd\u00de\7N\2\2\u00de\u00df\7V\2\2\u00df\u00e0\7=\2\2\u00e0\30\3\2"+
		"\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e3\7D\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5"+
		"\7I\2\2\u00e5\u00e6\7K\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8\7a\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00eb\5\'\24\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7=\2\2\u00ef\32\3\2\2\2\u00f0\u00f1\7^\2\2\u00f1\u00f2\7G\2\2\u00f2"+
		"\u00f3\7P\2\2\u00f3\u00f4\7F\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f7\3\2\2"+
		"\2\u00f6\u00f8\5\'\24\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7="+
		"\2\2\u00fc\34\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe\u00ff\7D\2\2\u00ff\u0100"+
		"\7G\2\2\u0100\u0101\7I\2\2\u0101\u0102\7K\2\2\u0102\u0103\7P\2\2\u0103"+
		"\u0104\7a\2\2\u0104\u0105\7E\2\2\u0105\u0106\7Q\2\2\u0106\u0107\7O\2\2"+
		"\u0107\u0108\7O\2\2\u0108\u0109\7G\2\2\u0109\u010a\7P\2\2\u010a\u010b"+
		"\7V\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5#\22\2\u010d\36\3\2\2\2\u010e"+
		"\u010f\7^\2\2\u010f\u0110\7G\2\2\u0110\u0111\7P\2\2\u0111\u0112\7F\2\2"+
		"\u0112\u0113\7a\2\2\u0113\u0114\7E\2\2\u0114\u0115\7Q\2\2\u0115\u0116"+
		"\7O\2\2\u0116\u0117\7O\2\2\u0117\u0118\7G\2\2\u0118\u0119\7P\2\2\u0119"+
		"\u011a\7V\2\2\u011a\u011b\3\2\2\2\u011b\u011c\5#\22\2\u011c \3\2\2\2\u011d"+
		"\u011f\7^\2\2\u011e\u0120\5-\27\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\"\3\2\2\2\u0121\u0123\5-\27\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0129\7=\2\2\u0125\u0128\5+\26\2\u0126"+
		"\u0128\5-\27\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012e\5)\25\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e$\3\2\2\2\u012f\u0134\5\61\31\2\u0130\u0133\5+\26\2\u0131\u0133"+
		"\5/\30\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\5\61\31\2\u0138&\3\2\2\2\u0139\u013a\n\2\2\2\u013a(\3"+
		"\2\2\2\u013b\u013c\7\17\2\2\u013c\u013f\7\f\2\2\u013d\u013f\t\3\2\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\25"+
		"\2\2\u0141*\3\2\2\2\u0142\u0144\5\'\24\2\u0143\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146,\3\2\2\2\u0147"+
		"\u0149\t\4\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b\27\2\2\u014d"+
		".\3\2\2\2\u014e\u014f\7.\2\2\u014f\60\3\2\2\2\u0150\u0151\7$\2\2\u0151"+
		"\62\3\2\2\2\17\2\u00ec\u00f9\u011f\u0122\u0127\u0129\u012d\u0132\u0134"+
		"\u013e\u0145\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}