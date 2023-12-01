// Generated from VariaveisG.g4 by ANTLR 4.13.1

      import java.util.*;
      import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VariaveisGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, NUM=24, PV=25, 
		AC=26, FC=27, AP=28, FP=29, AB=30, FB=31, Op_atrib=32, WS=33;
	public static final int
		RULE_init = 0, RULE_declara = 1, RULE_tipo = 2, RULE_bloco = 3, RULE_cmd = 4, 
		RULE_cmdse = 5, RULE_comparacao = 6, RULE_cmdatrib = 7, RULE_cmdimpressao = 8, 
		RULE_cmdleitura = 9, RULE_cmdwhile = 10, RULE_cmdfor = 11, RULE_op = 12, 
		RULE_oprel = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "declara", "tipo", "bloco", "cmd", "cmdse", "comparacao", "cmdatrib", 
			"cmdimpressao", "cmdleitura", "cmdwhile", "cmdfor", "op", "oprel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'inteiro'", "'caracter'", "'flutuante'", 
			"'se'", "'entao'", "'senao'", "'imprima'", "'leia'", "'enquanto'", "'para'", 
			"'+'", "'-'", "'/'", "'*'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			null, null, "';'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUM", "PV", "AC", "FC", "AP", "FP", "AB", "FB", "Op_atrib", "WS"
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
	public String getGrammarFileName() { return "VariaveisG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	      Variavel x = new Variavel();
	      ControleVariavel cv = new ControleVariavel();
	      String saida="";
	      int escopo;
	      int tipo;
	      String nome;

	public VariaveisGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<DeclaraContext> declara() {
			return getRuleContexts(DeclaraContext.class);
		}
		public DeclaraContext declara(int i) {
			return getRuleContext(DeclaraContext.class,i);
		}
		public TerminalNode AB() { return getToken(VariaveisGParser.AB, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FB() { return getToken(VariaveisGParser.FB, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			declara();
			setState(29);
			match(T__0);
			setState(30);
			match(AB);
			saida += "public class Saida{\n";
			saida += "\tpublic static void main(String args[]){\n";
			setState(33);
			declara();
			setState(34);
			bloco();
			setState(35);
			match(FB);
			setState(36);
			match(T__1);
			saida += "\n\t}\n";
			saida += "}\n";
			System.out.println(saida);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaraContext extends ParserRuleContext {
		public Token ID;
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(VariaveisGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VariaveisGParser.ID, i);
		}
		public List<TerminalNode> PV() { return getTokens(VariaveisGParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(VariaveisGParser.PV, i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(41);
				tipo();
				setState(42);
				((DeclaraContext)_localctx).ID = match(ID);
				saida += (((DeclaraContext)_localctx).ID!=null?((DeclaraContext)_localctx).ID.getText():null);
				                        x = new Variavel((((DeclaraContext)_localctx).ID!=null?((DeclaraContext)_localctx).ID.getText():null), tipo, 0);
				                        boolean resultado = cv.adiciona(x);
				                        if(!resultado){
				                              System.out.println("A variavel "+x.getNome()+" ja foi declarada");
				                              System.exit(0);
				                        }
				                     
				setState(44);
				match(PV);
				saida += ";\n";
				}
				}
				setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(52);
				match(T__2);
				saida += "\tint ";
				                          tipo = 1;
				                         
				}
				break;
			case T__3:
				{
				setState(54);
				match(T__3);
				saida += "\tchar ";
				                          tipo = 2;
				                          
				}
				break;
			case T__4:
				{
				setState(56);
				match(T__4);
				saida += "\tfloat ";
				                          tipo = 3;
				                          
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8396352L) != 0)) {
				{
				{
				setState(60);
				cmd();
				}
				}
				setState(65);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdatribContext cmdatrib() {
			return getRuleContext(CmdatribContext.class,0);
		}
		public CmdseContext cmdse() {
			return getRuleContext(CmdseContext.class,0);
		}
		public CmdimpressaoContext cmdimpressao() {
			return getRuleContext(CmdimpressaoContext.class,0);
		}
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdwhileContext cmdwhile() {
			return getRuleContext(CmdwhileContext.class,0);
		}
		public CmdforContext cmdfor() {
			return getRuleContext(CmdforContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				cmdatrib();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				cmdse();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				cmdimpressao();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				cmdleitura();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				cmdwhile();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				cmdfor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdseContext extends ParserRuleContext {
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public List<TerminalNode> AB() { return getTokens(VariaveisGParser.AB); }
		public TerminalNode AB(int i) {
			return getToken(VariaveisGParser.AB, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> FB() { return getTokens(VariaveisGParser.FB); }
		public TerminalNode FB(int i) {
			return getToken(VariaveisGParser.FB, i);
		}
		public CmdseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmdse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmdse(this);
		}
	}

	public final CmdseContext cmdse() throws RecognitionException {
		CmdseContext _localctx = new CmdseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__5);

			      saida += "\n\tif (";
			      
			setState(76);
			comparacao();

			      saida += ")";
			      
			setState(78);
			match(T__6);
			setState(79);
			match(AB);

			      saida += "{\n\t";
			      
			setState(81);
			bloco();
			setState(82);
			match(FB);

			      saida += "\n\t}\n";      
			      
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(84);
				match(T__7);

				      saida += "else";
				      
				setState(86);
				match(AB);

				      saida += "{\n\t";
				      
				setState(88);
				bloco();
				setState(89);
				match(FB);

				      saida += "\n\t}\n";
				      
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(VariaveisGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VariaveisGParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(VariaveisGParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(VariaveisGParser.NUM, i);
		}
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitComparacao(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(94);
				((ComparacaoContext)_localctx).ID = match(ID);
				saida += (((ComparacaoContext)_localctx).ID!=null?((ComparacaoContext)_localctx).ID.getText():null);
				}
				break;
			case NUM:
				{
				setState(96);
				((ComparacaoContext)_localctx).NUM = match(NUM);
				saida += (((ComparacaoContext)_localctx).NUM!=null?((ComparacaoContext)_localctx).NUM.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100);
			oprel();
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(101);
				((ComparacaoContext)_localctx).ID = match(ID);
				saida += (((ComparacaoContext)_localctx).ID!=null?((ComparacaoContext)_localctx).ID.getText():null);
				}
				break;
			case NUM:
				{
				setState(103);
				((ComparacaoContext)_localctx).NUM = match(NUM);
				saida += (((ComparacaoContext)_localctx).NUM!=null?((ComparacaoContext)_localctx).NUM.getText():null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdatribContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public List<TerminalNode> ID() { return getTokens(VariaveisGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VariaveisGParser.ID, i);
		}
		public TerminalNode Op_atrib() { return getToken(VariaveisGParser.Op_atrib, 0); }
		public TerminalNode NUM() { return getToken(VariaveisGParser.NUM, 0); }
		public CmdatribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdatrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmdatrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmdatrib(this);
		}
	}

	public final CmdatribContext cmdatrib() throws RecognitionException {
		CmdatribContext _localctx = new CmdatribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdatrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((CmdatribContext)_localctx).ID = match(ID);
			Variavel var1 = cv.busca((((CmdatribContext)_localctx).ID!=null?((CmdatribContext)_localctx).ID.getText():null)); saida += (((CmdatribContext)_localctx).ID!=null?((CmdatribContext)_localctx).ID.getText():null);
			setState(109);
			match(Op_atrib);
			saida += " = ";
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(111);
				((CmdatribContext)_localctx).ID = match(ID);
				Variavel var2 = cv.busca((((CmdatribContext)_localctx).ID!=null?((CmdatribContext)_localctx).ID.getText():null));                  
				                   if(var1.getTipo()!=var2.getTipo()){
				                        System.out.println("Atribuição invalida");
				                        System.exit(0);
				                   }
				                saida += (((CmdatribContext)_localctx).ID!=null?((CmdatribContext)_localctx).ID.getText():null)+";\n\t";
				}
				break;
			case NUM:
				{
				setState(113);
				((CmdatribContext)_localctx).NUM = match(NUM);
				saida += (((CmdatribContext)_localctx).NUM!=null?((CmdatribContext)_localctx).NUM.getText():null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdimpressaoContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(VariaveisGParser.ID, 0); }
		public TerminalNode PV() { return getToken(VariaveisGParser.PV, 0); }
		public CmdimpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdimpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmdimpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmdimpressao(this);
		}
	}

	public final CmdimpressaoContext cmdimpressao() throws RecognitionException {
		CmdimpressaoContext _localctx = new CmdimpressaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdimpressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);

			      saida += "\tSystem.out.println(";
			      
			setState(119);
			((CmdimpressaoContext)_localctx).ID = match(ID);

			      saida+=(((CmdimpressaoContext)_localctx).ID!=null?((CmdimpressaoContext)_localctx).ID.getText():null)+")";
			      
			setState(121);
			match(PV);

			      saida += ";";
			      
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdleituraContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(VariaveisGParser.ID, 0); }
		public TerminalNode PV() { return getToken(VariaveisGParser.PV, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__9);

			            saida+="\tScanner sc = new Scanner(";
			            
			setState(126);
			((CmdleituraContext)_localctx).ID = match(ID);

			            saida+=(((CmdleituraContext)_localctx).ID!=null?((CmdleituraContext)_localctx).ID.getText():null)+")";
			            
			setState(128);
			match(PV);
			saida+=";\n";
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdwhileContext extends ParserRuleContext {
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public TerminalNode AB() { return getToken(VariaveisGParser.AB, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FB() { return getToken(VariaveisGParser.FB, 0); }
		public CmdwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmdwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmdwhile(this);
		}
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__10);

			      saida += "\twhile (";
			      
			setState(133);
			comparacao();

			      saida += "){\n\t";
			      
			setState(135);
			match(AB);
			setState(136);
			bloco();
			setState(137);
			match(FB);

			      saida += "\n\t}";
			      
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdforContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public TerminalNode AP() { return getToken(VariaveisGParser.AP, 0); }
		public CmdatribContext cmdatrib() {
			return getRuleContext(CmdatribContext.class,0);
		}
		public List<TerminalNode> PV() { return getTokens(VariaveisGParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(VariaveisGParser.PV, i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(VariaveisGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VariaveisGParser.ID, i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode FP() { return getToken(VariaveisGParser.FP, 0); }
		public TerminalNode AB() { return getToken(VariaveisGParser.AB, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FB() { return getToken(VariaveisGParser.FB, 0); }
		public TerminalNode NUM() { return getToken(VariaveisGParser.NUM, 0); }
		public CmdforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterCmdfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitCmdfor(this);
		}
	}

	public final CmdforContext cmdfor() throws RecognitionException {
		CmdforContext _localctx = new CmdforContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__11);
			setState(141);
			match(AP);

			      saida += "\tfor (";
			      
			setState(143);
			cmdatrib();
			setState(144);
			match(PV);

			      saida += "; ";
			      
			setState(146);
			comparacao();
			setState(147);
			match(PV);

			      saida += "; ";      
			      
			setState(149);
			((CmdforContext)_localctx).ID = match(ID);

			      saida+=(((CmdforContext)_localctx).ID!=null?((CmdforContext)_localctx).ID.getText():null);
			      
			setState(151);
			op();
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(152);
				((CmdforContext)_localctx).ID = match(ID);
				saida += (((CmdforContext)_localctx).ID!=null?((CmdforContext)_localctx).ID.getText():null);
				}
				break;
			case NUM:
				{
				setState(154);
				((CmdforContext)_localctx).NUM = match(NUM);
				saida += (((CmdforContext)_localctx).NUM!=null?((CmdforContext)_localctx).NUM.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			match(FP);
			setState(159);
			match(AB);

			      saida += ") {\n\t";
			      
			setState(161);
			bloco();
			setState(162);
			match(FB);

			      saida += "\n\t}";
			      
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(165);
				match(T__12);
				saida += " + ";
				}
				break;
			case T__13:
				{
				setState(167);
				match(T__13);
				saida += " - ";
				}
				break;
			case T__14:
				{
				setState(169);
				match(T__14);
				saida += " / ";
				}
				break;
			case T__15:
				{
				setState(171);
				match(T__15);
				saida += " * ";
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

	@SuppressWarnings("CheckReturnValue")
	public static class OprelContext extends ParserRuleContext {
		public OprelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).enterOprel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariaveisGListener ) ((VariaveisGListener)listener).exitOprel(this);
		}
	}

	public final OprelContext oprel() throws RecognitionException {
		OprelContext _localctx = new OprelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oprel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(175);
				match(T__16);
				saida += " > ";
				}
				break;
			case T__17:
				{
				setState(177);
				match(T__17);
				saida += " < ";
				}
				break;
			case T__18:
				{
				setState(179);
				match(T__18);
				saida += " >= ";
				}
				break;
			case T__19:
				{
				setState(181);
				match(T__19);
				saida += " <= ";
				}
				break;
			case T__20:
				{
				setState(183);
				match(T__20);
				saida += " == ";
				}
				break;
			case T__21:
				{
				setState(185);
				match(T__21);
				saida += " != ";
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

	public static final String _serializedATN =
		"\u0004\u0001!\u00be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0005\u0003>\b\u0003\n\u0003"+
		"\f\u0003A\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006j\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00bc\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u00c5\u0000\u001c\u0001"+
		"\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000"+
		"\u0000\u0006?\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nJ\u0001"+
		"\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000"+
		"\u0000\u0010u\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014"+
		"\u0083\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018"+
		"\u00ad\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e"+
		"\u001f\u0005\u001e\u0000\u0000\u001f \u0006\u0000\uffff\uffff\u0000 !"+
		"\u0006\u0000\uffff\uffff\u0000!\"\u0003\u0002\u0001\u0000\"#\u0003\u0006"+
		"\u0003\u0000#$\u0005\u001f\u0000\u0000$%\u0005\u0002\u0000\u0000%&\u0006"+
		"\u0000\uffff\uffff\u0000&\'\u0006\u0000\uffff\uffff\u0000\'(\u0006\u0000"+
		"\uffff\uffff\u0000(\u0001\u0001\u0000\u0000\u0000)*\u0003\u0004\u0002"+
		"\u0000*+\u0005\u0017\u0000\u0000+,\u0006\u0001\uffff\uffff\u0000,-\u0005"+
		"\u0019\u0000\u0000-.\u0006\u0001\uffff\uffff\u0000.0\u0001\u0000\u0000"+
		"\u0000/)\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000045\u0005\u0003\u0000\u00005;\u0006\u0002\uffff"+
		"\uffff\u000067\u0005\u0004\u0000\u00007;\u0006\u0002\uffff\uffff\u0000"+
		"89\u0005\u0005\u0000\u00009;\u0006\u0002\uffff\uffff\u0000:4\u0001\u0000"+
		"\u0000\u0000:6\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;\u0005"+
		"\u0001\u0000\u0000\u0000<>\u0003\b\u0004\u0000=<\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@\u0007\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BI\u0003"+
		"\u000e\u0007\u0000CI\u0003\n\u0005\u0000DI\u0003\u0010\b\u0000EI\u0003"+
		"\u0012\t\u0000FI\u0003\u0014\n\u0000GI\u0003\u0016\u000b\u0000HB\u0001"+
		"\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000"+
		"HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000I\t\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KL\u0006\u0005"+
		"\uffff\uffff\u0000LM\u0003\f\u0006\u0000MN\u0006\u0005\uffff\uffff\u0000"+
		"NO\u0005\u0007\u0000\u0000OP\u0005\u001e\u0000\u0000PQ\u0006\u0005\uffff"+
		"\uffff\u0000QR\u0003\u0006\u0003\u0000RS\u0005\u001f\u0000\u0000S\\\u0006"+
		"\u0005\uffff\uffff\u0000TU\u0005\b\u0000\u0000UV\u0006\u0005\uffff\uffff"+
		"\u0000VW\u0005\u001e\u0000\u0000WX\u0006\u0005\uffff\uffff\u0000XY\u0003"+
		"\u0006\u0003\u0000YZ\u0005\u001f\u0000\u0000Z[\u0006\u0005\uffff\uffff"+
		"\u0000[]\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^_\u0005\u0017\u0000\u0000"+
		"_c\u0006\u0006\uffff\uffff\u0000`a\u0005\u0018\u0000\u0000ac\u0006\u0006"+
		"\uffff\uffff\u0000b^\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000di\u0003\u001a\r\u0000ef\u0005\u0017\u0000\u0000"+
		"fj\u0006\u0006\uffff\uffff\u0000gh\u0005\u0018\u0000\u0000hj\u0006\u0006"+
		"\uffff\uffff\u0000ie\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"j\r\u0001\u0000\u0000\u0000kl\u0005\u0017\u0000\u0000lm\u0006\u0007\uffff"+
		"\uffff\u0000mn\u0005 \u0000\u0000ns\u0006\u0007\uffff\uffff\u0000op\u0005"+
		"\u0017\u0000\u0000pt\u0006\u0007\uffff\uffff\u0000qr\u0005\u0018\u0000"+
		"\u0000rt\u0006\u0007\uffff\uffff\u0000so\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005\t\u0000\u0000"+
		"vw\u0006\b\uffff\uffff\u0000wx\u0005\u0017\u0000\u0000xy\u0006\b\uffff"+
		"\uffff\u0000yz\u0005\u0019\u0000\u0000z{\u0006\b\uffff\uffff\u0000{\u0011"+
		"\u0001\u0000\u0000\u0000|}\u0005\n\u0000\u0000}~\u0006\t\uffff\uffff\u0000"+
		"~\u007f\u0005\u0017\u0000\u0000\u007f\u0080\u0006\t\uffff\uffff\u0000"+
		"\u0080\u0081\u0005\u0019\u0000\u0000\u0081\u0082\u0006\t\uffff\uffff\u0000"+
		"\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000b\u0000\u0000"+
		"\u0084\u0085\u0006\n\uffff\uffff\u0000\u0085\u0086\u0003\f\u0006\u0000"+
		"\u0086\u0087\u0006\n\uffff\uffff\u0000\u0087\u0088\u0005\u001e\u0000\u0000"+
		"\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008a\u0005\u001f\u0000\u0000"+
		"\u008a\u008b\u0006\n\uffff\uffff\u0000\u008b\u0015\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\f\u0000\u0000\u008d\u008e\u0005\u001c\u0000\u0000\u008e"+
		"\u008f\u0006\u000b\uffff\uffff\u0000\u008f\u0090\u0003\u000e\u0007\u0000"+
		"\u0090\u0091\u0005\u0019\u0000\u0000\u0091\u0092\u0006\u000b\uffff\uffff"+
		"\u0000\u0092\u0093\u0003\f\u0006\u0000\u0093\u0094\u0005\u0019\u0000\u0000"+
		"\u0094\u0095\u0006\u000b\uffff\uffff\u0000\u0095\u0096\u0005\u0017\u0000"+
		"\u0000\u0096\u0097\u0006\u000b\uffff\uffff\u0000\u0097\u009c\u0003\u0018"+
		"\f\u0000\u0098\u0099\u0005\u0017\u0000\u0000\u0099\u009d\u0006\u000b\uffff"+
		"\uffff\u0000\u009a\u009b\u0005\u0018\u0000\u0000\u009b\u009d\u0006\u000b"+
		"\uffff\uffff\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"\u001d\u0000\u0000\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u00a1\u0006"+
		"\u000b\uffff\uffff\u0000\u00a1\u00a2\u0003\u0006\u0003\u0000\u00a2\u00a3"+
		"\u0005\u001f\u0000\u0000\u00a3\u00a4\u0006\u000b\uffff\uffff\u0000\u00a4"+
		"\u0017\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\r\u0000\u0000\u00a6\u00ae"+
		"\u0006\f\uffff\uffff\u0000\u00a7\u00a8\u0005\u000e\u0000\u0000\u00a8\u00ae"+
		"\u0006\f\uffff\uffff\u0000\u00a9\u00aa\u0005\u000f\u0000\u0000\u00aa\u00ae"+
		"\u0006\f\uffff\uffff\u0000\u00ab\u00ac\u0005\u0010\u0000\u0000\u00ac\u00ae"+
		"\u0006\f\uffff\uffff\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0011\u0000\u0000\u00b0\u00bc\u0006\r\uffff\uffff\u0000\u00b1\u00b2"+
		"\u0005\u0012\u0000\u0000\u00b2\u00bc\u0006\r\uffff\uffff\u0000\u00b3\u00b4"+
		"\u0005\u0013\u0000\u0000\u00b4\u00bc\u0006\r\uffff\uffff\u0000\u00b5\u00b6"+
		"\u0005\u0014\u0000\u0000\u00b6\u00bc\u0006\r\uffff\uffff\u0000\u00b7\u00b8"+
		"\u0005\u0015\u0000\u0000\u00b8\u00bc\u0006\r\uffff\uffff\u0000\u00b9\u00ba"+
		"\u0005\u0016\u0000\u0000\u00ba\u00bc\u0006\r\uffff\uffff\u0000\u00bb\u00af"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b1\u0001\u0000\u0000\u0000\u00bb\u00b3"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u001b"+
		"\u0001\u0000\u0000\u0000\u000b1:?H\\bis\u009c\u00ad\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}