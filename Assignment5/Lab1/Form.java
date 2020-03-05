package Lab1;

import javafx.scene.control.TextField;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submitStudent() {
        String name = txtName.getText();
        Integer age = Integer.parseInt(txtAge.getText());
        Integer mark = Integer.parseInt(txtMark.getText());
        Student s = new Student(name, age, mark);
        Main.students.add(s);
        //Show ra danh sach
        Main.students.stream().forEach(e->{
            System.out.println(e.getName() + "-" + e.getAge() + "-" +e.getMark());
        });


    }
}
