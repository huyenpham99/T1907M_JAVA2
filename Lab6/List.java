package LabS6_List;

import Lab1.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Product> listView = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            //stepp 2: khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/productmanager";
            String username = "root";
            String password = "";
            //step 4: ket noi
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql_text = "SELECT * FROM products";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);
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
            Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Main.mainStage.getScene().setRoot(form);

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
