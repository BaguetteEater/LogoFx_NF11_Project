package logogui;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Quadruplet {
	public Paint color = Color.BLACK;
	public double x1;
	public double y1;
	public double x2;
	public double y2;

	public Quadruplet(double x1, double y1, double x2, double y2, Paint color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}

}
