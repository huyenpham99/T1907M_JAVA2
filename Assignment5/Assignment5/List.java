package Assignment5;

import Lab1.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Student> listView = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            //stepp 2: khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/T1907M";
            String username = "root";
            String password = "";
            //step 4: ket noi
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql_text = "SELECT * FROM student";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);
            ObservableList ls = FXCollections.observableArrayList();
            while (rs.next()) {
                Student st = new Student(rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
                ls.add(st);
            }
            listView.setItems(ls);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Step 4: kết nối với database

        }
    }

    public void form() {
        //day la noi chuyen man hinh
        try {
            Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Main.mainStage.getScene().setRoot(form);

        } catch (Exception e) {

        }
    }
}
