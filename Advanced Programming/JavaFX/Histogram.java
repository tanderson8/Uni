package HistogramExample;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Histogram extends Application {

    @Override
    public void start(Stage primaryStage){
        int i = 1;
        VBox vbox = new VBox(30);
        Rectangle rec1 = new Rectangle();
        rec1.setX(50);
        rec1.setY(50);
        rec1.setWidth(100);
        rec1.setHeight(10);
        //primaryStage.setScene(vbox);
        rec1.setFill(Color.YELLOW);
    }

}
