// Generated from VariaveisG.g4 by ANTLR 4.13.1

      import java.util.*;
      import java.util.Scanner;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VariaveisGParser}.
 */
public interface VariaveisGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(VariaveisGParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(VariaveisGParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(VariaveisGParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(VariaveisGParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(VariaveisGParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(VariaveisGParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(VariaveisGParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(VariaveisGParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(VariaveisGParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(VariaveisGParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmdse}.
	 * @param ctx the parse tree
	 */
	void enterCmdse(VariaveisGParser.CmdseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmdse}.
	 * @param ctx the parse tree
	 */
	void exitCmdse(VariaveisGParser.CmdseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(VariaveisGParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(VariaveisGParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmdatrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdatrib(VariaveisGParser.CmdatribContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmdatrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdatrib(VariaveisGParser.CmdatribContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmdimpressao}.
	 * @param ctx the parse tree
	 */
	void enterCmdimpressao(VariaveisGParser.CmdimpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmdimpressao}.
	 * @param ctx the parse tree
	 */
	void exitCmdimpressao(VariaveisGParser.CmdimpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(VariaveisGParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(VariaveisGParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdwhile(VariaveisGParser.CmdwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdwhile(VariaveisGParser.CmdwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#cmdfor}.
	 * @param ctx the parse tree
	 */
	void enterCmdfor(VariaveisGParser.CmdforContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#cmdfor}.
	 * @param ctx the parse tree
	 */
	void exitCmdfor(VariaveisGParser.CmdforContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(VariaveisGParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(VariaveisGParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariaveisGParser#oprel}.
	 * @param ctx the parse tree
	 */
	void enterOprel(VariaveisGParser.OprelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariaveisGParser#oprel}.
	 * @param ctx the parse tree
	 */
	void exitOprel(VariaveisGParser.OprelContext ctx);
}