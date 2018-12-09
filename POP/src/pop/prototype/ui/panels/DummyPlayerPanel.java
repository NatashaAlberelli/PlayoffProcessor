package pop.prototype.ui.panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DummyPlayerPanel extends PanelCreator {

	JScrollPane listPanel;
	DefaultTableModel model;
	JTable playerTable;
	JButton start;

	BorderLayout layout = new BorderLayout();

	String[] headers = new String[] {
			"#",
			"Players"
	};
	String[] players = new String[] {
			"Crumbles",
			"Corgu",
			"Corkie",
			"Barkley",
			"Buddy",
			"Crumbles",
			"Hero",
			"Cookie",
			"Doughnut",
			"Biscuit",
			"Hazel",
			"Creamy",
			"Jelly"
	};

	public DummyPlayerPanel() {
		super();
		super.init();
	}
	
	public JButton getStart() {
		return start;
	}
	
	public String[] getPlayers() {
		return players;
	}

	@Override
	protected void stylePanel() {
		super.getPanel().setLayout(layout);
	}

	@Override
	protected void initComponents() {
		model = new DefaultTableModel(0, headers.length);
		model.setColumnIdentifiers(headers);
		playerTable = new JTable(model);
		listPanel = new JScrollPane(playerTable);
		
		start = new JButton("Start");
	}

	@Override
	protected void placeComponents() {
		super.getPanel().add(listPanel, BorderLayout.CENTER);
		super.getPanel().add(start, BorderLayout.SOUTH);
	}

	@Override
	protected void styleComponents() {
		for (int i = 0; i < players.length; i++) {
			model.addRow(new Object[] { new Integer(i + 1), players[i] });
		}
		
		playerTable.getColumnModel().getColumn(0).setPreferredWidth(15);
	}

}
