package pop.prototype.ui.listeners;

import java.awt.event.ActionEvent;

import pop.prototype.Player;
import pop.prototype.ui.panels.PlayerEntryPanel;
import pop.prototype.ui.ui.MainFrame;

public class PlayerEntryListener extends ButtonAction {

	PlayerEntryPanel panel;
	
	public PlayerEntryListener(MainFrame frame) {
		super(frame);
		//this.panel = frame.getEntryPanel();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String tempName = panel.getPlayerName().getText();
		Player[] tempList = new Player[frame.getPlayers().length + 1];
		tempList[tempList.length - 1] = new Player(tempName);
		System.arraycopy(frame.getPlayers(), 0, tempList, 0, frame.getPlayers().length);
		
		panel.getPlayerName().setText("");
		panel.getPlayerName().repaint();
	}
}
