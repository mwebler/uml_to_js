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
		CLOSE=21, SPECIAL_CLOSE=22, SLASH_CLOSE=23, SLASH=24, EQUALS=25, STRING=26, 
		Name=27, S=28, PI=29;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, 
		RULE_jsclass = 4, RULE_ownedattr = 5, RULE_ownedoper = 6, RULE_ownedparam = 7, 
		RULE_genericelem = 8, RULE_reference = 9, RULE_attribute = 10, RULE_a_xmiid = 11, 
		RULE_a_name = 12, RULE_a_visibility = 13, RULE_a_type = 14, RULE_a_datatype = 15, 
		RULE_a_return = 16, RULE_a_static = 17, RULE_a_generic = 18, RULE_chardata = 19, 
		RULE_misc = 20;
	public static final String[] ruleNames = {
		"document", "prolog", "content", "element", "jsclass", "ownedattr", "ownedoper", 
		"ownedparam", "genericelem", "reference", "attribute", "a_xmiid", "a_name", 
		"a_visibility", "a_type", "a_datatype", "a_return", "a_static", "a_generic", 
		"chardata", "misc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'<'", null, null, "'packagedElement'", 
		"'ownedAttribute'", "'ownedOperation'", "'ownedParameter'", "'xmi:id'", 
		"'name'", "'visibility'", "'xmi:type'", "'type'", "'direction'", "'isStatic'", 
		"'>'", null, "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
		"XMLDeclOpen", "TEXT", "PACKELEMEN", "OWNEDATTR", "OWNEDOPER", "OWNEDPARAM", 
		"E_XMIID", "E_NAME", "E_VISIBILITY", "E_TYPE", "E_DATATYPE", "E_RETURN", 
		"E_STATIC", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", 
		"STRING", "Name", "S", "PI"
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
			setState(43);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(42);
				prolog();
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(45);
				misc();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			element();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(52);
				misc();
				}
				}
				setState(57);
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
			setState(58);
			match(XMLDeclOpen);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
				{
				{
				setState(59);
				attribute();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(68);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(67);
				chardata();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(70);
						element();
						}
						break;
					case EntityRef:
					case CharRef:
						{
						setState(71);
						reference();
						}
						break;
					case CDATA:
						{
						setState(72);
						match(CDATA);
						}
						break;
					case PI:
						{
						setState(73);
						match(PI);
						}
						break;
					case COMMENT:
						{
						setState(74);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(78);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(77);
						chardata();
						}
					}

					}
					} 
				}
				setState(84);
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				jsclass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				ownedattr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				ownedoper();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				ownedparam();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
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
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(OPEN);
				setState(93);
				match(PACKELEMEN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(94);
					attribute();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(CLOSE);
				setState(101);
				content();
				setState(102);
				match(OPEN);
				setState(103);
				match(SLASH);
				setState(104);
				match(PACKELEMEN);
				setState(105);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(OPEN);
				setState(108);
				match(PACKELEMEN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(109);
					attribute();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
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
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(OPEN);
				setState(119);
				match(OWNEDATTR);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(120);
					attribute();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(CLOSE);
				setState(127);
				content();
				setState(128);
				match(OPEN);
				setState(129);
				match(SLASH);
				setState(130);
				match(OWNEDATTR);
				setState(131);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(OPEN);
				setState(134);
				match(OWNEDATTR);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(135);
					attribute();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
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
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(OPEN);
				setState(145);
				match(OWNEDOPER);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(146);
					attribute();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(CLOSE);
				setState(153);
				content();
				setState(154);
				match(OPEN);
				setState(155);
				match(SLASH);
				setState(156);
				match(OWNEDOPER);
				setState(157);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(OPEN);
				setState(160);
				match(OWNEDOPER);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(161);
					attribute();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
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
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(OPEN);
				setState(171);
				match(OWNEDPARAM);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(172);
					attribute();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(CLOSE);
				setState(179);
				content();
				setState(180);
				match(OPEN);
				setState(181);
				match(SLASH);
				setState(182);
				match(OWNEDPARAM);
				setState(183);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(OPEN);
				setState(186);
				match(OWNEDPARAM);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(187);
					attribute();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
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
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(OPEN);
				setState(197);
				match(Name);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(198);
					attribute();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(CLOSE);
				setState(205);
				content();
				setState(206);
				match(OPEN);
				setState(207);
				match(SLASH);
				setState(208);
				match(Name);
				setState(209);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(OPEN);
				setState(212);
				match(Name);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E_XMIID) | (1L << E_NAME) | (1L << E_VISIBILITY) | (1L << E_TYPE) | (1L << E_DATATYPE) | (1L << E_RETURN) | (1L << E_STATIC) | (1L << Name))) != 0)) {
					{
					{
					setState(213);
					attribute();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
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
			setState(222);
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
			setState(232);
			switch (_input.LA(1)) {
			case E_XMIID:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				a_xmiid();
				}
				break;
			case E_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				a_name();
				}
				break;
			case E_VISIBILITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				a_visibility();
				}
				break;
			case E_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				a_type();
				}
				break;
			case E_DATATYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				a_datatype();
				}
				break;
			case E_RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				a_return();
				}
				break;
			case E_STATIC:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				a_static();
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
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
			setState(234);
			match(E_XMIID);
			setState(235);
			match(EQUALS);
			setState(236);
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
			setState(238);
			match(E_NAME);
			setState(239);
			match(EQUALS);
			setState(240);
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
			setState(242);
			match(E_VISIBILITY);
			setState(243);
			match(EQUALS);
			setState(244);
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
			setState(246);
			match(E_TYPE);
			setState(247);
			match(EQUALS);
			setState(248);
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
			setState(250);
			match(E_DATATYPE);
			setState(251);
			match(EQUALS);
			setState(252);
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
			setState(254);
			match(E_RETURN);
			setState(255);
			match(EQUALS);
			setState(256);
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
			setState(258);
			match(E_STATIC);
			setState(259);
			match(EQUALS);
			setState(260);
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
		enterRule(_localctx, 36, RULE_a_generic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(Name);
			setState(263);
			match(EQUALS);
			setState(264);
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
		enterRule(_localctx, 38, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 40, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0111\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\7\3?\n\3\f\3\16"+
		"\3B\13\3\3\3\3\3\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\5\4Q\n"+
		"\4\7\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\7"+
		"\6b\n\6\f\6\16\6e\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6q\n"+
		"\6\f\6\16\6t\13\6\3\6\5\6w\n\6\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e"+
		"\13\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\7\b\u0096\n\b\f\b\16\b\u0099\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8"+
		"\13\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bf\n\t\f\t\16\t\u00c2"+
		"\13\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\n\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d9\n\n\f\n\16\n\u00dc"+
		"\13\n\3\n\5\n\u00df\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00eb\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\6\7\4\2\b\b\13\13\5\2\3\3\b"+
		"\b\37\37\u0120\2-\3\2\2\2\4<\3\2\2\2\6F\3\2\2\2\b\\\3\2\2\2\nv\3\2\2\2"+
		"\f\u0090\3\2\2\2\16\u00aa\3\2\2\2\20\u00c4\3\2\2\2\22\u00de\3\2\2\2\24"+
		"\u00e0\3\2\2\2\26\u00ea\3\2\2\2\30\u00ec\3\2\2\2\32\u00f0\3\2\2\2\34\u00f4"+
		"\3\2\2\2\36\u00f8\3\2\2\2 \u00fc\3\2\2\2\"\u0100\3\2\2\2$\u0104\3\2\2"+
		"\2&\u0108\3\2\2\2(\u010c\3\2\2\2*\u010e\3\2\2\2,.\5\4\3\2-,\3\2\2\2-."+
		"\3\2\2\2.\62\3\2\2\2/\61\5*\26\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2"+
		"\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\5\b\5\2\668\5*\26\2\67"+
		"\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<@\7\n"+
		"\2\2=?\5\26\f\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3"+
		"\2\2\2CD\7\30\2\2D\5\3\2\2\2EG\5(\25\2FE\3\2\2\2FG\3\2\2\2GT\3\2\2\2H"+
		"N\5\b\5\2IN\5\24\13\2JN\7\4\2\2KN\7\37\2\2LN\7\3\2\2MH\3\2\2\2MI\3\2\2"+
		"\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NP\3\2\2\2OQ\5(\25\2PO\3\2\2\2PQ\3\2\2"+
		"\2QS\3\2\2\2RM\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VT\3\2"+
		"\2\2W]\5\n\6\2X]\5\f\7\2Y]\5\16\b\2Z]\5\20\t\2[]\5\22\n\2\\W\3\2\2\2\\"+
		"X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\7\t\2\2_c\7\f"+
		"\2\2`b\5\26\f\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3"+
		"\2\2\2fg\7\27\2\2gh\5\6\4\2hi\7\t\2\2ij\7\32\2\2jk\7\f\2\2kl\7\27\2\2"+
		"lw\3\2\2\2mn\7\t\2\2nr\7\f\2\2oq\5\26\f\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uw\7\31\2\2v^\3\2\2\2vm\3\2\2\2w\13\3"+
		"\2\2\2xy\7\t\2\2y}\7\r\2\2z|\5\26\f\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\27\2\2\u0081\u0082"+
		"\5\6\4\2\u0082\u0083\7\t\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7\r\2\2"+
		"\u0085\u0086\7\27\2\2\u0086\u0091\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u008c"+
		"\7\r\2\2\u0089\u008b\5\26\f\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0091\7\31\2\2\u0090x\3\2\2\2\u0090\u0087\3\2\2\2\u0091"+
		"\r\3\2\2\2\u0092\u0093\7\t\2\2\u0093\u0097\7\16\2\2\u0094\u0096\5\26\f"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\27\2\2"+
		"\u009b\u009c\5\6\4\2\u009c\u009d\7\t\2\2\u009d\u009e\7\32\2\2\u009e\u009f"+
		"\7\16\2\2\u009f\u00a0\7\27\2\2\u00a0\u00ab\3\2\2\2\u00a1\u00a2\7\t\2\2"+
		"\u00a2\u00a6\7\16\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\7\31\2\2\u00aa\u0092\3\2\2\2\u00aa\u00a1\3"+
		"\2\2\2\u00ab\17\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00b1\7\17\2\2\u00ae"+
		"\u00b0\5\26\f\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7\27\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7"+
		"\32\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00c5\3\2\2\2"+
		"\u00bb\u00bc\7\t\2\2\u00bc\u00c0\7\17\2\2\u00bd\u00bf\5\26\f\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7\31\2\2\u00c4\u00ac\3"+
		"\2\2\2\u00c4\u00bb\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7"+
		"\u00cb\7\35\2\2\u00c8\u00ca\5\26\f\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\7"+
		"\t\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00d3\7\35\2\2\u00d3\u00d4\7\27\2\2"+
		"\u00d4\u00df\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00da\7\35\2\2\u00d7\u00d9"+
		"\5\26\f\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df"+
		"\7\31\2\2\u00de\u00c6\3\2\2\2\u00de\u00d5\3\2\2\2\u00df\23\3\2\2\2\u00e0"+
		"\u00e1\t\2\2\2\u00e1\25\3\2\2\2\u00e2\u00eb\5\30\r\2\u00e3\u00eb\5\32"+
		"\16\2\u00e4\u00eb\5\34\17\2\u00e5\u00eb\5\36\20\2\u00e6\u00eb\5 \21\2"+
		"\u00e7\u00eb\5\"\22\2\u00e8\u00eb\5$\23\2\u00e9\u00eb\5&\24\2\u00ea\u00e2"+
		"\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2"+
		"\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\7\33\2\2\u00ee"+
		"\u00ef\7\34\2\2\u00ef\31\3\2\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2\7\33"+
		"\2\2\u00f2\u00f3\7\34\2\2\u00f3\33\3\2\2\2\u00f4\u00f5\7\22\2\2\u00f5"+
		"\u00f6\7\33\2\2\u00f6\u00f7\7\34\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7\23"+
		"\2\2\u00f9\u00fa\7\33\2\2\u00fa\u00fb\7\34\2\2\u00fb\37\3\2\2\2\u00fc"+
		"\u00fd\7\24\2\2\u00fd\u00fe\7\33\2\2\u00fe\u00ff\7\34\2\2\u00ff!\3\2\2"+
		"\2\u0100\u0101\7\25\2\2\u0101\u0102\7\33\2\2\u0102\u0103\7\34\2\2\u0103"+
		"#\3\2\2\2\u0104\u0105\7\26\2\2\u0105\u0106\7\33\2\2\u0106\u0107\7\34\2"+
		"\2\u0107%\3\2\2\2\u0108\u0109\7\35\2\2\u0109\u010a\7\33\2\2\u010a\u010b"+
		"\7\34\2\2\u010b\'\3\2\2\2\u010c\u010d\t\3\2\2\u010d)\3\2\2\2\u010e\u010f"+
		"\t\4\2\2\u010f+\3\2\2\2\33-\629@FMPT\\crv}\u008c\u0090\u0097\u00a6\u00aa"+
		"\u00b1\u00c0\u00c4\u00cb\u00da\u00de\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}