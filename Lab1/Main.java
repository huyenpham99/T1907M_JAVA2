package Lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Lab1/Student.fxml"));
            Scene scene = new Scene(root, 600, 275);
            primaryStage.setTitle("Enter Student Information ");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }

