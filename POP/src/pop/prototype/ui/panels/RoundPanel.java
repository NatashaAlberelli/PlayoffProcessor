package pop.prototype.ui.panels;

import java.awt.GridLayout;

public class RoundPanel extends PanelCreator {
	
	GridLayout layout;
	NodePanel[] nodes;
	
	public RoundPanel(NodePanel[] nodes) {
		super();
		this.nodes = nodes;
		super.init();
	}
	
	public NodePanel[] getNodePanels(){
		return nodes;
	}
	
	@Override
	protected void stylePanel() {
		layout = new GridLayout(0, 1);
		super.getPanel().setLayout(layout);
	}

	@Override
	protected void initComponents() {
	}

	@Override
	protected void placeComponents() {
		for (int i = 0; i < nodes.length; i++) {
			super.getPanel().add(nodes[i].getPanel());
		}
	}

	@Override
	protected void styleComponents() {
	}


}
