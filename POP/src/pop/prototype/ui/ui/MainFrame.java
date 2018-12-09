package pop.prototype.ui.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pop.prototype.Player;
import pop.prototype.Tournament;
import pop.prototype.ui.listeners.StartTournamentListener;
import pop.prototype.ui.panels.DummyPlayerPanel;
import pop.prototype.ui.panels.NodePanel;
import pop.prototype.ui.panels.TournamentPanel;

public class MainFrame {

	public static final String FRAME_TITLE = "Playoff Processor";

	private JFrame mainFrame;
	private JPanel mainPanel;
	private LayoutManager mainLayout;

	// panels here
	// private PlayerEntryPanel entryPanel;
	private TournamentPanel tournPanel;
	private DummyPlayerPanel playerPanel;

	// misc
	private Player[] players;
	private Tournament tourn;

	public MainFrame() {
		mainFrame = new JFrame(FRAME_TITLE);
		mainPanel = new JPanel();

		styleMainPanel();
		initPanels();
		initMisc();
		placePanels();
		initEventListeners();
		styleFrame();
	}

	public JFrame getFrame() {
		return mainFrame;
	}

	public JPanel getPanel() {
		return mainPanel;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	/*
	 * public PlayerEntryPanel getEntryPanel() { return entryPanel; }
	 */

	public Tournament getTournament() {
		return tourn;
	}

	public void setTournament(Tournament tourn) {
		this.tourn = tourn;
	}

	public DummyPlayerPanel getPlayerPanel() {
		return playerPanel;
	}

	public TournamentPanel getTournamentPanel() {
		return tournPanel;
	}

	private void styleMainPanel() {
		mainLayout = new BorderLayout();
		mainPanel.setLayout(mainLayout);

		mainPanel.setBackground(Color.DARK_GRAY);
	}

	private void initMisc() {
	}

	private void initPanels() {
		tournPanel = new TournamentPanel();
		playerPanel = new DummyPlayerPanel();
	}

	private void placePanels() {
		mainPanel.add(tournPanel.getPanel(), BorderLayout.CENTER);
		mainPanel.add(playerPanel.getPanel(), BorderLayout.WEST);

		mainFrame.setContentPane(mainPanel);
	}

	public void initEventListeners() {
		playerPanel.getStart().addActionListener(new StartTournamentListener(this));
		// entryPanel.getEnterButton().addActionListener(new PlayerEntryListener(this));
		// entryPanel.getFinishButton().addActionListener(new
		// StartTournamentListener(this));
	}

	public void styleFrame() {
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(true);
		mainFrame.setVisible(true);
	}

	private static void startGui() {
		new MainFrame();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				startGui();
			}
		});
	}
}
