package pop.prototype.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pop.prototype.ui.panels.PanelCreator;

public abstract class TemplateListener implements ActionListener {

	PanelCreator[] panels;
	
	public TemplateListener(PanelCreator[] panels) {
		this.panels = panels;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
