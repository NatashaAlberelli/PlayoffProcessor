package pop.gui;

import javafx.scene.layout.Pane;

public abstract class PanelMaker {
	
	public PanelMaker() {
		make();
	}
	
	public final void make() {
		style();
		layout();
	}
	
	public abstract Pane getPane();
	
	protected abstract void style();

	protected abstract void layout();
}
