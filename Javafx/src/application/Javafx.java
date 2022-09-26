package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Javafx extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primeryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root);
		primeryStage.setScene(scene);
		primeryStage.show();
		
	}

}
