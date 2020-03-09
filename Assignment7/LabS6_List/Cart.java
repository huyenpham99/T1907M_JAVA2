package LabS6_List;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

import static LabS6_List.Main.ls1;

public class Cart implements Initializable {
    @FXML
    public ListView<Product> listView1 = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView1.setItems(ls1);
    }

    public void backtolist() {
        try {
            Parent backtolist = FXMLLoader.load(getClass().getResource("List.fxml"));
            Main.mainStage.getScene().setRoot(backtolist);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
