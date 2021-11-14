package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnect {
	
	private static String url="jdbc:mysql://localhost:3306/projectdb";
	private static String user="root";
	private static String paWd="malith96";
	private static Connection conect;
	
	
	public static Connection getDBConnect() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conect=DriverManager.getConnection(url, user, paWd);
		}catch(Exception ex) {
			System.out.println("connection is failed");
			ex.getStackTrace();
		}
		return conect;
	
	}

}
