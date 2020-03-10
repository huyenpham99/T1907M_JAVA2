package Assignment8;

import java.sql.Statement;
import java.sql.*;

public class Connector { //kết nối db và truy vấn csdl
    // tạo 1 file class conect database dùng nhiều nơi
    //trong java có trình dọn rác
    private String url = "jdbc:mysql://localhost:3306/T1907M"; // ở cuối là tên database
    private String username = "root";
    private String password = "";
    private Statement stm;
    // đặt static của chính hàm Connector để gọi lại mọi nơi
    private static Connector con; //không liên quan đến đối tượng khi sinh ra


    private Connector() { //khóa constructor lại
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connector getInstance() {
        // hàm sẽ trả về đối tượng connector nếu biến conn ở trên là null thì sẽ tạo đối tượng
        if (con == null) {
            con = new Connector();
            // đối tượng sẽ chỉ được tạo 1 lần thì kể cả class khác có gọi lại hoặc trong class đó thì cũng sẽ chỉ là 1 đối tượng được tạo ra
        }
        return con;
    }

    // tạo ra hàm chung để excuteQuerry
    public ResultSet getQuery(String sql) throws Exception {
        return stm.executeQuery(sql);
    }

    public Boolean excuteUpdate(String sql) throws Exception {
        if (stm.executeUpdate(sql) > 0) {
            return true;
        }
        return false;
    }
}