package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.AccountantInformation;

public class AccountantDBTask {
	
	private static Connection c3=null;
	private static Statement s3=null;
	private static ResultSet r3=null;
	
	
	public static List<AccountantInformation> verify(String nic,String password){
		ArrayList<AccountantInformation> by=new ArrayList<>();
		
		//validate user
		try {
		
	
		 
		 c3=DataBaseConnect.getDBConnect();
		 s3=c3.createStatement();
		 String sqla="select * from accountant where NIC='"+nic+"'and Password='"+password+"'";
		 r3=s3.executeQuery(sqla);
		
			
		 if(r3.next()) {
			String uFirstName=r3.getString(2);
			String uLastName=r3.getString(3);
			String uNic=r3.getString(2);	
			String uEmail=r3.getString(5);
			String uPassword=r3.getString(3);
			AccountantInformation ad1=new AccountantInformation(uFirstName,uLastName,uNic,uEmail,uPassword);
			by.add(ad1);
		}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return by;
	}


}
