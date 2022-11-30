package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    Connection conn = null;

    public static void main( String[] args )
    {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Club;integratedSecurity=true";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
