import java.sql.*;

public class insertandupdatejdbc {

    public void insert(int id,String name)
    throws Exception {

        Connection con =
        DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/test",
        "root","password");

        PreparedStatement ps =
        con.prepareStatement(
        "insert into students values(?,?)");

        ps.setInt(1,id);
        ps.setString(2,name);

        ps.executeUpdate();
        con.close();
    }
}