/* * Name: María González Chavarría
* * Student ID: 2019380035
* Course: Algorithms and Data Structures 1
* Homework #1   */
package com.javalimos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// The GUI is launched with this class by extending the Application class
public class Main extends Application{
    /* * This method overrides a preexisting one in the Application class that allows the code
    * *  to launch the application created in Scene Builder*/
    @Override
    public void start(Stage primaryStage) throws Exception {
	Parent root =FXMLLoader.load(getClass().getResource("GUI.fxml"));
	primaryStage.setTitle("SOCKET");
	primaryStage.setScene(new Scene(root, 800, 500));
	primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
