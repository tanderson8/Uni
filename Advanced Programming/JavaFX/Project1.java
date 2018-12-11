package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Project1 extends Application {
    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 500,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Benford's Distribution");
        primaryStage.show();
    }
}
