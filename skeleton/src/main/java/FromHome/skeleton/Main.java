package FromHome.skeleton;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main 
{

	public static void main(String[] args) 
	{
		String DB_REL_FILE = "/Users/iphoneloki/Documents/GitHubEx/skeleton/indirizzi.db3";
		
		String DB_URL = "jdbc:sqlite:/Users/iphoneloki/Documents/GitHubEx/skeleton/indirizzi.db3" + DB_REL_FILE;
		
		try 
		{			
			 Connection conn = DriverManager.getConnection(DB_URL);
			 if (conn != null) 
			 {
				   DatabaseMetaData meta = conn.getMetaData();
				   System.out.println("The driver name is " + meta.getDriverName());
				   System.out.println("A new database has been created.");
			 }
			 System.out.println("il file esiste? " + new File(DB_REL_FILE).exists());
		} 
		catch (SQLException e) 
		{
		  System.out.println(e.getMessage());
		}
	}

}
