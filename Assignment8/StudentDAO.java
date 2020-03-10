package Assignment8;


import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO implements DAOCreate<Student> {
    private static StudentDAO instance;

    public StudentDAO() {
    }

    public StudentDAO getInstance() {
        if (instance == null)
            instance = new StudentDAO();
        return instance;
    }

    public ArrayList<Student> list() {
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM student");
            ArrayList<Student> ls = new ArrayList<>();
            while (rs.next()) {
                Assignment8.Student st = new Assignment8.Student(rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
                ls.add(st);

            }
            return ls;
        } catch (Exception e) {
        }
        return null;
    }

    public Student getOne(int id) {
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM student where id=" + id);
            while (rs.next()) {
                return new Student(rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Boolean create(Student student) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "INSERT INTO student(name, age, mark) VALUES('" + student.getName() + "', " + student.getAge() + ", " + student.getMark() + ")";
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {

        }
        return false;
    }

    public Boolean update(Student student) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "UPDATE student SET name=" + student.getName() +
                    "age =" + student.getAge() +
                    "mark= " + student.getMark() +
                    "where id=" + student.getId();
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {

        }
        return false;
    }

    public Boolean delete(Student student) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "DELETE FROM student WHERE id=" + student.getId();
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {

        }
        return false;
    }
}
