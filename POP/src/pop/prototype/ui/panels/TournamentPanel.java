package pop.prototype.ui.panels;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class TournamentPanel extends PanelCreator {

	BoxLayout layout;
	RoundPanel[] rounds;
	JScrollPane scrollPane;

	public TournamentPanel() {
		super();
		stylePanel();
	}
	
	public void setRounds(RoundPanel[] rounds) {
		this.rounds = rounds;
		super.init();
	}

	public RoundPanel[] getRounds() {
		return rounds;
	}
	
	@Override
	protected void stylePanel() {
		layout = new BoxLayout(super.getPanel(), BoxLayout.LINE_AXIS);
		super.getPanel().setLayout(layout);
		//super.getPanel().setPreferredSize(new Dimension(500, 500));
	}

	@Override
	protected void initComponents() {
		//scrollPane = new JScrollPane();
	}

	@Override
	protected void placeComponents() {
		for (int i = 0; i < rounds.length; i++) {
			super.getPanel().add(rounds[i].getPanel());
		}
		//super.getPanel().add(scrollPane);
	}

	@Override
	protected void styleComponents() {
		//JLabel label = new JLabel("Bracket");
		//label.setHorizontalAlignment(JLabel.CENTER);
		//scrollPane.setColumnHeaderView(label);
	}


}
