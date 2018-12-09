package pop.prototype.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pop.prototype.ui.ui.MainFrame;

public abstract class ButtonAction implements ActionListener {

	MainFrame frame;
	
	public ButtonAction(MainFrame frame) {
		this.frame = frame;
	}
	
	public abstract void actionPerformed(ActionEvent e);
}
