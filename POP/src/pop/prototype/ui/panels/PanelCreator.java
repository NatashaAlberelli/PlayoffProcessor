package pop.prototype.ui.panels;

import javax.swing.JPanel;

/**
 * An abstract class that represents an object that creates and defines a
 * {@code JPanel}.
 *
 * @author Natasha Alberelli
 * @version 1.0
 * @since JDK1.8
 */
public abstract class PanelCreator {

	private JPanel panel;

	/**
	 * Instantiates a new {@code PanelCreator}, creates the {@code JPanel}.
	 */
	public PanelCreator() {
		this(new JPanel());
	}
	
	/**
	 * Instantiates a new {@code PanelCreator}, creates the {@code JPanel} with
	 * passed in panel.
	 */
	public PanelCreator(JPanel panel) {
		this.panel = panel;
	}

	/**
	 * Gets the {@code JPanel} contained within this object.
	 *
	 * @return the {@code JPanel}
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * Initializes the {@code JPanel}.
	 */
	protected void init() {
		stylePanel();
		initComponents();
		styleComponents();
		placeComponents();
	}

	/**
	 * Style the {@code JPanel}, {@code LayoutManager} type, borders, backgrounds,
	 * etc. gets initialized here.
	 */
	protected abstract void stylePanel();

	/**
	 * Initializes the components to be stored on the {@code JPanel}.
	 */
	protected abstract void initComponents();

	/**
	 * Styles the components.
	 */
	protected abstract void styleComponents();
	
	/**
	 * Places the components in the layout.
	 */
	protected abstract void placeComponents();
}
