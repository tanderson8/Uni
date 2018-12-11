package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginForm extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Form");
        GridPane pane = new GridPane();
        pane.setVgap(20);
        pane.setHgap(20);
        pane.setPadding(new Insets(20,20,20,20));
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel,0,0);
        TextField nameField = new TextField("");
        GridPane.setConstraints(nameField,1,0);
        Label addressLabel = new Label("Address");
        GridPane.setConstraints(addressLabel,0,1);
        TextField addressField = new TextField();
        GridPane.setConstraints(addressField,1,1);
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");
        HBox hbox = new HBox(5);
        hbox.getChildren().addAll(submit,cancel);
        GridPane.setConstraints(hbox,1,2);
        submit.setOnAction( e -> {
            System.out.println(addressField.getText());
            System.out.println(nameField.getText());
        });
        cancel.setOnAction( e -> primaryStage.close());
        pane.getChildren().addAll(nameLabel,nameField,addressLabel,addressField,hbox);
        primaryStage.setScene(new Scene(pane,600,500));
        primaryStage.show();
    }


}
