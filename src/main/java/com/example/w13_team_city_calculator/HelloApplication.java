package com.example.w13_team_city_calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        TextField textFieldA = new TextField();
        textFieldA.setPromptText("Number a");
        TextField textFieldB = new TextField();
        textFieldB.setPromptText("Number b");
        TextField textFieldResult = new TextField();
        textFieldResult.setPromptText("Result");

        Button buttonAdd = new Button("Add");
        buttonAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String result = Double.toString(add2Numbers(textFieldA, textFieldB));
                textFieldResult.setText(result);
            }
        });

        Button buttonSubtract = new Button("Subtract");
        buttonSubtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String result = Double.toString(subtract2Numbers(textFieldA, textFieldB));
                textFieldResult.setText(result);
            }
        });

        HBox hBox = new HBox(buttonAdd, buttonSubtract);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        VBox vBox = new VBox(textFieldA, textFieldB, hBox, textFieldResult);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);

        AnchorPane anchorPane = new AnchorPane(vBox);

        Scene scene = new Scene(anchorPane, 320, 320);

        stage.setResizable(false);
        stage.setTitle("Test Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public double add2Numbers(TextField textFieldA, TextField textFieldB) {
        double a = Double.valueOf(textFieldA.getText());
        double b = Double.valueOf(textFieldB.getText());
        return a + b;
    }

    public double subtract2Numbers(TextField textFieldA, TextField textFieldB) {
        double a = Double.valueOf(textFieldA.getText());
        double b = Double.valueOf(textFieldB.getText());
        return a - b;
    }
}