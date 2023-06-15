import java.sql.*;

public class DatabaseConnectivityExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "root";
        
        try {
            // Get a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement object
            Statement statement = connection.createStatement();

            // Execute a query and store the result set
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

            // Print out the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " " + resultSet.getString("name"));
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();
        }
        
        catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}