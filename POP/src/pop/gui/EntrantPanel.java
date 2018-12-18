package pop.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class EntrantPanel extends PanelMaker {

	AnchorPane entrantPane = new AnchorPane();
	
	ScrollPane entrantScroll = new ScrollPane();
	
	HBox entrantButtons = new HBox();
	Button edit = new Button("Edit");
	Button add = new Button("Add");
	
	public EntrantPanel() {
		//super();
		this.layout();
	}
	
	@Override
	public Pane getPane() {
		return entrantPane;
	}
	
	@Override
	protected void style() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void layout() {
		AnchorPane.setBottomAnchor(entrantScroll, (entrantButtons.getHeight() + 10));
		AnchorPane.setTopAnchor(entrantScroll, 5.0);
		AnchorPane.setLeftAnchor(entrantScroll, 5.0);
		AnchorPane.setRightAnchor(entrantScroll, 5.0);
		
		entrantButtons.setSpacing(5);
		entrantButtons.setAlignment(Pos.CENTER_LEFT);
		entrantButtons.getChildren().addAll(add, edit);
		AnchorPane.setBottomAnchor(entrantButtons, 5.0);
		AnchorPane.setLeftAnchor(entrantButtons, 5.0);
		AnchorPane.setRightAnchor(entrantButtons, 5.0);
		
		entrantPane.getChildren().addAll(entrantScroll, entrantButtons);
	}

}
