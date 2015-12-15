package application;

import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)
		throws IOException {
			//URL url = getClass().getResource("GUIClassProject.fxml");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ClassLoader.getSystemResource("application/GUIClassProject.fxml"));
		   //AnchorPane pane = FXMLLoader.load("GUIClassProject.fxml");

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("MineSweeper");
			primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
