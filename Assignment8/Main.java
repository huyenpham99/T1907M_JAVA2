package Assignment8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage mainStage;
    public static void main(String[] args) {
        launch(args);
    }

    public static Parent listPage;
    public static Parent formPage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        try {
            if (listPage == null) {
                Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
            }
            Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
            primaryStage.setTitle("Thông tin sinh viên");
            primaryStage.setScene(new Scene(root, 600, 500));
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
