import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        System.out.println("Welcome To JDBC ");

        String url="jdbc:mysql://127.0.0.1:3306/dbdemo";
        String user="root";
        String password="Root@123";

        try (Connection connection = DriverManager.getConnection(url,user,password)){
            System.out.println(connection);
            System.out.println("Connected to Database");

            Statement statement = connection.createStatement();
            String query="SELECT * FROM employee_payroll";

            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()){
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");
                java.sql.Date start_date = resultSet.getDate("start_date");
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Salary: "+salary);
                System.out.println("Date: "+start_date);
            }

        }
        catch (SQLException e){
            System.out.println("Connection Failed"+e.getMessage());
        }

    }
}
