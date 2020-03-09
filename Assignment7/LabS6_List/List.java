package LabS6_List;

import Connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Product> listView = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            String sql_text = "SELECT * FROM products";
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery(sql_text);
            ObservableList ls = FXCollections.observableArrayList();
            while (rs.next()) {
                LabS6_List.Product product = new LabS6_List.Product(rs.getInt("id"), rs.getString("name"), rs.getString("des"), rs.getInt("price"), rs.getInt("amount"), rs.getInt("amount"));
                ls.add(product);
            }
            listView.setItems(ls);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Step 4: kết nối với database

        }
    }

    public void addproduct() {
        //day la noi chuyen man hinh
        try {
//            Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
//            Main.mainStage.getScene().setRoot(form);
            Load ld = Load.getInstance();
            Parent load = ld.loadScene("Form.fxml");
            Main.mainStage.getScene().setRoot(load);
            System.out.println(ld);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addtocart() {
        try {
            Product selectedItem = listView.getSelectionModel().getSelectedItem();
            listView.getSelectionModel().getSelectedItem();
            int id = selectedItem.id;
            String name = selectedItem.name;
            String des = selectedItem.des;
            int price = selectedItem.price;
            int amount = selectedItem.amount;
            int total = selectedItem.price * selectedItem.amount;
            Product pr = new Product(id, name, des, price, amount, total);
            Main.ls1.add(pr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showcart() {
        try {
            Parent show = FXMLLoader.load(getClass().getResource("Cart.fxml"));
            Main.mainStage.getScene().setRoot(show);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
