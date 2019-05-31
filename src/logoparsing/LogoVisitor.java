// Generated from grammar/Logo.g4 by ANTLR 4.7.1
		
  package logoparsing;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_fonctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_fonctions(LogoParser.Liste_fonctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_param(LogoParser.Liste_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#retour_fonc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetour_fonc(LogoParser.Retour_foncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LogoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepete(LogoParser.RepeteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LogoParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LogoParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAv(LogoParser.AvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(LogoParser.TdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTg(LogoParser.TgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLc(LogoParser.LcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBc(LogoParser.BcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVe(LogoParser.VeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code re}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(LogoParser.ReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fpos}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpos(LogoParser.FposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fcc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcc(LogoParser.FccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writing}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriting(LogoParser.WritingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code proc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(LogoParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code store}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore(LogoParser.StoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code move}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(LogoParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inf}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInf(LogoParser.InfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LogoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infOrEqual}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfOrEqual(LogoParser.InfOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(LogoParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reading}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReading(LogoParser.ReadingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(LogoParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diff}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiff(LogoParser.DiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LogoParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fonc}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonc(LogoParser.FoncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sup}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSup(LogoParser.SupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(LogoParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LogoParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasard(LogoParser.HasardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supOrEqual}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupOrEqual(LogoParser.SupOrEqualContext ctx);
}