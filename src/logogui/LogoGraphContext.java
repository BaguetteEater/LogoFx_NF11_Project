package logogui;

import java.util.concurrent.ConcurrentLinkedQueue;

import javafx.concurrent.Task;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class LogoGraphContext {
	// Pause entre 2 accès à la queue des lignes
	private int thread_sleep = 100;
	private static LogoGraphContext logoGraphContext;
	// Queue où sont placés les quadruplets pour les tracés
	ConcurrentLinkedQueue<Quadruplet> lineQueue = new ConcurrentLinkedQueue<>();
	// GraphicsContext associé au canvas de l'interface graphique
	GraphicsContext gclocal;

	public static LogoGraphContext getInstance() {
		return logoGraphContext;
	}

	public static void build(GraphicsContext gclocal) {
		logoGraphContext = new LogoGraphContext(gclocal);
	}

	private LogoGraphContext(GraphicsContext gclocal) {
		this.gclocal = gclocal;
		// Lance la tâche qui effectue les tracés à partir des quadruplets de la queue
		DrawTask consumerTask = new DrawTask();
		Thread consumerThread = new Thread(consumerTask);
		consumerThread.setDaemon(true);
		// start polling the Queue
		consumerThread.start();
	}
/**
 * Ajoute un quadruplet dans la queue
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 * @param color
 */
	public void addLine(double x1, double y1, double x2, double y2, Paint color) {
		Quadruplet qp = new Quadruplet(x1, y1, x2, y2, color);
		lineQueue.add(qp);
	}

	public void stop() {
		lineQueue.clear();
	}
	public void setThreadSleep(int mstime) {
		thread_sleep = mstime;
	}
	
	public String getThreadSleep() {
		return String.valueOf(thread_sleep);
	}

	private class DrawTask extends Task<Void> {

		@Override
		protected Void call() throws Exception {
			while (true) {
				Quadruplet qp = lineQueue.poll();

				if (qp != null) {
					// Platform.runLater(() -> {
					// System.out.println("poll");
					gclocal.setStroke(qp.color);
					gclocal.strokeLine(qp.x1, qp.y1, qp.x2, qp.y2);

					try {
						Thread.sleep(thread_sleep);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// });
				}
			}
		}
	}
}
