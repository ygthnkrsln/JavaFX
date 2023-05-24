package com.example.javafx.Chapter15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN -> text.setY(text.getY() + 10);
                case UP -> text.setY(text.getY() - 10);
                case LEFT -> text.setX(text.getX() - 10);
                case RIGHT -> text.setX(text.getX() + 10);
                default -> {
                    if (Character.isLetterOrDigit(e.getText().charAt(0)))
                        text.setText(e.getText());
                }
            }
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

        text.requestFocus();
    }
}
