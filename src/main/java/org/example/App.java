package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    Connection conn = null;

    public static void main( String[] args )
    {
        
        try{
        	SQLServerDataSource ds = new SQLServerDataSource(); 
        	
        	ds.setServerName("DESKTOP-ON7JO5N");  
        	//ds.setPortNumber(1433);
        	ds.setDatabaseName("Club");  
        	ds.setUser("sa");
        	ds.setPassword("123456");
        	ds.setTrustServerCertificate(true);
        	
        	Connection con = ds.getConnection(); 
        	Statement sql = con.createStatement();
        	ResultSet result = sql.executeQuery("SELECT * from Socio");
        	
        	while(result.next()) {
        		System.out.println(result);
        	}
        	
            System.out.println("Se conectp");
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
