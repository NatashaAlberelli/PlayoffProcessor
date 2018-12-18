package pop.gui;







import javafx.application.Application;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import javafx.scene.paint.Color;

import javafx.stage.Stage;


public class PlayoffProcessor extends Application {

	@Override
	public void start(Stage primaryStage) {
		AnchorPane entrantPane = new AnchorPane();
		//entrantPane.setPrefHeight(500);
		//entrantPane.setPrefWidth(500);
		
		ScrollPane entrantScroll = new ScrollPane();
		
		HBox entrantButtons = new HBox();
		//entrantButtons.setPrefSize(200, 40);
		//entrantButtons.setMinSize(150, 30);
		Button edit = new Button("Edit");
		Button add = new Button("Add");
		
		entrantPane.getChildren().addAll(entrantScroll, entrantButtons);
		
		AnchorPane.setBottomAnchor(entrantScroll, 40.0);
		AnchorPane.setTopAnchor(entrantScroll, 5.0);
		AnchorPane.setLeftAnchor(entrantScroll, 5.0);
		AnchorPane.setRightAnchor(entrantScroll, 5.0);
		
		entrantButtons.setSpacing(5);
		entrantButtons.setAlignment(Pos.CENTER_LEFT);
		entrantButtons.getChildren().addAll(add, edit);
		AnchorPane.setBottomAnchor(entrantButtons, 5.0);
		AnchorPane.setLeftAnchor(entrantButtons, 5.0);
		AnchorPane.setRightAnchor(entrantButtons, 5.0);
		
		Scene scene = new Scene(entrantPane, 500, 500, Color.BLACK);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Yeet");
		primaryStage.show();
		
		//no height until it's called
		System.out.println(entrantButtons.getHeight());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
