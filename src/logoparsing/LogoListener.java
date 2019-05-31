// Generated from grammar/Logo.g4 by ANTLR 4.7.1
		
  package logoparsing;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_fonctions}.
	 * @param ctx the parse tree
	 */
	void enterListe_fonctions(LogoParser.Liste_fonctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_fonctions}.
	 * @param ctx the parse tree
	 */
	void exitListe_fonctions(LogoParser.Liste_fonctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_param}.
	 * @param ctx the parse tree
	 */
	void enterListe_param(LogoParser.Liste_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_param}.
	 * @param ctx the parse tree
	 */
	void exitListe_param(LogoParser.Liste_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#retour_fonc}.
	 * @param ctx the parse tree
	 */
	void enterRetour_fonc(LogoParser.Retour_foncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#retour_fonc}.
	 * @param ctx the parse tree
	 */
	void exitRetour_fonc(LogoParser.Retour_foncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LogoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LogoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRepete(LogoParser.RepeteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRepete(LogoParser.RepeteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LogoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LogoParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIf(LogoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIf(LogoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAv(LogoParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAv(LogoParser.AvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTd(LogoParser.TdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTd(LogoParser.TdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTg(LogoParser.TgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTg(LogoParser.TgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLc(LogoParser.LcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLc(LogoParser.LcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBc(LogoParser.BcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBc(LogoParser.BcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVe(LogoParser.VeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVe(LogoParser.VeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code re}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRe(LogoParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRe(LogoParser.ReContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fpos}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFpos(LogoParser.FposContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fpos}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFpos(LogoParser.FposContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fcc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFcc(LogoParser.FccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fcc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFcc(LogoParser.FccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writing}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWriting(LogoParser.WritingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writing}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWriting(LogoParser.WritingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code proc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterProc(LogoParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code proc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitProc(LogoParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code store}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterStore(LogoParser.StoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code store}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitStore(LogoParser.StoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code move}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMove(LogoParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code move}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMove(LogoParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inf}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInf(LogoParser.InfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inf}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInf(LogoParser.InfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(LogoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(LogoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infOrEqual}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfOrEqual(LogoParser.InfOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infOrEqual}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfOrEqual(LogoParser.InfOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cos}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCos(LogoParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCos(LogoParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reading}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReading(LogoParser.ReadingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reading}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReading(LogoParser.ReadingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSum(LogoParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSum(LogoParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diff}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiff(LogoParser.DiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diff}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiff(LogoParser.DiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LogoParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LogoParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fonc}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFonc(LogoParser.FoncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fonc}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFonc(LogoParser.FoncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sup}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSup(LogoParser.SupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sup}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSup(LogoParser.SupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(LogoParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(LogoParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LogoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LogoParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterHasard(LogoParser.HasardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitHasard(LogoParser.HasardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supOrEqual}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSupOrEqual(LogoParser.SupOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supOrEqual}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSupOrEqual(LogoParser.SupOrEqualContext ctx);
}