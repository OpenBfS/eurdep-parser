// Generated from de/bfs/eurdepparser/parser/eurdep/Eurdep.g4 by ANTLR 4.9.2
package de.bfs.eurdepparser.parser.eurdep;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EurdepParser extends Parser {
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
	public static final int
		RULE_eurdepfile = 0, RULE_eurdep_header = 1, RULE_section = 2, RULE_locality = 3, 
		RULE_radiological = 4, RULE_comment = 5, RULE_unknown_section = 6, RULE_radiological_content = 7, 
		RULE_default_section = 8, RULE_default_record = 9, RULE_field_list = 10, 
		RULE_header_field = 11, RULE_record = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"eurdepfile", "eurdep_header", "section", "locality", "radiological", 
			"comment", "unknown_section", "radiological_content", "default_section", 
			"default_record", "field_list", "header_field", "record"
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

	@Override
	public String getGrammarFileName() { return "Eurdep.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EurdepParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EurdepfileContext extends ParserRuleContext {
		public TerminalNode BEGINEURDEP() { return getToken(EurdepParser.BEGINEURDEP, 0); }
		public Eurdep_headerContext eurdep_header() {
			return getRuleContext(Eurdep_headerContext.class,0);
		}
		public TerminalNode ENDEURDEP() { return getToken(EurdepParser.ENDEURDEP, 0); }
		public LocalityContext locality() {
			return getRuleContext(LocalityContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public EurdepfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eurdepfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterEurdepfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitEurdepfile(this);
		}
	}

	public final EurdepfileContext eurdepfile() throws RecognitionException {
		EurdepfileContext _localctx = new EurdepfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eurdepfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(BEGINEURDEP);
			setState(27);
			eurdep_header();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGINLOCALITY) {
				{
				setState(28);
				locality();
				}
			}

			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINRADIOLOGICAL || _la==BEGINUNKOWN) {
				{
				{
				setState(31);
				section();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(ENDEURDEP);
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

	public static class Eurdep_headerContext extends ParserRuleContext {
		public TerminalNode BEGINHEADER() { return getToken(EurdepParser.BEGINHEADER, 0); }
		public TerminalNode ENDHEADER() { return getToken(EurdepParser.ENDHEADER, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<Header_fieldContext> header_field() {
			return getRuleContexts(Header_fieldContext.class);
		}
		public Header_fieldContext header_field(int i) {
			return getRuleContext(Header_fieldContext.class,i);
		}
		public Eurdep_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eurdep_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterEurdep_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitEurdep_header(this);
		}
	}

	public final Eurdep_headerContext eurdep_header() throws RecognitionException {
		Eurdep_headerContext _localctx = new Eurdep_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eurdep_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(BEGINHEADER);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGINCOMMENT:
					{
					setState(40);
					comment();
					}
					break;
				case LINE_BEGIN:
					{
					setState(41);
					header_field();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGINCOMMENT || _la==LINE_BEGIN );
			setState(46);
			match(ENDHEADER);
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

	public static class SectionContext extends ParserRuleContext {
		public Unknown_sectionContext unknown_section() {
			return getRuleContext(Unknown_sectionContext.class,0);
		}
		public RadiologicalContext radiological() {
			return getRuleContext(RadiologicalContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINUNKOWN:
				{
				setState(48);
				unknown_section();
				}
				break;
			case BEGINRADIOLOGICAL:
				{
				setState(49);
				radiological();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LocalityContext extends ParserRuleContext {
		public TerminalNode BEGINLOCALITY() { return getToken(EurdepParser.BEGINLOCALITY, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TerminalNode ENDLOCALITY() { return getToken(EurdepParser.ENDLOCALITY, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public LocalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterLocality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitLocality(this);
		}
	}

	public final LocalityContext locality() throws RecognitionException {
		LocalityContext _localctx = new LocalityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_locality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(BEGINLOCALITY);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINCOMMENT) {
				{
				{
				setState(53);
				comment();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			field_list();
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGINCOMMENT:
					{
					setState(60);
					comment();
					}
					break;
				case LINE_BEGIN:
					{
					setState(61);
					record();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGINCOMMENT || _la==LINE_BEGIN );
			setState(66);
			match(ENDLOCALITY);
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

	public static class RadiologicalContext extends ParserRuleContext {
		public TerminalNode BEGINRADIOLOGICAL() { return getToken(EurdepParser.BEGINRADIOLOGICAL, 0); }
		public Radiological_contentContext radiological_content() {
			return getRuleContext(Radiological_contentContext.class,0);
		}
		public TerminalNode ENDRADIOLOGICAL() { return getToken(EurdepParser.ENDRADIOLOGICAL, 0); }
		public RadiologicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radiological; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterRadiological(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitRadiological(this);
		}
	}

	public final RadiologicalContext radiological() throws RecognitionException {
		RadiologicalContext _localctx = new RadiologicalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_radiological);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BEGINRADIOLOGICAL);
			setState(69);
			radiological_content();
			setState(70);
			match(ENDRADIOLOGICAL);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode BEGINCOMMENT() { return getToken(EurdepParser.BEGINCOMMENT, 0); }
		public TerminalNode ENDCOMMENT() { return getToken(EurdepParser.ENDCOMMENT, 0); }
		public List<TerminalNode> STRING() { return getTokens(EurdepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EurdepParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EurdepParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EurdepParser.COMMA, i);
		}
		public List<TerminalNode> DQOUTE() { return getTokens(EurdepParser.DQOUTE); }
		public TerminalNode DQOUTE(int i) {
			return getToken(EurdepParser.DQOUTE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(EurdepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EurdepParser.NEWLINE, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(BEGINCOMMENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << STRING) | (1L << COMMA) | (1L << DQOUTE))) != 0)) {
				{
				{
				setState(73);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << STRING) | (1L << COMMA) | (1L << DQOUTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(ENDCOMMENT);
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

	public static class Unknown_sectionContext extends ParserRuleContext {
		public TerminalNode BEGINUNKOWN() { return getToken(EurdepParser.BEGINUNKOWN, 0); }
		public TerminalNode ENDUNKOWN() { return getToken(EurdepParser.ENDUNKOWN, 0); }
		public List<Field_listContext> field_list() {
			return getRuleContexts(Field_listContext.class);
		}
		public Field_listContext field_list(int i) {
			return getRuleContext(Field_listContext.class,i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public List<Default_sectionContext> default_section() {
			return getRuleContexts(Default_sectionContext.class);
		}
		public Default_sectionContext default_section(int i) {
			return getRuleContext(Default_sectionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Unknown_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterUnknown_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitUnknown_section(this);
		}
	}

	public final Unknown_sectionContext unknown_section() throws RecognitionException {
		Unknown_sectionContext _localctx = new Unknown_sectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unknown_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(BEGINUNKOWN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BEGINDEFAULT) | (1L << BEGINCOMMENT) | (1L << LINE_BEGIN))) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(82);
					field_list();
					}
					break;
				case LINE_BEGIN:
					{
					setState(83);
					record();
					}
					break;
				case BEGINDEFAULT:
					{
					setState(84);
					default_section();
					}
					break;
				case BEGINCOMMENT:
					{
					setState(85);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(ENDUNKOWN);
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

	public static class Radiological_contentContext extends ParserRuleContext {
		public List<Field_listContext> field_list() {
			return getRuleContexts(Field_listContext.class);
		}
		public Field_listContext field_list(int i) {
			return getRuleContext(Field_listContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<Default_sectionContext> default_section() {
			return getRuleContexts(Default_sectionContext.class);
		}
		public Default_sectionContext default_section(int i) {
			return getRuleContext(Default_sectionContext.class,i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public Radiological_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radiological_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterRadiological_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitRadiological_content(this);
		}
	}

	public final Radiological_contentContext radiological_content() throws RecognitionException {
		Radiological_contentContext _localctx = new Radiological_contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_radiological_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINCOMMENT) {
				{
				{
				setState(93);
				comment();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			field_list();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(104);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BEGINCOMMENT:
						{
						setState(100);
						comment();
						}
						break;
					case BEGINDEFAULT:
						{
						setState(101);
						default_section();
						}
						break;
					case LINE_BEGIN:
						{
						setState(102);
						record();
						}
						break;
					case T__0:
						{
						setState(103);
						field_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(109);
				field_list();
				}
				break;
			case LINE_BEGIN:
				{
				setState(110);
				record();
				}
				break;
			case ENDRADIOLOGICAL:
				break;
			default:
				break;
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

	public static class Default_sectionContext extends ParserRuleContext {
		public TerminalNode BEGINDEFAULT() { return getToken(EurdepParser.BEGINDEFAULT, 0); }
		public List<Default_recordContext> default_record() {
			return getRuleContexts(Default_recordContext.class);
		}
		public Default_recordContext default_record(int i) {
			return getRuleContext(Default_recordContext.class,i);
		}
		public TerminalNode ENDDEFAULT() { return getToken(EurdepParser.ENDDEFAULT, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Default_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterDefault_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitDefault_section(this);
		}
	}

	public final Default_sectionContext default_section() throws RecognitionException {
		Default_sectionContext _localctx = new Default_sectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_default_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BEGINDEFAULT);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINCOMMENT) {
				{
				{
				setState(114);
				comment();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			default_record();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINCOMMENT || _la==LINE_BEGIN) {
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGINCOMMENT:
					{
					setState(121);
					comment();
					}
					break;
				case LINE_BEGIN:
					{
					setState(122);
					default_record();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(ENDDEFAULT);
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

	public static class Default_recordContext extends ParserRuleContext {
		public TerminalNode LINE_BEGIN() { return getToken(EurdepParser.LINE_BEGIN, 0); }
		public List<TerminalNode> STRING() { return getTokens(EurdepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EurdepParser.STRING, i);
		}
		public TerminalNode LINE_END() { return getToken(EurdepParser.LINE_END, 0); }
		public Default_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterDefault_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitDefault_record(this);
		}
	}

	public final Default_recordContext default_record() throws RecognitionException {
		Default_recordContext _localctx = new Default_recordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_default_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LINE_BEGIN);
			setState(131);
			match(STRING);
			setState(132);
			match(STRING);
			setState(133);
			match(LINE_END);
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

	public static class Field_listContext extends ParserRuleContext {
		public TerminalNode LINE_END() { return getToken(EurdepParser.LINE_END, 0); }
		public List<TerminalNode> STRING() { return getTokens(EurdepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EurdepParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EurdepParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EurdepParser.COMMA, i);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterField_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitField_list(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(136);
				match(STRING);
				}
			}

			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				match(STRING);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(LINE_END);
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

	public static class Header_fieldContext extends ParserRuleContext {
		public TerminalNode LINE_BEGIN() { return getToken(EurdepParser.LINE_BEGIN, 0); }
		public List<TerminalNode> STRING() { return getTokens(EurdepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EurdepParser.STRING, i);
		}
		public TerminalNode LINE_END() { return getToken(EurdepParser.LINE_END, 0); }
		public Header_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterHeader_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitHeader_field(this);
		}
	}

	public final Header_fieldContext header_field() throws RecognitionException {
		Header_fieldContext _localctx = new Header_fieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_header_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LINE_BEGIN);
			setState(149);
			match(STRING);
			setState(150);
			match(STRING);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(151);
				match(STRING);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(LINE_END);
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

	public static class RecordContext extends ParserRuleContext {
		public TerminalNode LINE_BEGIN() { return getToken(EurdepParser.LINE_BEGIN, 0); }
		public TerminalNode LINE_END() { return getToken(EurdepParser.LINE_END, 0); }
		public List<TerminalNode> REMARK() { return getTokens(EurdepParser.REMARK); }
		public TerminalNode REMARK(int i) {
			return getToken(EurdepParser.REMARK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EurdepParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EurdepParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(EurdepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EurdepParser.STRING, i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EurdepListener ) ((EurdepListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_record);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LINE_BEGIN);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(161); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(160);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(163); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(165);
				match(REMARK);
				}
				break;
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REMARK) | (1L << STRING) | (1L << COMMA))) != 0)) {
				{
				{
				setState(168);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REMARK) | (1L << STRING) | (1L << COMMA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(LINE_END);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\5\6\5A\n\5\r\5\16\5"+
		"B\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\t\7\ta\n\t\f\t\16"+
		"\td\13\t\3\t\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\5\tr\n\t"+
		"\3\n\3\n\7\nv\n\n\f\n\16\ny\13\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u008c\n\f\3\f\3\f\7\f"+
		"\u0090\n\f\f\f\16\f\u0093\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009b\n\r\f"+
		"\r\16\r\u009e\13\r\3\r\3\r\3\16\3\16\6\16\u00a4\n\16\r\16\16\16\u00a5"+
		"\3\16\5\16\u00a9\n\16\3\16\7\16\u00ac\n\16\f\16\16\16\u00af\13\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\25\26\30\31"+
		"\5\2\24\24\26\26\30\30\2\u00c3\2\34\3\2\2\2\4)\3\2\2\2\6\64\3\2\2\2\b"+
		"\66\3\2\2\2\nF\3\2\2\2\fJ\3\2\2\2\16S\3\2\2\2\20b\3\2\2\2\22s\3\2\2\2"+
		"\24\u0084\3\2\2\2\26\u0089\3\2\2\2\30\u0096\3\2\2\2\32\u00a1\3\2\2\2\34"+
		"\35\7\4\2\2\35\37\5\4\3\2\36 \5\b\5\2\37\36\3\2\2\2\37 \3\2\2\2 $\3\2"+
		"\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$"+
		"\3\2\2\2\'(\7\5\2\2(\3\3\2\2\2),\7\6\2\2*-\5\f\7\2+-\5\30\r\2,*\3\2\2"+
		"\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\7\2\2\61"+
		"\5\3\2\2\2\62\65\5\16\b\2\63\65\5\n\6\2\64\62\3\2\2\2\64\63\3\2\2\2\65"+
		"\7\3\2\2\2\66:\7\b\2\2\679\5\f\7\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;=\3\2\2\2<:\3\2\2\2=@\5\26\f\2>A\5\f\7\2?A\5\32\16\2@>\3\2\2\2"+
		"@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\t\2\2E\t\3\2\2"+
		"\2FG\7\n\2\2GH\5\20\t\2HI\7\13\2\2I\13\3\2\2\2JN\7\20\2\2KM\t\2\2\2LK"+
		"\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\21\2\2"+
		"R\r\3\2\2\2SZ\7\16\2\2TY\5\26\f\2UY\5\32\16\2VY\5\22\n\2WY\5\f\7\2XT\3"+
		"\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]"+
		"\3\2\2\2\\Z\3\2\2\2]^\7\17\2\2^\17\3\2\2\2_a\5\f\7\2`_\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2el\5\26\f\2fk\5\f\7\2gk\5\22"+
		"\n\2hk\5\32\16\2ik\5\26\f\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2kn"+
		"\3\2\2\2lj\3\2\2\2lm\3\2\2\2mq\3\2\2\2nl\3\2\2\2or\5\26\f\2pr\5\32\16"+
		"\2qo\3\2\2\2qp\3\2\2\2qr\3\2\2\2r\21\3\2\2\2sw\7\f\2\2tv\5\f\7\2ut\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z\177\5\24\13\2"+
		"{~\5\f\7\2|~\5\24\13\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7"+
		"\r\2\2\u0083\23\3\2\2\2\u0084\u0085\7\22\2\2\u0085\u0086\7\26\2\2\u0086"+
		"\u0087\7\26\2\2\u0087\u0088\7\23\2\2\u0088\25\3\2\2\2\u0089\u008b\7\3"+
		"\2\2\u008a\u008c\7\26\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0091\3\2\2\2\u008d\u008e\7\30\2\2\u008e\u0090\7\26\2\2\u008f\u008d\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\23\2\2\u0095\27\3\2\2"+
		"\2\u0096\u0097\7\22\2\2\u0097\u0098\7\26\2\2\u0098\u009c\7\26\2\2\u0099"+
		"\u009b\7\26\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\23\2\2\u00a0\31\3\2\2\2\u00a1\u00a8\7\22\2\2\u00a2\u00a4\7\26"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\7\24\2\2\u00a8\u00a3\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa"+
		"\u00ac\t\3\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7\23\2\2\u00b1\33\3\2\2\2\32\37$,.\64:@BNXZbjlqw}\177\u008b\u0091"+
		"\u009c\u00a5\u00a8\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}