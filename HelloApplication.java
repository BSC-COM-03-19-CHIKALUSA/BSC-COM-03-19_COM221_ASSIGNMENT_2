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
  //creating the menuBar
  MenuBar menuBar= new MenuBar();
  Menu buttonF = new Menu("File");
  Menu buttonE = new Menu("Edit");
  Menu buttonT = new Menu("Format");
  Menu buttonV = new Menu("View");
  Menu buttonH = new Menu("Help");
  menuBar.getMenus().addAll(buttonF,buttonE,buttonT,buttonV,buttonH);

  //creating Rooms

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

  //Creating buttons
  GridPane gridPane2 = new GridPane();
  gridPane2.setVgap(10);
  gridPane2.setHgap(20);
  Button button1 = new Button("AllRooms ON/OFF");
  button1.setPrefSize(150,30);
  GridPane.setConstraints(button1,0,1);
  Button button2 = new Button("Room1&2 ON/OFF");
  button2.setPrefSize(150,30);
  GridPane.setConstraints(button2,0,2);
  Button button3 = new Button("Room1 ON/OFF");
  button3.setPrefSize(150,30);
  GridPane.setConstraints(button3,0,3);
  Button button4 = new Button("Room2 ON/OFF");
  button4.setPrefSize(150,30);
  GridPane.setConstraints(button4,1,1);
  Button button5 = new Button("Room3 ON/OFF");
  button5.setPrefSize(150,30);
  GridPane.setConstraints(button5,1,2);
  Button button6 = new Button("Room4 ON/OFF");
  button6.setPrefSize(150,30);
  GridPane.setConstraints(button6,1,3);
  Button button7 = new Button("Room5 ON/OFF");
  button7.setPrefSize(150,30);
  GridPane.setConstraints(button7,2,1);
  Button button8 = new Button("Room6 ON/OFF");
  button8.setPrefSize(150,30);
  GridPane.setConstraints(button8,2,2);
  Button button9 = new Button("Room7 ON/OFF");
  button9.setPrefSize(150,30);
  GridPane.setConstraints(button9,2,3);
  gridPane2.setAlignment(Pos.CENTER);
  gridPane2.setPadding(new Insets(20,20,20,20));
  gridPane2.getChildren().addAll(button1,button2,button3,button4,button5,button6,button7,button8,button9);

  BorderPane borderPane = new BorderPane();
  borderPane.setTop(menuBar);
  borderPane.setCenter(pane);
  borderPane.setBottom(gridPane2);
  EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {
    rectangle1.setStyle("-fx-background-color: yellow;-fx-border-color: black");
    rectangle2.setStyle("-fx-background-color: red;-fx-border-color: black");
    rectangle3.setStyle("-fx-background-color: red;-fx-border-color: black");
    rectangle4.setStyle("-fx-background-color: yellow;-fx-border-color: black");
    rectangle5.setStyle("-fx-background-color: red;-fx-border-color: black");
    rectangle6.setStyle("-fx-background-color: yellow;-fx-border-color: black");
    rectangle7.setStyle("-fx-background-color: green;-fx-border-color: black");
   }
  };
  button1.setOnAction(eventHandler);
  EventHandler<ActionEvent> eventHandler0 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {
    rectangle1.setStyle("-fx-background-color: red;-fx-border-color: black");
    rectangle7.setStyle("-fx-background-color: red;-fx-border-color: black");
   }
  };

  button2.setOnAction(event -> {
   rectangle1.setStyle("-fx-background-color: yellow;-fx-border-color: black");
   rectangle7.setStyle("-fx-background-color: green;-fx-border-color: black");
  });

  EventHandler<ActionEvent> eventHandler1 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {

    rectangle1.setStyle("-fx-background-color: yellow;-fx-border-color: black");
   }
  };
  button3.setOnAction(eventHandler1);

  EventHandler<ActionEvent> eventHandler2 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {

    rectangle7.setStyle("-fx-background-color: green;-fx-border-color: black");
   }
  };
  button4.setOnAction(eventHandler2);

  EventHandler<ActionEvent> eventHandler3 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {


    rectangle2.setStyle("-fx-background-color:  red;-fx-border-color: black");
   }
  };

  button5.setOnAction(eventHandler3);
  EventHandler<ActionEvent> eventHandler4 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {

    rectangle3.setStyle("-fx-background-color: red;-fx-border-color: black");
   }
  };
  button6.setOnAction(eventHandler4);
  EventHandler<ActionEvent> eventHandler5 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {

    rectangle4.setStyle("-fx-background-color: yellow;-fx-border-color: black");
   }
  };
  button7.setOnAction(eventHandler5);
  EventHandler<ActionEvent> eventHandler6 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {

    rectangle5.setStyle("-fx-background-color: red;-fx-border-color: black");
   }
  };
  button8.setOnAction(eventHandler6);
  EventHandler<ActionEvent> eventHandler7 = new EventHandler<ActionEvent>() {
   @Override
   public void handle(ActionEvent actionEvent) {
    rectangle6.setStyle("-fx-background-color: yellow;-fx-border-color: black");
   }
  };

  button9.setOnAction(eventHandler7);


  Scene scene = new Scene(borderPane,600,680);

  stage.setScene(scene);
  stage.setResizable(false);
  stage.show();
 }


 public static void main(String[] args) {
  launch();
 }
}