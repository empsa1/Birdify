package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    public static void main(String[] args) {
        try {
            // Connect to the H2 database (in-memory)
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:birddb", "god", "creation");

            // Create a table
            Statement statement = conn.createStatement();
            String createTableSQL = "CREATE TABLE Bird (id INT AUTO_INCREMENT, name VARCHAR(50), PRIMARY KEY (id))";
            statement.executeUpdate(createTableSQL);

            // Insert data
            String insertDataSQL = "INSERT INTO employees (name) VALUES ('John'), ('Alice')";
            statement.executeUpdate(insertDataSQL);

            // Query data
            String query = "SELECT * FROM employees";
            var resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));
            }

            // Close resources and connection
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}