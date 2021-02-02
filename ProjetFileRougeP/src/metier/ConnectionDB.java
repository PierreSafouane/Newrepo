package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

	private static Connection connection;

	public static Connection getConnection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitealvin?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","" );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	
	
	
}
