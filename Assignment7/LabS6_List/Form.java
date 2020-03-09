package LabS6_List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtDescribe = new TextField();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();

    public void addproduct() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/productmanager"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connect Success!");
            String name = txtName.getText();
            String des = txtDescribe.getText();
            Integer price = Integer.parseInt(txtPrice.getText());
            Integer amount = Integer.parseInt(txtAmount.getText());
            String sql_text = "INSERT INTO products(name,des,price,amount) VALUES(?,?,?,?)";
            PreparedStatement prstm = conn.prepareStatement(sql_text); // truyền vào câu và sẽ không cần phải viết đúng chuỗi tên hàng truyền vào
            prstm.setString(1, name); // 1 là giá trị dấu ? đầu tiên và sau là giá trị truyền vào
            prstm.setString(2, des);
            prstm.setInt(3, price);
            prstm.setInt(4, amount);
            // hàm prepared sẽ trả về biến boolean false or true
            if (!prstm.execute()) {
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
