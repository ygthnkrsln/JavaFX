package com.example.javafx.Chapter15;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AvatarRisingAnimation extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        ImageView imageView = new ImageView(new Image("C:\\Users\\MSI\\Desktop\\Untitled.png"));
        pane.getChildren().add(imageView);

        PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
        pt.setCycleCount(5);
        pt.play();

        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("AvatarRisingAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
