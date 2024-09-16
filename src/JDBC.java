import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        System.out.println("Welcome To JDBC ");

        String url="jdbc:mysql://127.0.0.1:3306/dbdemo";
        String user="root";
        String password="Root@123";

        try (Connection connection = DriverManager.getConnection(url,user,password)){
            System.out.println(connection);
            System.out.println("Connected to Database");
        }
        catch (SQLException e){
            System.out.println("Connection Failed"+e.getMessage());
        }

    }
}
