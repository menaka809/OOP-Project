package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.AdminInformation;


public class AdminDBTask {
	
	private static Connection c2=null;
	private static Statement s2=null;
	private static ResultSet r2=null;
	
	
	public static List<AdminInformation> verify(String nic,String password){
		ArrayList<AdminInformation> by=new ArrayList<>();
		
		//validate user
		try {
		
	
		 
		 c2=DataBaseConnect.getDBConnect();
		 s2=c2.createStatement();
		 String sqla="select * from admin where nic='"+nic+"'and password='"+password+"'";
		 r2=s2.executeQuery(sqla);
		
			
		 if(r2.next()) {
		
			String uNic=r2.getString(2);
			String uPassword=r2.getString(3);
			AdminInformation a1=new AdminInformation(uNic,uPassword);
			by.add(a1);
		}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return by;
	}

}
