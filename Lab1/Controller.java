package Lab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
    @FXML
    private TextField txtMark;
    public static ArrayList<Student> list = new ArrayList<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void register(ActionEvent actionEvent){
        Student student = new Student();
        student.setName(txtName.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setMark(Double.parseDouble(txtMark.getText()));
        list.add(student);
        for (Student student1 :list){
            System.out.println("-----------------");
            System.out.println("Name"+student1.getName()+"Age"+student1.getAge()+"Mark"+student1.getMark());
        }
    }
}
