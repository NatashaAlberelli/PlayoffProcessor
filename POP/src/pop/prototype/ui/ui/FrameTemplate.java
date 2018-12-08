package pop.prototype.ui.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pop.prototype.ui.panels.PanelCreator;

public class FrameTemplate {
	
	public static final String FRAME_TITLE = "Frame Template";
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	private LayoutManager mainLayout;
	
	//panels here
	private PanelCreator[] panels;
	
	public FrameTemplate() {
		mainFrame = new JFrame(FRAME_TITLE);
		mainPanel = new JPanel();
		
		styleMainPanel();
		initPanels();
		placePanels();
		initEventListeners();
		styleFrame();
	}
	
	private void styleMainPanel() {
		mainLayout = new BorderLayout();
		mainPanel.setLayout(mainLayout);
		
		mainPanel.setBackground(Color.DARK_GRAY);
	}
	
	private void initPanels() {
		panels = new PanelCreator[0];
	}
	
	private void placePanels() {
		for (PanelCreator x : panels) {
			mainPanel.add(x.getPanel());
		}
		mainFrame.setContentPane(mainPanel);
	}
	
	public void initEventListeners() {
	}
	
	public void styleFrame() {
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.pack();
		mainFrame.setResizable(true);
		mainFrame.setVisible(true);
	}
	
	private static void startGui() {
		new FrameTemplate();
	}
	
	public static void main(String[] args) {	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				startGui();
			}
		});
	}
}
