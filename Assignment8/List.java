package Assignment8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class List implements Initializable {

    public ListView<Student> listView = new ListView<>();
    public static ObservableList<Student> listData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            reloadData();
            listView.setItems(listData);
        } catch (Exception e) {

        }
    }

    public void reloadData() throws Exception {
        // su duing DAO Pattern
        StudentDAO pdao = new StudentDAO().getInstance();
        ArrayList<Student> ls = pdao.list();
        listData.addAll(ls);
    }

    //chuyen man hinh sang Form
    public void form() {
        try {
            if (Assignment8.Main.formPage == null)
                Assignment8.Main.formPage = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Assignment8.Main.mainStage.getScene().setRoot(Main.formPage);
        } catch (Exception e) {

        }
    }
}
