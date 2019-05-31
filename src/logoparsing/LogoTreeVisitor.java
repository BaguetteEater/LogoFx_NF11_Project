package logoparsing;

import logogui.Log;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import javafx.scene.canvas.GraphicsContext;
import logogui.Traceur;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.FloatContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Double> exprs = new ParseTreeProperty<>();
	Stack<Integer> idxRepete = new Stack<>();
	Stack<SymbolTable> symbolTables = new Stack<>();
	Map<String, Procedure> listProc = new HashMap<>();
	Map<String, Fonction> listFonc = new HashMap<>();
	Procedure tmpProc;
	Fonction tmpFonc;
	ErrorHandler errorHandler = new ErrorHandler();

	public LogoTreeVisitor() {
		super();
	}

	public void initialize(GraphicsContext gc) {
		traceur = new Traceur();
		traceur.setGraphics(gc);
	}

	public void setExprValue(ParseTree node, double value) {
		exprs.put(node, value);
	}

	public double getExprValue(ParseTree node) {
		Double value = exprs.get(node);
		if (value == null) {
			throw new NullPointerException();
		}
		return value;
	}

	@Override
	public Integer visitAv(AvContext ctx) {
		try {
			Binome expr = evaluate(ctx.expr());
			if (expr._1 == 0) {
				traceur.avance(expr._2);
			} else {
				errorHandler.handle(expr._1);
				return 0;
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitTd(TdContext ctx) {
		try {
			Binome expr = evaluate(ctx.expr());
			if (expr._1 == 0) {
				traceur.td(expr._2);
			} else {
				errorHandler.handle(expr._1);
				return 0;
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitTg(TgContext ctx) {
		try {
			Binome expr = evaluate(ctx.expr());
			if (expr._1 == 0) {
				traceur.tg(expr._2);
			} else {
				errorHandler.handle(expr._1);
				return 0;
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitLc(LogoParser.LcContext ctx) {
		try {
			traceur.lc();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}


	@Override
	public Integer visitBc(LogoParser.BcContext ctx) {
		try {
			traceur.bc();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}


	@Override
	public Integer visitVe(LogoParser.VeContext ctx) {
		try {
			traceur.ve();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitRe(LogoParser.ReContext ctx) {
		try {
			Binome expr = evaluate(ctx.expr());
			if (expr._1 == 0) {
				traceur.recule(expr._2);
			} else {
				errorHandler.handle(expr._1);
				return 0;
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}


	@Override
	public Integer visitFpos(LogoParser.FposContext ctx) {
		try {
			Binome exprX = evaluate(ctx.expr(0));
			Binome exprY = evaluate(ctx.expr(1));
			if (exprX._1 == 0 && exprY._1 == 0) {
				traceur.fpos(exprX._2, exprY._2);
			} else
				if (exprX._1 == 0) {
					errorHandler.handle(exprY._1);
				} else {
					errorHandler.handle(exprY._1);
				}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitFcc(LogoParser.FccContext ctx) {
		try {
			Binome exprR = evaluate(ctx.expr());

			if (exprR._1 == 0) {
				traceur.fcc(exprR._2);
			} else
				errorHandler.handle(exprR._1);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitMult(LogoParser.MultContext ctx) {
		try {
			Binome exprR = evaluate(ctx.expr(0));
			Binome exprL = evaluate(ctx.expr(1));

			String ope = ctx.getChild(1).getText();

			if (exprR._1 == 0 && exprL._1 == 0) {
				if (ope.equals("*"))
					setExprValue(ctx, exprR._2 * exprL._2);
				else if (ope.equals("/"))
				{
					if (exprL._2 == 0) {
						return ErrorTypes.DivisionParZero.getCode();
					}
					setExprValue(ctx, exprR._2 / exprL._2);
				}
				else
					return ErrorTypes.SymboleNonReconnu.getCode();
			} else
				return exprR._1 == 0 ? exprL._1 : exprR._1;
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitSum(LogoParser.SumContext ctx) {
		try {
			Binome exprR = evaluate(ctx.expr(0));
			Binome exprL = evaluate(ctx.expr(1));

			String ope = ctx.getChild(1).getText();

			if (exprR._1 == 0 && exprL._1 == 0) {
				if (ope.equals("+"))
					setExprValue(ctx, exprR._2 + exprL._2);
				else if (ope.equals("-") && exprL._2 != 0)
					setExprValue(ctx, exprR._2 - exprL._2);
				else
					return ErrorTypes.SymboleNonReconnu.getCode();
			} else
				return exprR._1 == 0 ? exprL._1 : exprR._1;
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitParenthese(LogoParser.ParentheseContext ctx) {
		try {
			Binome expr = evaluate(ctx.expr());
			if (expr._1 == 0) {
				setExprValue(ctx, expr._2);
			} else {
				return expr._1;
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitHasard(LogoParser.HasardContext ctx){
		try{

			Binome expr = evaluate(ctx.expr());

			if(expr._1 == 0)
				setExprValue(ctx, Math.random()*expr._2);
			else
				return expr._1;

		} catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitCos(LogoParser.CosContext ctx){
		try {

			Binome expr = evaluate(ctx.expr());

			String ope = ctx.getChild(0).getText();

			if (expr._1 == 0) {
				if (ope.equals("cos("))
					setExprValue(ctx, Math.cos(Math.toRadians(expr._2)));
				else if (ope.equals("sin("))
					setExprValue(ctx, Math.sin(Math.toRadians(expr._2)));
				else
					return ErrorTypes.SymboleNonReconnu.getCode();
			} else
				return expr._1;
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitInf(LogoParser.InfContext ctx){

		Binome gauche = evaluate((ctx.expr(0)));
		Binome droite = evaluate((ctx.expr(1)));

		try {
			if (gauche._1 == 0 && droite._1 == 0) {
				if (gauche._2 < droite._2)
					setExprValue(ctx, 1);
				else
					setExprValue(ctx, 0);
			} else {
				return gauche._1 == 0 ? droite._1 : gauche._1;
			}

		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitSup(LogoParser.SupContext ctx){

		Binome gauche = evaluate((ctx.expr(0)));
		Binome droite = evaluate((ctx.expr(1)));

		try {
			if (gauche._1 == 0 && droite._1 == 0) {
				if (gauche._2 > droite._2)
					setExprValue(ctx, 1);
				else
					setExprValue(ctx, 0);
			} else {
				return gauche._1 == 0 ? droite._1 : gauche._1;
			}

		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitInfOrEqual(LogoParser.InfOrEqualContext ctx){

		Binome gauche = evaluate((ctx.expr(0)));
		Binome droite = evaluate((ctx.expr(1)));

		try {
			if (gauche._1 == 0 && droite._1 == 0) {
				if (gauche._2 <= droite._2)
					setExprValue(ctx, 1);
				else
					setExprValue(ctx, 0);
			} else {
				return gauche._1 == 0 ? droite._1 : gauche._1;
			}

		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitSupOrEqual(LogoParser.SupOrEqualContext ctx){

		Binome gauche = evaluate((ctx.expr(0)));
		Binome droite = evaluate((ctx.expr(1)));

		try {
			if (gauche._1 == 0 && droite._1 == 0) {
				if (gauche._2 >= droite._2)
					setExprValue(ctx, 1);
				else
					setExprValue(ctx, 0);
			} else {
				return gauche._1 == 0 ? droite._1 : gauche._1;
			}

		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitEqual(LogoParser.EqualContext ctx){

		Binome gauche = evaluate((ctx.expr(0)));
		Binome droite = evaluate((ctx.expr(1)));

		try {
			if (gauche._1 == 0 && droite._1 == 0) {
				if (gauche._2.equals(droite._2))
					setExprValue(ctx, 1);
				else
					setExprValue(ctx, 0);
			} else {
				return gauche._1 == 0 ? droite._1 : gauche._1;
			}

		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitDiff(LogoParser.DiffContext ctx){

		Binome gauche = evaluate((ctx.expr(0)));
		Binome droite = evaluate((ctx.expr(1)));

		try {
			if (gauche._1 == 0 && droite._1 == 0) {
				if (!gauche._2.equals(droite._2)){
					setExprValue(ctx, 1);
				}
				else
					setExprValue(ctx, 0);
			} else {
				return gauche._1 == 0 ? droite._1 : gauche._1;
			}

		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitRepete(LogoParser.RepeteContext ctx) {
		try {
			Binome exprFor = evaluate(ctx.expr());
			if (exprFor._1 == 0) {
				for (int i = 1; i <= exprFor._2; i++) {
				    idxRepete.push(i);
				    Integer listInstructErr = visit(ctx.liste_instructions());
				    idxRepete.pop();
					if (listInstructErr != 0) {
						errorHandler.handle(listInstructErr);
					}
				}
			} else {
				errorHandler.handle(exprFor._1);
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitIf(LogoParser.IfContext ctx){

		Binome expr = evaluate((ctx.expr()));
		Integer listInstructErr = 0;
		try {
			if(expr._1 == 0){
				if(expr._2 != 0){
					listInstructErr = visit(ctx.liste_instructions(0));
				} else if(ctx.liste_instructions().size() > 1){
					listInstructErr = visit(ctx.liste_instructions(1));
				}

				if(listInstructErr != 0)
					errorHandler.handle(listInstructErr);
			} else {
				errorHandler.handle(expr._1);
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer visitWhile(LogoParser.WhileContext ctx){
		try {
			Binome exprWhile = evaluate(ctx.expr());
			if (exprWhile._1 == 0) {
				while (exprWhile._2 != 0) {
					Integer listInstructErr = visit(ctx.liste_instructions());
					if (listInstructErr != 0) {
						errorHandler.handle(listInstructErr);
					}
					exprWhile = evaluate(ctx.expr());
				}
			} else {
				errorHandler.handle(exprWhile._1);
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

    @Override
    public Integer visitLoop(LogoParser.LoopContext ctx){
	    try {

	    	if (!idxRepete.empty()) {
				setExprValue(ctx, idxRepete.peek());
			} else {
	    		return ErrorTypes.LoopSansRepete.getCode();
			}

        } catch(NullPointerException ex){
	        ex.printStackTrace();
        }

	    return 0;
    }

    @Override
	public Integer visitReading(LogoParser.ReadingContext ctx){
		try {
			setExprValue(ctx, this.symbolTables.peek().getEntry(ctx.ID().toString()));
		} catch(NullPointerException ex) {
			return ErrorTypes.VariableNonDeclaree.getCode();
		}
		return 0;
	}

	@Override
	public Integer visitWriting(LogoParser.WritingContext ctx) {
		try {
			Binome expr = evaluate(ctx.expr());
			if (expr._1 == 0) {
				this.symbolTables.peek().addEntry(ctx.ID().toString(), expr._2);
			} else {
				errorHandler.handle(expr._1);
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

		return 0;
	}



	@Override
	public Integer visitFloat(FloatContext ctx) {
		String fText = ctx.FLOAT().getText();
		setExprValue(ctx, Float.parseFloat(fText));
		return 0;
	}

	@Override
	public Integer visitFunction(LogoParser.FunctionContext ctx) {

		if (ctx.retour_fonc() == null) {
			tmpProc = new Procedure();
			visit(ctx.liste_param());
			tmpProc.setListeInstruction(ctx.liste_instructions());
			listProc.put(ctx.ID().toString(), tmpProc);
		} else {
			tmpProc = new Fonction();
			visit(ctx.liste_param());
			tmpProc.setListeInstruction(ctx.liste_instructions());
			((Fonction)tmpProc).setRetour(ctx.retour_fonc());
			listFonc.put(ctx.ID().toString(), (Fonction)tmpProc);
		}
		return 0;
	}


	@Override
	public Integer visitListe_param(LogoParser.Liste_paramContext ctx) {
		List<String> listParam = new ArrayList<>();

		for(TerminalNode id : ctx.ID()){
			listParam.add(id.toString());
		}

		tmpProc.setListParams(listParam);

		return 0;
	}

	@Override
	public Integer visitProc(LogoParser.ProcContext ctx) {
		SymbolTable symbol = new SymbolTable();


		if (!listProc.containsKey(ctx.ID().toString())) {
			errorHandler.handle(ErrorTypes.ProcedureNonDeclaree.getCode());
		} else {
			int i = 0;
			if (listProc.get(ctx.ID().toString()).getListParams().size() != ctx.expr().size()) {
				errorHandler.handle(ErrorTypes.AriteNonRespectee.getCode());
			} else {

				for (String str: listProc.get(ctx.ID().toString()).getListParams()) {
					Binome param = evaluate((ctx.expr(i)));

					if (param._1 != 0) {
						errorHandler.handle(param._1);
					} else {

						symbol.addEntry(str, param._2);
					}
					i++;
				}
				symbolTables.push(symbol);
				Integer listInstructionsErr = visit( listProc.get(ctx.ID().toString()).getListeInstruction());
				if (listInstructionsErr != 0) {
					errorHandler.handle(listInstructionsErr);
				}
				symbolTables.pop();
			}

		}

		return 0;
	}

	@Override
	public Integer visitFonc(LogoParser.FoncContext ctx) {
		SymbolTable symbol = new SymbolTable();

		int i = 0;
		if (!listFonc.containsKey(ctx.ID().toString())) {
			return ErrorTypes.FonctionNonDeclaree.getCode();
		}

		if (listFonc.get(ctx.ID().toString()).getListParams().size() != ctx.expr().size()) {
			return ErrorTypes.AriteNonRespectee.getCode();
		}

		for (String str: listFonc.get(ctx.ID().toString()).getListParams()) {

			Binome param = evaluate((ctx.expr(i)));
			if (param._1 != 0) {
				return param._1;
			}
			symbol.addEntry(str, param._2);
			i++;
		}
		symbolTables.push(symbol);
		Integer listInstructionsErr = visit( listFonc.get(ctx.ID().toString()).getListeInstruction());
		if (listInstructionsErr != 0) {
			return listInstructionsErr;
		}

		Binome expr_retour = evaluate(listFonc.get(ctx.ID().toString()).getRetour());
		if (expr_retour._1 == 0) {
			setExprValue(ctx, expr_retour._2);
			symbolTables.pop();
			return 0;
		}
		symbolTables.pop();
		return expr_retour._1;

	}

	@Override
	public Integer visitRetour_fonc(LogoParser.Retour_foncContext ctx) {
		Binome expr = evaluate(ctx.expr());
		if (expr._1 == 0) {
			setExprValue(ctx, expr._2);
			return 0;
		}
		return expr._1;
	}

	@Override
	public Integer visitStore(LogoParser.StoreContext ctx) {
		return traceur.store();
	}

	@Override
	public  Integer visitMove(LogoParser.MoveContext ctx) {
		Integer moveErr = traceur.move();
		if (moveErr != 0){
			errorHandler.handle(moveErr);
		}
		return 0;
	}


	private Binome evaluate(ParseTree expr) {
		Binome res = new Binome();
		res._1 = visit(expr);
		res._2 = res._1 == 0 ? getExprValue(expr) : Double.POSITIVE_INFINITY;
		return res;
	}




	private class Binome {
		public Integer _1; // bilan
		public Double _2;  // valeur de l'expression si bilan = 0
	}
}
