/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkimplements.wsp5;

import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
 public class Client extends Application {
	 
	 public static void main(String[] args) {
	        launch(args);
	    }
	 
     DataOutputStream toServer =null;
     DataInputStream fromServer =null;
     
    @Override public void start(Stage primaryStage) {
     
    BorderPane paneForTextField = new BorderPane();
    paneForTextField.setPadding(new Insets(5, 5, 5, 5));
    paneForTextField.setStyle("-fx-border-color: green");
    paneForTextField.setLeft(new Label("Enter a radius: "));
    
    TextField tf =new TextField();
    tf.setAlignment(Pos.BOTTOM_RIGHT);
    paneForTextField.setCenter(tf);
    BorderPane mainPane =new BorderPane();
    
    TextArea ta =new TextArea();
    mainPane.setCenter(new ScrollPane(ta));
    mainPane.setTop(paneForTextField);
    Scene scene =new Scene(mainPane, 450, 200);
    primaryStage.setTitle("Client");
    primaryStage.setScene(scene);
    primaryStage.show();
    tf.setOnAction(e -> {
        try {
              double radius = Double.parseDouble(tf.getText().trim());
              toServer.writeDouble(radius);
              toServer.flush();
              double area =fromServer.readDouble();
              ta.appendText("Yariçap" +radius +"\n");
              ta.appendText("Serverdan alinan alan "+area +'\n');
        }
        catch (IOException ex) {
            System.err.println(ex); 
           }  
            });
        try {
              Socket socket =new Socket("10.202.17.189", 8010);
              //Socket socket = new Socket("130.254.204.36", 8000);
              //Socket socket = new Socket("drake.Armstrong.edu", 8000);
        fromServer = new DataInputStream(socket.getInputStream());
        toServer = new DataOutputStream(socket.getOutputStream());
       }
catch (IOException ex) {
       ta.appendText(ex.toString() +'\n');     }    }}