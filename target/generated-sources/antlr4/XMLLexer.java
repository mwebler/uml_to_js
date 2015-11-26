// Generated from XMLLexer.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, PACKELEMEN=10, OWNEDATTR=11, OWNEDOPER=12, OWNEDPARAM=13, E_XMIID=14, 
		E_NAME=15, E_VISIBILITY=16, E_TYPE=17, E_DATATYPE=18, E_RETURN=19, E_STATIC=20, 
		E_GENERAL=21, CLOSE=22, SPECIAL_CLOSE=23, SLASH_CLOSE=24, SLASH=25, EQUALS=26, 
		STRING=27, Name=28, S=29, PI=30;
	public static final int INSIDE = 1;
	public static final int PROC_INSTR = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR"
	};

	public static final String[] ruleNames = {
		"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", "XMLDeclOpen", 
		"SPECIAL_OPEN", "TEXT", "PACKELEMEN", "OWNEDATTR", "OWNEDOPER", "OWNEDPARAM", 
		"E_XMIID", "E_NAME", "E_VISIBILITY", "E_TYPE", "E_DATATYPE", "E_RETURN", 
		"E_STATIC", "E_GENERAL", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "STRING", "Name", "S", "HEXDIGIT", "DIGIT", "NameChar", "NameStartChar", 
		"PI", "IGNORE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'<'", null, null, "'packagedElement'", 
		"'ownedAttribute'", "'ownedOperation'", "'ownedParameter'", "'xmi:id'", 
		"'name'", "'visibility'", "'xmi:type'", "'type'", "'direction'", "'isStatic'", 
		"'general'", "'>'", null, "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
		"XMLDeclOpen", "TEXT", "PACKELEMEN", "OWNEDATTR", "OWNEDOPER", "OWNEDPARAM", 
		"E_XMIID", "E_NAME", "E_VISIBILITY", "E_TYPE", "E_DATATYPE", "E_RETURN", 
		"E_STATIC", "E_GENERAL", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "STRING", "Name", "S", "PI"
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


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u017e\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\7\2T\n"+
		"\2\f\2\16\2W\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4u"+
		"\n\4\f\4\16\4x\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6"+
		"\6\u0086\n\6\r\6\16\6\u0087\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0091\n\6"+
		"\r\6\16\6\u0092\3\6\3\6\5\6\u0097\n\6\3\7\3\7\5\7\u009b\n\7\3\7\6\7\u009e"+
		"\n\7\r\7\16\7\u009f\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00b9\n\13\r\13\16\13"+
		"\u00ba\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\7\35\u014e\n\35\f\35\16\35\u0151\13\35\3\35\3\35\3\35\7\35\u0156\n\35"+
		"\f\35\16\35\u0159\13\35\3\35\5\35\u015c\n\35\3\36\3\36\7\36\u0160\n\36"+
		"\f\36\16\36\u0163\13\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3"+
		"\"\5\"\u0171\n\"\3#\5#\u0174\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\5Uiv\2&\5\3"+
		"\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\2\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37"+
		"A\2C\2E\2G\2I K\2\5\2\3\4\f\4\2\13\13\"\"\4\2((>>\4\2$$>>\4\2))>>\5\2"+
		"\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\u0188\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2"+
		"\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3"+
		"/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2"+
		"\2\3;\3\2\2\2\3=\3\2\2\2\3?\3\2\2\2\4I\3\2\2\2\4K\3\2\2\2\5M\3\2\2\2\7"+
		"\\\3\2\2\2\tp\3\2\2\2\13}\3\2\2\2\r\u0096\3\2\2\2\17\u009d\3\2\2\2\21"+
		"\u00a1\3\2\2\2\23\u00a5\3\2\2\2\25\u00af\3\2\2\2\27\u00b8\3\2\2\2\31\u00bc"+
		"\3\2\2\2\33\u00cc\3\2\2\2\35\u00db\3\2\2\2\37\u00ea\3\2\2\2!\u00f9\3\2"+
		"\2\2#\u0100\3\2\2\2%\u0105\3\2\2\2\'\u0110\3\2\2\2)\u0119\3\2\2\2+\u011e"+
		"\3\2\2\2-\u0128\3\2\2\2/\u0131\3\2\2\2\61\u0139\3\2\2\2\63\u013d\3\2\2"+
		"\2\65\u0142\3\2\2\2\67\u0147\3\2\2\29\u0149\3\2\2\2;\u015b\3\2\2\2=\u015d"+
		"\3\2\2\2?\u0164\3\2\2\2A\u0168\3\2\2\2C\u016a\3\2\2\2E\u0170\3\2\2\2G"+
		"\u0173\3\2\2\2I\u0175\3\2\2\2K\u017a\3\2\2\2MN\7>\2\2NO\7#\2\2OP\7/\2"+
		"\2PQ\7/\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2XY\7/\2\2YZ\7/\2\2Z[\7@\2\2[\6\3\2\2\2\\]\7>\2\2"+
		"]^\7#\2\2^_\7]\2\2_`\7E\2\2`a\7F\2\2ab\7C\2\2bc\7V\2\2cd\7C\2\2de\7]\2"+
		"\2ei\3\2\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2jl\3\2"+
		"\2\2ki\3\2\2\2lm\7_\2\2mn\7_\2\2no\7@\2\2o\b\3\2\2\2pq\7>\2\2qr\7#\2\2"+
		"rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2yz\7@\2\2z{\3\2\2\2{|\b\4\2\2|\n\3\2\2\2}~\7(\2\2~\177\5="+
		"\36\2\177\u0080\7=\2\2\u0080\f\3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083"+
		"\7%\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5C!\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\7=\2\2\u008a\u0097\3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d"+
		"\7%\2\2\u008d\u008e\7z\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5A \2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7=\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0081\3\2\2\2\u0096\u008b\3\2\2\2\u0097\16\3\2\2\2\u0098\u009e\t\2\2"+
		"\2\u0099\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\7\f\2\2\u009d\u0098\3\2\2\2\u009d\u009a\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\20\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\b\3\2"+
		"\u00a4\22\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7A\2\2\u00a7\u00a8\7"+
		"z\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\5?\37\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\t\3\2\u00ae\24\3\2\2"+
		"\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7A\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\5=\36\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\n\4\2\u00b5\u00b6\b\n\5\2\u00b6"+
		"\26\3\2\2\2\u00b7\u00b9\n\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\30\3\2\2\2\u00bc\u00bd"+
		"\7r\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7m\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7f\2\2"+
		"\u00c4\u00c5\7G\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7o\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\32\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7y\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d3\7v\2\2"+
		"\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7"+
		"\7d\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\34\3\2\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7r\2\2"+
		"\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\36\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7R\2\2\u00f0\u00f1\7c\2\2"+
		"\u00f1\u00f2\7t\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		" \3\2\2\2\u00f9\u00fa\7z\2\2\u00fa\u00fb\7o\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7<\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7f\2\2\u00ff\"\3\2\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7c\2\2\u0102\u0103\7o\2\2\u0103\u0104\7g\2\2"+
		"\u0104$\3\2\2\2\u0105\u0106\7x\2\2\u0106\u0107\7k\2\2\u0107\u0108\7u\2"+
		"\2\u0108\u0109\7k\2\2\u0109\u010a\7d\2\2\u010a\u010b\7k\2\2\u010b\u010c"+
		"\7n\2\2\u010c\u010d\7k\2\2\u010d\u010e\7v\2\2\u010e\u010f\7{\2\2\u010f"+
		"&\3\2\2\2\u0110\u0111\7z\2\2\u0111\u0112\7o\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7<\2\2\u0114\u0115\7v\2\2\u0115\u0116\7{\2\2\u0116\u0117\7r\2\2"+
		"\u0117\u0118\7g\2\2\u0118(\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b\7{\2"+
		"\2\u011b\u011c\7r\2\2\u011c\u011d\7g\2\2\u011d*\3\2\2\2\u011e\u011f\7"+
		"f\2\2\u011f\u0120\7k\2\2\u0120\u0121\7t\2\2\u0121\u0122\7g\2\2\u0122\u0123"+
		"\7e\2\2\u0123\u0124\7v\2\2\u0124\u0125\7k\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7p\2\2\u0127,\3\2\2\2\u0128\u0129\7k\2\2\u0129\u012a\7u\2\2\u012a"+
		"\u012b\7U\2\2\u012b\u012c\7v\2\2\u012c\u012d\7c\2\2\u012d\u012e\7v\2\2"+
		"\u012e\u012f\7k\2\2\u012f\u0130\7e\2\2\u0130.\3\2\2\2\u0131\u0132\7i\2"+
		"\2\u0132\u0133\7g\2\2\u0133\u0134\7p\2\2\u0134\u0135\7g\2\2\u0135\u0136"+
		"\7t\2\2\u0136\u0137\7c\2\2\u0137\u0138\7n\2\2\u0138\60\3\2\2\2\u0139\u013a"+
		"\7@\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\30\6\2\u013c\62\3\2\2\2\u013d"+
		"\u013e\7A\2\2\u013e\u013f\7@\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\31"+
		"\6\2\u0141\64\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7@\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\b\32\6\2\u0146\66\3\2\2\2\u0147\u0148\7\61\2\2\u0148"+
		"8\3\2\2\2\u0149\u014a\7?\2\2\u014a:\3\2\2\2\u014b\u014f\7$\2\2\u014c\u014e"+
		"\n\4\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u015c\7$"+
		"\2\2\u0153\u0157\7)\2\2\u0154\u0156\n\5\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7)\2\2\u015b\u014b\3\2\2\2\u015b"+
		"\u0153\3\2\2\2\u015c<\3\2\2\2\u015d\u0161\5G#\2\u015e\u0160\5E\"\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162>\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\t\6\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\b\37\2\2\u0167@\3\2\2\2\u0168\u0169\t\7\2\2\u0169"+
		"B\3\2\2\2\u016a\u016b\t\b\2\2\u016bD\3\2\2\2\u016c\u0171\5G#\2\u016d\u0171"+
		"\t\t\2\2\u016e\u0171\5C!\2\u016f\u0171\t\n\2\2\u0170\u016c\3\2\2\2\u0170"+
		"\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171F\3\2\2\2"+
		"\u0172\u0174\t\13\2\2\u0173\u0172\3\2\2\2\u0174H\3\2\2\2\u0175\u0176\7"+
		"A\2\2\u0176\u0177\7@\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b$\6\2\u0179"+
		"J\3\2\2\2\u017a\u017b\13\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b%\4\2"+
		"\u017dL\3\2\2\2\25\2\3\4Uiv\u0087\u0092\u0096\u009a\u009d\u009f\u00ba"+
		"\u014f\u0157\u015b\u0161\u0170\u0173\7\b\2\2\7\3\2\5\2\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}