package LabS6_List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static Stage mainStage;
    public static ObservableList ls1 = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
        primaryStage.setTitle("Nhập thông tin sản phẩm: ");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }
}
