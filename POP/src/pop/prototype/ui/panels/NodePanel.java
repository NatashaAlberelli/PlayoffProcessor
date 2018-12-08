package pop.prototype.ui.panels;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class NodePanel extends PanelCreator {

	JRadioButton[] players;
	ButtonGroup matchup;
	JButton confirm;
	
	GridLayout playerLayout = new GridLayout(1, 0);
	JPanel playerPanel = new JPanel();
	
	BorderLayout matchLayout = new BorderLayout();
	
	String[] playerNames;
	
	public NodePanel(int playerCount, String[] playerNames) {
		super();
		players = new JRadioButton[playerCount];
		this.playerNames = playerNames;
	}

	public JPanel getPanel() {
		return super.getPanel();
	}
	
	public ButtonGroup getMatchup() {
		return matchup;
	}
	
	public JButton getConfirmButton() {
		return confirm;
	}
	
	@Override
	protected void stylePanel() {
		super.getPanel().setLayout(matchLayout);
	}

	@Override
	protected void initComponents() {
		matchup = new ButtonGroup();
		for (int i = 0; i < players.length; i++) {
			players[i] = new JRadioButton();
			matchup.add(players[i]);
		}
		confirm = new JButton();
	}

	@Override
	protected void styleComponents() {
		for (int i = 0; i < players.length; i ++) {
			players[i].setText(playerNames[i]);
		}
		confirm.setText("confirm");
	}
	
	@Override
	protected void placeComponents() {
		for (int i = 0; i < players.length; i++) {
			playerPanel.add(players[i]);
		}
		super.getPanel().add(playerPanel);
		super.getPanel().add(confirm);
	}
}
