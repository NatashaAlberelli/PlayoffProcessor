package pop.prototype.ui.listeners;

import java.awt.event.ActionEvent;

import pop.prototype.Node;
import pop.prototype.Player;
import pop.prototype.Tournament;
import pop.prototype.ui.panels.NodePanel;
import pop.prototype.ui.panels.RoundPanel;
import pop.prototype.ui.ui.MainFrame;

public class StartTournamentListener extends ButtonAction {
	
	NodePanel[][] nodePanels;
	
	public StartTournamentListener(MainFrame frame) {
		super(frame);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String[] names = frame.getPlayerPanel().getPlayers();
		
		Player[] players = new Player[names.length];
		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(names[i]);
		}
		
		frame.setPlayers(players);
		frame.setTournament(new Tournament(frame.getPlayers()));
		
		initNodePanels();
		initRoundPanels();
		
		frame.getPanel().revalidate();
		frame.getPanel().repaint();
		frame.getFrame().pack();
	}
	
	private void initNodePanels() {
		Node[][] nodes = frame.getTournament().getBracket().getTree();
		nodePanels = new NodePanel[nodes.length][];
		
		int playerPerNodeCount = nodes[0][0].getPlayers().length;
		nodePanels[0] = new NodePanel[nodes[0].length];
		
		for (int j = 0; j < nodes[0].length; j++) {
			nodePanels[0][j] = new NodePanel(nodes[0][j].getPlayers());
		}
		
		for (int i = 1; i < nodePanels.length; i++) {
			nodePanels[i] = new NodePanel[nodes[i].length];
			
			for (int j = 0; j < nodes[i].length; j++) {
				nodePanels[i][j] = new NodePanel(playerPerNodeCount);
			}
		}
	}
	
	private void initRoundPanels() {
		RoundPanel[] tempPanels = new RoundPanel[nodePanels.length];
		
		for (int i = 0; i < nodePanels.length; i++) {
			tempPanels[i] = new RoundPanel(nodePanels[i]);
		}
		
		frame.getTournamentPanel().setRounds(tempPanels);
	}
}
