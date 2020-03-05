package LabS6_List;

import LabS6_Form.Product;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtDescribe = new TextField();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();

    public void addproduct() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/productmanager"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connect Success!");
            String name = txtName.getText();
            String des = txtDescribe.getText();
            Integer price = Integer.parseInt(txtPrice.getText());
            Integer amount = Integer.parseInt(txtAmount.getText());
            String sql_text = "INSERT INTO products(name,des,price,amount) VALUES('"+name+"','"+des+"',"+price+","+amount+")";
            Statement stm = conn.createStatement();
            // excuteUpdate sẽ trả về số lượng hàng ảnh hưởng
        //hmm
            int row_number = stm.executeUpdate(sql_text);
            if(row_number>0){
                Parent list = FXMLLoader.load(getClass().getResource("List.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }else{
                // thông báo validation
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
