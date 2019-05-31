// Generated from Logo.g4 by ANTLR 4.4
		
  package logoparsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, FLOAT=9, 
		WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'av'", "'('", "')'", "'*'", "'+'", "'td'", "'-'", 
		"FLOAT", "WS"
	};
	public static final int
		RULE_programme = 0, RULE_liste_instructions = 1, RULE_instruction = 2, 
		RULE_expr = 3;
	public static final String[] ruleNames = {
		"programme", "liste_instructions", "instruction", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammeContext extends ParserRuleContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); liste_instructions();
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

	public static class Liste_instructionsContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public Liste_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterListe_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitListe_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitListe_instructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Liste_instructionsContext liste_instructions() throws RecognitionException {
		Liste_instructionsContext _localctx = new Liste_instructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_liste_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); instruction();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==T__1 );
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TdContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TdContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AvContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(19);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new AvContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15); match(T__6);
				setState(16); expr(0);
				}
				break;
			case T__1:
				_localctx = new TdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17); match(T__1);
				setState(18); expr(0);
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
	public static class MultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentheseContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentheseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterParenthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitParenthese(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitParenthese(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LogoParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFloat(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22); match(FLOAT);
				}
				break;
			case T__5:
				{
				_localctx = new ParentheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); match(T__5);
				setState(24); expr(0);
				setState(25); match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(30);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(31); expr(3);
						}
						break;
					case 2:
						{
						_localctx = new SumContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(32);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(33);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(34); expr(2);
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\6\3\16\n\3\r\3\16\3\17\3\4\3\4\3\4\3\4"+
		"\5\4\26\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\36\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5&\n\5\f\5\16\5)\13\5\3\5\2\3\b\6\2\4\6\b\2\4\4\2\3\3\7\7\4\2\b\b\n"+
		"\n+\2\n\3\2\2\2\4\r\3\2\2\2\6\25\3\2\2\2\b\35\3\2\2\2\n\13\5\4\3\2\13"+
		"\3\3\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3"+
		"\2\2\2\20\5\3\2\2\2\21\22\7\4\2\2\22\26\5\b\5\2\23\24\7\t\2\2\24\26\5"+
		"\b\5\2\25\21\3\2\2\2\25\23\3\2\2\2\26\7\3\2\2\2\27\30\b\5\1\2\30\36\7"+
		"\13\2\2\31\32\7\5\2\2\32\33\5\b\5\2\33\34\7\6\2\2\34\36\3\2\2\2\35\27"+
		"\3\2\2\2\35\31\3\2\2\2\36\'\3\2\2\2\37 \f\4\2\2 !\t\2\2\2!&\5\b\5\5\""+
		"#\f\3\2\2#$\t\3\2\2$&\5\b\5\4%\37\3\2\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(\t\3\2\2\2)\'\3\2\2\2\7\17\25\35%\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}