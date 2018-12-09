package pop.prototype.ui.panels;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class PlayerEntryPanel extends PanelCreator {

	
	private Border spacer  = BorderFactory.createEmptyBorder(5, 5, 5, 5);
	private Border etch = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	private Border outer = BorderFactory.createCompoundBorder(spacer, etch);
	private Border entryBorder = BorderFactory.createCompoundBorder(outer, spacer);
	
	private BorderLayout layout = new BorderLayout();
	
	private JTextField playerEntry;
	private JButton enter;
	private JButton finish;

	public PlayerEntryPanel() {
		super();
		super.init();
	}
	
	public JButton getFinishButton() {
		return finish;
	}
	
	public JButton getEnterButton() {
		return enter;
	}
	
	public JTextField getPlayerName() {
		return playerEntry;
	}
	
	@Override
	protected void stylePanel() {
		super.getPanel().setLayout(layout);
	}

	@Override
	protected void initComponents() {
		playerEntry = new JTextField();
		enter = new JButton("Enter");
		finish = new JButton("Finish");
	}

	@Override
	protected void placeComponents() {
		super.getPanel().add(playerEntry, BorderLayout.CENTER);
		super.getPanel().add(enter, BorderLayout.SOUTH);
		super.getPanel().add(finish, BorderLayout.NORTH);
	}

	@Override
	protected void styleComponents() {
		playerEntry.setColumns(20);
		playerEntry.setPreferredSize(new Dimension(200, 50));
		playerEntry.setBorder(entryBorder);
	}


}
