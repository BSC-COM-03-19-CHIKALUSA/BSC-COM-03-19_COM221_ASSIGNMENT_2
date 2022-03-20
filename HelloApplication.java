package com.example.javafxassignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       stage.setTitle("MyHouse");

//       Image image = new Image("square-16.gif");

   MyAbstractClass myAbstractClass = new MyAbstractClass();
   myAbstractClass.myEventHandlerAbstractMethod();

        Scene scene = new Scene( myAbstractClass.myEventHandlerAbstractMethod(),600,680);
        stage.setScene(scene);
//        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
        };

    }
