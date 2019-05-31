package logogui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javafx.concurrent.Task;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import logoparsing.LogoLexer;
import logoparsing.LogoParser;
import logoparsing.LogoParser.ProgrammeContext;
import logoparsing.LogoTreeVisitor;

public class LogoController {
	private static int W = 900, H = 500;
//	@FXML
//	BorderPane astPane;
	@FXML
	Slider scaleSlider;
	@FXML
	TextArea program, logarea;
	@FXML
	Button run, clrview, clrlog, stop;
	@FXML AnchorPane view;
	@FXML TabPane resultPane;
	@FXML SwingNode swingNode;
	@FXML Canvas canvas;
	@FXML TextField sleep;
	private JPanel jTreeViewPane = null; // pane for tree and slider
	private JScrollPane jScrollASTPane = null; // panel with AST tree
	private TreeViewer viewer = null;
	
	LogoGraphContext logoGraphContext;
    
	public void initialize() {
		createSwingContent();
		Log.getInstance().setLogZone(logarea);
		canvas.setWidth(1000);
		canvas.setHeight(1000);
		// Construit l'instance qui gère l'affichage progressif des tracés
		// dans le canvas
		LogoGraphContext.build(canvas.getGraphicsContext2D());
		logoGraphContext = LogoGraphContext.getInstance();
		sleep.setText(logoGraphContext.getThreadSleep());
	}
	public void runParser() {
		String prog = program.getText();
		if (prog.length() > 0) {
			CharStream str = CharStreams.fromString(prog);
		
			LogoLexer lexer = new LogoLexer(str);

			// parser
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			LogoParser parser = new LogoParser(tokens);

			ProgrammeContext tree = parser.programme();
			List<String> rules = Arrays.asList(parser.getRuleNames());
			viewer = new TreeViewer(rules, tree);
			int sliderValue = (int) ((viewer.getScale() - 1.0) * 1000);
			scaleSlider.setValue(sliderValue);
			getJScrollASTPane().setViewportView(viewer);
			// La visite de l'arbre se fait dans un thread à part
			// pour avoir un affichage progressif dans le canvas
			sleep();
			VisitTask visitTask = new VisitTask(tree);
			Thread visitThread = new Thread(visitTask);
			visitThread.setDaemon(true);
			visitThread.start();
		}
	}
   public void clearView() {
	   canvas.getGraphicsContext2D().clearRect(0, 0, 1000, 1000);
   }
   public void clearLog() {
	   logarea.clear();
   }
   public void stop() {
	   logoGraphContext.stop();
   }
   public void sleep() {
	   int mstime = Integer.parseInt(sleep.getText());
	   logoGraphContext.setThreadSleep(mstime);
   }
	private void createSwingContent() {
		SwingUtilities.invokeLater(() -> swingNode
				.setContent(getjTreeViewPane()));
	}

	public JPanel getjTreeViewPane() {
		if (jTreeViewPane == null) {
			jTreeViewPane = new JPanel();
			jTreeViewPane.setMaximumSize(new Dimension(W,H));
			jTreeViewPane.setLayout(new BorderLayout());
			jTreeViewPane.add(getJScrollASTPane(), BorderLayout.CENTER);
			scaleSlider.setValue(0);
			scaleSlider.valueProperty().addListener((obs, oldv, newval) -> {
				if (viewer != null)
					viewer.setScale((double) newval / 1000.0 + 1.0);
			});

		}
		return jTreeViewPane;
	}

	private JScrollPane getJScrollASTPane() {
		if (jScrollASTPane == null) {
			jScrollASTPane = new JScrollPane();
		}
		return jScrollASTPane;
	}
	// Tâche pour visiter l'arbre de dérivation
	public class VisitTask extends Task<Void> {
		ProgrammeContext tree;
		public VisitTask(ProgrammeContext tree) {
			super();
			this.tree = tree;
		}

		@Override
		protected Void call() throws Exception {
			LogoTreeVisitor visitor = new LogoTreeVisitor();
			visitor.initialize(canvas.getGraphicsContext2D());
	           visitor.visit(tree);
			return null;
		}
		
	}
}
