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

//            Statement statement = connection.createStatement();
//            String query="SELECT * FROM employee_payroll";
//
//            ResultSet resultSet = statement.executeQuery(query);
//
//
//            while (resultSet.next()){
//                int id = resultSet.getInt("Id");
//                String name = resultSet.getString("name");
//                double salary = resultSet.getDouble("salary");
//                java.sql.Date start_date = resultSet.getDate("start_date");
//                System.out.println("ID: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("Salary: "+salary);
//                System.out.println("Date: "+start_date);
//            }
            Statement statement = connection.createStatement();
//            String query = String.format("INSERT INTO employee_payroll (name, salary, start_date) VALUES ('%s', %f, '%s')","Sanjeev",300000.00,"2020-06-26");
//
            String query = String.format("UPDATE employee_payroll SET name='%s' WHERE id=%d", "Abhi", 2);

            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data Updated Successfully");
            }
            else {
                System.out.println("Data not Updated");
            }
        }
        catch (SQLException e){
            System.out.println("Connection Failed"+e.getMessage());
        }

    }
}
