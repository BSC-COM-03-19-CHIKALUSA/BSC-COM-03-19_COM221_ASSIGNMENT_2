package com.example.javafxassignment2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        boolean on = true;
        stage.setTitle("MyHouse");
        HBox hBox = new HBox();

        //creating the menubar
        MenuBar menuBar= new MenuBar();
        Menu buttonF = new Menu("File");
        Menu buttonE = new Menu("Edit");
        Menu buttonT = new Menu("Format");
        Menu buttonV = new Menu("View");
        Menu buttonH = new Menu("Help");
        menuBar.getMenus().addAll(buttonF,buttonE,buttonT,buttonV,buttonH);
        
//   button declaration using parent pane
        Pane pane = new Pane();

        Button rectangle1 = new Button("Room1");
        rectangle1.setPrefSize(165,170);
       rectangle1.setAlignment(Pos.CENTER);
        rectangle1.setLayoutX(77);
        rectangle1.setLayoutY(31);
//        GridPane.setConstraints(rectangle1,0,1);
        rectangle1.setStyle("-fx-background-color: gray;-fx-border-color: black");


        Button rectangle2 = new Button("Room3");
        rectangle2.setAlignment(Pos.CENTER);
        rectangle2.setLayoutX(240);
        rectangle2.setLayoutY(31);
        rectangle2.setPrefSize(118,100);
//        GridPane.setConstraints(rectangle2,1,1);
        rectangle2.setStyle("-fx-background-color: gray;-fx-border-color: black");


        Button rectangle3 = new Button("Room4");
        rectangle3.setAlignment(Pos.CENTER);
        rectangle3.setLayoutX(340);
        rectangle3.setLayoutY(31);
        rectangle3.setPrefSize(120,100);
//        GridPane.setConstraints(rectangle3,3,1);
        rectangle3.setStyle("-fx-background-color: gray;-fx-border-color: black");

        Button rectangle4 = new Button("Room5");
        rectangle4.setAlignment(Pos.CENTER);
        rectangle4.setLayoutX(437);
        rectangle4.setLayoutY(31);
        rectangle4.setPrefSize(123,170);
//        GridPane.setConstraints(rectangle4,3,2);
        rectangle4.setStyle("-fx-background-color: gray;-fx-border-color: black");


        Button rectangle5 = new Button("Room6");
        rectangle5.setAlignment(Pos.CENTER);
        rectangle5.setLayoutX(241);
        rectangle5.setLayoutY(181);
        rectangle5.setPrefSize(170,105);
//        GridPane.setConstraints(rectangle5,1,3);
        rectangle5.setStyle("-fx-background-color: gray;-fx-border-color: black");

        Button rectangle6 = new Button("Room7");
        rectangle6.setAlignment(Pos.CENTER);
        rectangle6.setLayoutX(411);
        rectangle6.setLayoutY(177);
        rectangle6.setPrefSize(150,110);
//        GridPane.setConstraints(rectangle6,3,3);
        rectangle6.setStyle("-fx-background-color: gray;-fx-border-color: black");

        Button rectangle7 = new Button("Room2");
        rectangle7.setAlignment(Pos.CENTER);
        rectangle7.setLayoutX(242);
        rectangle7.setLayoutY(130);
        rectangle7.setPrefSize(198,50);
//        GridPane.setConstraints(rectangle7,1,2);
        rectangle7.setStyle("-fx-background-color: gray;-fx-border-color: black");

        pane.getChildren().addAll(rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(pane);
        Scene scene = new Scene(borderPane,600,680);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}