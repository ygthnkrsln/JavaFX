package com.example.javafx.Chapter15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button buttonOK = new Button("OK");
        Button buttonCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        buttonOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        buttonCancel.setOnAction(handler2);
        pane.getChildren().addAll(buttonOK, buttonCancel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("OK button clicked");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Cancel button clicked");
    }
}
