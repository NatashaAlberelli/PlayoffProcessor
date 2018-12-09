package pop.prototype.ui.panels;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import pop.prototype.Player;

public class NodePanel extends PanelCreator {

	private Border spacer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
	private Border etch = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	private Border outer = BorderFactory.createCompoundBorder(spacer, etch);
	private Border entryBorder = BorderFactory.createCompoundBorder(outer, spacer);

	private JRadioButton[] players;
	private ButtonGroup matchup;
	private JButton confirm;

	private GridLayout playerLayout = new GridLayout(1, 0);
	private JPanel playerPanel = new JPanel(playerLayout);

	BorderLayout matchLayout = new BorderLayout();

	Player[] playerNames;

	public NodePanel(int playerCount) {
		super();
		players = new JRadioButton[playerCount];
		playerNames = new Player[playerCount];
		for (int i = 0; i < playerNames.length; i++) {
			playerNames[i] = new Player("x");
		}
		super.init();
	}

	public NodePanel(Player[] playerNames) {
		super();
		players = new JRadioButton[playerNames.length];
		this.playerNames = playerNames;
		super.init();
	}

	public ButtonGroup getMatchup() {
		return matchup;
	}

	public JButton getConfirmButton() {
		return confirm;
	}

	public void setPlayerList(Player[] playerNames) {
		this.playerNames = playerNames;
		super.init();
	}
	
	@Override
	protected void stylePanel() {
		super.getPanel().setLayout(matchLayout);
		super.getPanel().setBorder(entryBorder);
	}

	@Override
	protected void initComponents() {
		matchup = new ButtonGroup();
		for (int i = 0; i < players.length; i++) {
			players[i] = new JRadioButton();
		}
		confirm = new JButton();
	}

	@Override
	protected void styleComponents() {
		for (int i = 0; i < players.length; i++) {
			players[i].setText(playerNames[i].toString());
		}
		confirm.setText("confirm");
	}

	@Override
	protected void placeComponents() {
		for (int i = 0; i < players.length; i++) {
			matchup.add(players[i]);
		}
		
		for (int i = 0; i < players.length; i++) {
			playerPanel.add(players[i]);
		}
		super.getPanel().add(playerPanel, BorderLayout.CENTER);
		super.getPanel().add(confirm, BorderLayout.SOUTH);
	}
}
