import java.sql.*;

public class transactionjdbc {

    public static void main(String[] args)
    throws Exception {

        Connection con =
        DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/test",
        "root","password");

        con.setAutoCommit(false);

        try {

            Statement st = con.createStatement();

            st.executeUpdate(
            "update accounts set balance=balance-500 where id=1");

            st.executeUpdate(
            "update accounts set balance=balance+500 where id=2");

            con.commit();

            System.out.println("Transfer Success");

        } catch(Exception e) {

            con.rollback();

            System.out.println("Transfer Failed");
        }
    }
}