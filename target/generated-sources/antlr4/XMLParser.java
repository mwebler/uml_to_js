// Generated from XMLParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLParser extends Parser {
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
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, 
		RULE_jsclass = 4, RULE_ownedattr = 5, RULE_ownedoper = 6, RULE_ownedparam = 7, 
		RULE_genericelem = 8, RULE_reference = 9, RULE_attribute = 10, RULE_a_xmiid = 11, 
		RULE_a_name = 12, RULE_a_visibility = 13, RULE_a_type = 14, RULE_a_datatype = 15, 
		RULE_a_return = 16, RULE_a_static = 17, RULE_a_general = 18, RULE_a_generic = 19, 
		RULE_chardata = 20, RULE_misc = 21;
	public static final String[] ruleNames = {
		"document", "prolog", "content", "element", "jsclass", "ownedattr", "ownedoper", 
		"ownedparam", "genericelem", "reference", "attribute", "a_xmiid", "a_name", 
		"a_visibility", "a_type", "a_datatype", "a_return", "a_static", "a_general", 
		"a_generic", "chardata", "misc"
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

	@Override
	public String getGrammarFileName() { return "XMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(44);
				prolog();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(47);
				misc();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			element();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(54);
				misc();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(XMLParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(XMLParser.SPECIAL_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitProlog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitProlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(XMLDeclOpen);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
				{
				{
				setState(61);
				attribute();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(SPECIAL_CLOSE);
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

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(XMLParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(XMLParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(XMLParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(XMLParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(XMLParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(XMLParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(69);
				chardata();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(72);
						element();
						}
						break;
					case EntityRef:
					case CharRef:
						{
						setState(73);
						reference();
						}
						break;
					case CDATA:
						{
						setState(74);
						match(CDATA);
						}
						break;
					case PI:
						{
						setState(75);
						match(PI);
						}
						break;
					case COMMENT:
						{
						setState(76);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(79);
						chardata();
						}
					}

					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
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

	public static class ElementContext extends ParserRuleContext {
		public JsclassContext jsclass() {
			return getRuleContext(JsclassContext.class,0);
		}
		public OwnedattrContext ownedattr() {
			return getRuleContext(OwnedattrContext.class,0);
		}
		public OwnedoperContext ownedoper() {
			return getRuleContext(OwnedoperContext.class,0);
		}
		public OwnedparamContext ownedparam() {
			return getRuleContext(OwnedparamContext.class,0);
		}
		public GenericelemContext genericelem() {
			return getRuleContext(GenericelemContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				jsclass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				ownedattr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				ownedoper();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				ownedparam();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				genericelem();
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

	public static class JsclassContext extends ParserRuleContext {
		public List<TerminalNode> PACKELEMEN() { return getTokens(XMLParser.PACKELEMEN); }
		public TerminalNode PACKELEMEN(int i) {
			return getToken(XMLParser.PACKELEMEN, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public JsclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterJsclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitJsclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitJsclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsclassContext jsclass() throws RecognitionException {
		JsclassContext _localctx = new JsclassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jsclass);
		int _la;
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(OPEN);
				setState(95);
				match(PACKELEMEN);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(96);
					attribute();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(CLOSE);
				setState(103);
				content();
				setState(104);
				match(OPEN);
				setState(105);
				match(SLASH);
				setState(106);
				match(PACKELEMEN);
				setState(107);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(OPEN);
				setState(110);
				match(PACKELEMEN);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(111);
					attribute();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(SLASH_CLOSE);
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

	public static class OwnedattrContext extends ParserRuleContext {
		public List<TerminalNode> OWNEDATTR() { return getTokens(XMLParser.OWNEDATTR); }
		public TerminalNode OWNEDATTR(int i) {
			return getToken(XMLParser.OWNEDATTR, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OwnedattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownedattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOwnedattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOwnedattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitOwnedattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnedattrContext ownedattr() throws RecognitionException {
		OwnedattrContext _localctx = new OwnedattrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ownedattr);
		int _la;
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(OPEN);
				setState(121);
				match(OWNEDATTR);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(122);
					attribute();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(CLOSE);
				setState(129);
				content();
				setState(130);
				match(OPEN);
				setState(131);
				match(SLASH);
				setState(132);
				match(OWNEDATTR);
				setState(133);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(OPEN);
				setState(136);
				match(OWNEDATTR);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(137);
					attribute();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(SLASH_CLOSE);
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

	public static class OwnedoperContext extends ParserRuleContext {
		public List<TerminalNode> OWNEDOPER() { return getTokens(XMLParser.OWNEDOPER); }
		public TerminalNode OWNEDOPER(int i) {
			return getToken(XMLParser.OWNEDOPER, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OwnedoperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownedoper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOwnedoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOwnedoper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitOwnedoper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnedoperContext ownedoper() throws RecognitionException {
		OwnedoperContext _localctx = new OwnedoperContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ownedoper);
		int _la;
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(OPEN);
				setState(147);
				match(OWNEDOPER);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(148);
					attribute();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(CLOSE);
				setState(155);
				content();
				setState(156);
				match(OPEN);
				setState(157);
				match(SLASH);
				setState(158);
				match(OWNEDOPER);
				setState(159);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(OPEN);
				setState(162);
				match(OWNEDOPER);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(163);
					attribute();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(SLASH_CLOSE);
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

	public static class OwnedparamContext extends ParserRuleContext {
		public List<TerminalNode> OWNEDPARAM() { return getTokens(XMLParser.OWNEDPARAM); }
		public TerminalNode OWNEDPARAM(int i) {
			return getToken(XMLParser.OWNEDPARAM, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OwnedparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownedparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOwnedparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOwnedparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitOwnedparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnedparamContext ownedparam() throws RecognitionException {
		OwnedparamContext _localctx = new OwnedparamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ownedparam);
		int _la;
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(OPEN);
				setState(173);
				match(OWNEDPARAM);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(174);
					attribute();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(CLOSE);
				setState(181);
				content();
				setState(182);
				match(OPEN);
				setState(183);
				match(SLASH);
				setState(184);
				match(OWNEDPARAM);
				setState(185);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(OPEN);
				setState(188);
				match(OWNEDPARAM);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(189);
					attribute();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(SLASH_CLOSE);
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

	public static class GenericelemContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(XMLParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(XMLParser.Name, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public GenericelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericelem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterGenericelem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitGenericelem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitGenericelem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericelemContext genericelem() throws RecognitionException {
		GenericelemContext _localctx = new GenericelemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_genericelem);
		int _la;
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(OPEN);
				setState(199);
				match(Name);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(200);
					attribute();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(CLOSE);
				setState(207);
				content();
				setState(208);
				match(OPEN);
				setState(209);
				match(SLASH);
				setState(210);
				match(Name);
				setState(211);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(OPEN);
				setState(214);
				match(Name);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << E_GENERAL) | (1L << Name))) != 0)) {
					{
					{
					setState(215);
					attribute();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(SLASH_CLOSE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(XMLParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(XMLParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class AttributeContext extends ParserRuleContext {
		public A_xmiidContext a_xmiid() {
			return getRuleContext(A_xmiidContext.class,0);
		}
		public A_nameContext a_name() {
			return getRuleContext(A_nameContext.class,0);
		}
		public A_visibilityContext a_visibility() {
			return getRuleContext(A_visibilityContext.class,0);
		}
		public A_typeContext a_type() {
			return getRuleContext(A_typeContext.class,0);
		}
		public A_datatypeContext a_datatype() {
			return getRuleContext(A_datatypeContext.class,0);
		}
		public A_returnContext a_return() {
			return getRuleContext(A_returnContext.class,0);
		}
		public A_staticContext a_static() {
			return getRuleContext(A_staticContext.class,0);
		}
		public A_generalContext a_general() {
			return getRuleContext(A_generalContext.class,0);
		}
		public A_genericContext a_generic() {
			return getRuleContext(A_genericContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case E_XMIID:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				a_xmiid();
				}
				break;
			case E_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				a_name();
				}
				break;
			case E_VISIBILITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				a_visibility();
				}
				break;
			case E_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				a_type();
				}
				break;
			case E_DATATYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				a_datatype();
				}
				break;
			case E_RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				a_return();
				}
				break;
			case E_STATIC:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				a_static();
				}
				break;
			case E_GENERAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				a_general();
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 9);
				{
				setState(234);
				a_generic();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class A_xmiidContext extends ParserRuleContext {
		public TerminalNode E_XMIID() { return getToken(XMLParser.E_XMIID, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_xmiidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_xmiid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_xmiid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_xmiid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_xmiid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_xmiidContext a_xmiid() throws RecognitionException {
		A_xmiidContext _localctx = new A_xmiidContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_a_xmiid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(E_XMIID);
			setState(238);
			match(EQUALS);
			setState(239);
			match(STRING);
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

	public static class A_nameContext extends ParserRuleContext {
		public TerminalNode E_NAME() { return getToken(XMLParser.E_NAME, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_nameContext a_name() throws RecognitionException {
		A_nameContext _localctx = new A_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_a_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(E_NAME);
			setState(242);
			match(EQUALS);
			setState(243);
			match(STRING);
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

	public static class A_visibilityContext extends ParserRuleContext {
		public TerminalNode E_VISIBILITY() { return getToken(XMLParser.E_VISIBILITY, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_visibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_visibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_visibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_visibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_visibilityContext a_visibility() throws RecognitionException {
		A_visibilityContext _localctx = new A_visibilityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_a_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(E_VISIBILITY);
			setState(246);
			match(EQUALS);
			setState(247);
			match(STRING);
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

	public static class A_typeContext extends ParserRuleContext {
		public TerminalNode E_TYPE() { return getToken(XMLParser.E_TYPE, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_typeContext a_type() throws RecognitionException {
		A_typeContext _localctx = new A_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_a_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(E_TYPE);
			setState(250);
			match(EQUALS);
			setState(251);
			match(STRING);
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

	public static class A_datatypeContext extends ParserRuleContext {
		public TerminalNode E_DATATYPE() { return getToken(XMLParser.E_DATATYPE, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_datatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_datatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_datatypeContext a_datatype() throws RecognitionException {
		A_datatypeContext _localctx = new A_datatypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_a_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(E_DATATYPE);
			setState(254);
			match(EQUALS);
			setState(255);
			match(STRING);
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

	public static class A_returnContext extends ParserRuleContext {
		public TerminalNode E_RETURN() { return getToken(XMLParser.E_RETURN, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_returnContext a_return() throws RecognitionException {
		A_returnContext _localctx = new A_returnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_a_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(E_RETURN);
			setState(258);
			match(EQUALS);
			setState(259);
			match(STRING);
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

	public static class A_staticContext extends ParserRuleContext {
		public TerminalNode E_STATIC() { return getToken(XMLParser.E_STATIC, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_staticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_static; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_static(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_static(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_static(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_staticContext a_static() throws RecognitionException {
		A_staticContext _localctx = new A_staticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_a_static);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(E_STATIC);
			setState(262);
			match(EQUALS);
			setState(263);
			match(STRING);
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

	public static class A_generalContext extends ParserRuleContext {
		public TerminalNode E_GENERAL() { return getToken(XMLParser.E_GENERAL, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_general; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_general(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_general(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_general(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_generalContext a_general() throws RecognitionException {
		A_generalContext _localctx = new A_generalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_a_general);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(E_GENERAL);
			setState(266);
			match(EQUALS);
			setState(267);
			match(STRING);
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

	public static class A_genericContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(XMLParser.Name, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public A_genericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_generic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterA_generic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitA_generic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitA_generic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_genericContext a_generic() throws RecognitionException {
		A_genericContext _localctx = new A_genericContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_a_generic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(Name);
			setState(270);
			match(EQUALS);
			setState(271);
			match(STRING);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(XMLParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(XMLParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(XMLParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(XMLParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(XMLParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0118\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\5\2\60\n\2\3\2"+
		"\7\2\63\n\2\f\2\16\2\66\13\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\7"+
		"\3A\n\3\f\3\16\3D\13\3\3\3\3\3\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\5\4P\n"+
		"\4\3\4\5\4S\n\4\7\4U\n\4\f\4\16\4X\13\4\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3"+
		"\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6s\n\6\f\6\16\6v\13\6\3\6\5\6y\n\6\3\7\3\7\3\7\7\7~\n\7\f\7\16"+
		"\7\u0081\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f"+
		"\7\16\7\u0090\13\7\3\7\5\7\u0093\n\7\3\b\3\b\3\b\7\b\u0098\n\b\f\b\16"+
		"\b\u009b\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f"+
		"\b\16\b\u00aa\13\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16"+
		"\t\u00b5\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c1\n\t\f"+
		"\t\16\t\u00c4\13\t\3\t\5\t\u00c7\n\t\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16"+
		"\n\u00cf\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00db\n\n\f"+
		"\n\16\n\u00de\13\n\3\n\5\n\u00e1\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00ee\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,\2\5\3\2\6\7\4\2\b\b\13\13\5\2\3\3\b\b  \u0127\2/\3\2\2\2\4>\3\2\2"+
		"\2\6H\3\2\2\2\b^\3\2\2\2\nx\3\2\2\2\f\u0092\3\2\2\2\16\u00ac\3\2\2\2\20"+
		"\u00c6\3\2\2\2\22\u00e0\3\2\2\2\24\u00e2\3\2\2\2\26\u00ed\3\2\2\2\30\u00ef"+
		"\3\2\2\2\32\u00f3\3\2\2\2\34\u00f7\3\2\2\2\36\u00fb\3\2\2\2 \u00ff\3\2"+
		"\2\2\"\u0103\3\2\2\2$\u0107\3\2\2\2&\u010b\3\2\2\2(\u010f\3\2\2\2*\u0113"+
		"\3\2\2\2,\u0115\3\2\2\2.\60\5\4\3\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2\2"+
		"\2\61\63\5,\27\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65\67\3\2\2\2\66\64\3\2\2\2\67;\5\b\5\28:\5,\27\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=;\3\2\2\2>B\7\n\2\2?A\5\26\f\2@?\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\31\2\2F\5\3"+
		"\2\2\2GI\5*\26\2HG\3\2\2\2HI\3\2\2\2IV\3\2\2\2JP\5\b\5\2KP\5\24\13\2L"+
		"P\7\4\2\2MP\7 \2\2NP\7\3\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2O"+
		"N\3\2\2\2PR\3\2\2\2QS\5*\26\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TO\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2Y_\5\n\6\2Z_\5\f\7"+
		"\2[_\5\16\b\2\\_\5\20\t\2]_\5\22\n\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\"+
		"\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\7\t\2\2ae\7\f\2\2bd\5\26\f\2cb\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\30\2\2ij\5\6\4"+
		"\2jk\7\t\2\2kl\7\33\2\2lm\7\f\2\2mn\7\30\2\2ny\3\2\2\2op\7\t\2\2pt\7\f"+
		"\2\2qs\5\26\f\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3"+
		"\2\2\2wy\7\32\2\2x`\3\2\2\2xo\3\2\2\2y\13\3\2\2\2z{\7\t\2\2{\177\7\r\2"+
		"\2|~\5\26\f\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\30\2\2\u0083\u0084"+
		"\5\6\4\2\u0084\u0085\7\t\2\2\u0085\u0086\7\33\2\2\u0086\u0087\7\r\2\2"+
		"\u0087\u0088\7\30\2\2\u0088\u0093\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008e"+
		"\7\r\2\2\u008b\u008d\5\26\f\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0093\7\32\2\2\u0092z\3\2\2\2\u0092\u0089\3\2\2\2\u0093"+
		"\r\3\2\2\2\u0094\u0095\7\t\2\2\u0095\u0099\7\16\2\2\u0096\u0098\5\26\f"+
		"\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\30\2\2"+
		"\u009d\u009e\5\6\4\2\u009e\u009f\7\t\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1"+
		"\7\16\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00ad\3\2\2\2\u00a3\u00a4\7\t\2\2"+
		"\u00a4\u00a8\7\16\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\7\32\2\2\u00ac\u0094\3\2\2\2\u00ac\u00a3\3"+
		"\2\2\2\u00ad\17\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\u00b3\7\17\2\2\u00b0"+
		"\u00b2\5\26\f\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\30\2\2\u00b7\u00b8\5\6\4\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\7"+
		"\33\2\2\u00ba\u00bb\7\17\2\2\u00bb\u00bc\7\30\2\2\u00bc\u00c7\3\2\2\2"+
		"\u00bd\u00be\7\t\2\2\u00be\u00c2\7\17\2\2\u00bf\u00c1\5\26\f\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7\32\2\2\u00c6\u00ae\3"+
		"\2\2\2\u00c6\u00bd\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9"+
		"\u00cd\7\36\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7"+
		"\t\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6\7\30\2\2"+
		"\u00d6\u00e1\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00dc\7\36\2\2\u00d9\u00db"+
		"\5\26\f\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1"+
		"\7\32\2\2\u00e0\u00c8\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e1\23\3\2\2\2\u00e2"+
		"\u00e3\t\2\2\2\u00e3\25\3\2\2\2\u00e4\u00ee\5\30\r\2\u00e5\u00ee\5\32"+
		"\16\2\u00e6\u00ee\5\34\17\2\u00e7\u00ee\5\36\20\2\u00e8\u00ee\5 \21\2"+
		"\u00e9\u00ee\5\"\22\2\u00ea\u00ee\5$\23\2\u00eb\u00ee\5&\24\2\u00ec\u00ee"+
		"\5(\25\2\u00ed\u00e4\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\27\3\2\2\2\u00ef\u00f0"+
		"\7\20\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\7\35\2\2\u00f2\31\3\2\2\2\u00f3"+
		"\u00f4\7\21\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00f6\7\35\2\2\u00f6\33\3\2"+
		"\2\2\u00f7\u00f8\7\22\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\7\35\2\2\u00fa"+
		"\35\3\2\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\7\35"+
		"\2\2\u00fe\37\3\2\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\7\34\2\2\u0101"+
		"\u0102\7\35\2\2\u0102!\3\2\2\2\u0103\u0104\7\25\2\2\u0104\u0105\7\34\2"+
		"\2\u0105\u0106\7\35\2\2\u0106#\3\2\2\2\u0107\u0108\7\26\2\2\u0108\u0109"+
		"\7\34\2\2\u0109\u010a\7\35\2\2\u010a%\3\2\2\2\u010b\u010c\7\27\2\2\u010c"+
		"\u010d\7\34\2\2\u010d\u010e\7\35\2\2\u010e\'\3\2\2\2\u010f\u0110\7\36"+
		"\2\2\u0110\u0111\7\34\2\2\u0111\u0112\7\35\2\2\u0112)\3\2\2\2\u0113\u0114"+
		"\t\3\2\2\u0114+\3\2\2\2\u0115\u0116\t\4\2\2\u0116-\3\2\2\2\33/\64;BHO"+
		"RV^etx\177\u008e\u0092\u0099\u00a8\u00ac\u00b3\u00c2\u00c6\u00cd\u00dc"+
		"\u00e0\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}