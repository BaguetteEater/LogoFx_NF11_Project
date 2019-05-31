/*
  * Created on 12 may. 2018
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import logoparsing.ErrorTypes;

import java.util.Stack;

public class Traceur {

	private class Position {
		private double posx, posy, angle;

		public Position(double posx, double posy, double angle) {
			this.posx = posx;
			this.posy = posy;
			this.angle = angle;
		}

		public double getAngle() {
			return angle;
		}

		public void setAngle(double angle) {
			this.angle = angle;
		}

		public double getPosx() {
			return posx;
		}

		public void setPosx(double posx) {
			this.posx = posx;
		}

		public double getPosy() {
			return posy;
		}

		public void setPosy(double posy) {
			this.posy = posy;
		}
	}
	
	private Color couleur;
	private double thickness = 1.0;
	private double initx = 200, inity = 350; // position initiale
	private double posx = initx, posy = inity; // position courante
	private boolean pencilDown = true;
	private Stack<Position> stackPosition= new Stack<>();
	
	private double angle = 90;
	private double teta;
	GraphicsContext gc;
	LogoGraphContext logoGraphContext = LogoGraphContext.getInstance();

	public Traceur() {
		setTeta();
		couleur = Color.BLACK;
	}

	public void setGraphics(GraphicsContext gc) {
		this.gc = gc;
		gc.setLineWidth(thickness);
	}

	private void setTeta() {
		teta = Math.toRadians(angle);
	}

	private void addLine(double x1, double y1, double x2, double y2) {
		if (pencilDown) {
			logoGraphContext.addLine(x1, y1, x2, y2, couleur);
		}
	}

	public void avance(double r) {
		double a = posx + r * Math.cos(teta);
		double b = posy - r * Math.sin(teta);
		addLine(posx, posy, a, b);
		posx = a;
		posy = b;
	}

	public void td(double r) {
		angle = (angle - r) % 360;
		setTeta();
	}

	public void tg(double r) {
		angle = (angle + r) % 360;
		setTeta();
	}

	public void lc() {
		pencilDown = false;
	}

	public void bc() {
		pencilDown = true;
	}

	public void recule(double r) {
		double a = posx - r * Math.cos(teta);
		double b = posy + r * Math.sin(teta);
		addLine(posx, posy, a, b);
		posx = a;
		posy = b;
	}

	public void fpos(double x, double y) {
		posx = x;
		posy = y;
	}

	public void fcc(double colorId) {
		switch (((int) colorId) % 8) {
			case 0:
				couleur = Color.BLACK;
				break;
			case 1:
				couleur = Color.RED;
				break;
			case 2:
				couleur = Color.GREEN;
				break;
			case 3:
				couleur = Color.YELLOW;
				break;
			case 4:
				couleur = Color.BLUE;
				break;
			case 5:
				couleur = Color.PURPLE;
				break;
			case 6:
				couleur = Color.LIGHTBLUE;
				break;
			case 7:
				couleur = Color.WHITE;
				break;
			default:
				break;
		}
	}

	public Integer store() {
		stackPosition.push(new Position(posx, posy, angle));
		return 0;
	}

	public Integer move() {
		if (!stackPosition.empty()) {
			Position savePosition = stackPosition.pop();
			posx = savePosition.posx;
			posy = savePosition.posy;
			angle = savePosition.angle;
			setTeta();
		} else {
			return ErrorTypes.MoveSansStore.getCode();
		}

		return 0;
	}

	

	public void ft(double r) {
		thickness = r;
		// gc.setLineWidth(thickness);
	}

	public void ve() {
		gc.clearRect(0, 0, 1000, 1000);
	}

}
