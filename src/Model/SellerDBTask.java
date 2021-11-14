package Model;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.SellerUserInformation;


public class SellerDBTask {
	
	private static Connection c1=null;
	private static Statement s1=null;
	private static ResultSet r1=null;
	
	public static List<SellerUserInformation> verify(String nic,String password){
		ArrayList<SellerUserInformation> by=new ArrayList<>();
		
		//validate user
		try {
		
	
		 
		 c1=DataBaseConnect.getDBConnect();
		 s1=c1.createStatement();
		 String sqla="select * from seller where nic='"+nic+"'and password='"+password+"'";
		 r1=s1.executeQuery(sqla);
		
			
		 if(r1.next()) {
			String uFirstName=r1.getString(2);
			String uLastName=r1.getString(3);
			String uNic=r1.getString(4);
			String uEmail=r1.getString(5);
			String uPhone=r1.getString(6);
			String uAddress=r1.getString(7);
			String uPostalCode=r1.getString(8);
			String uComName=r1.getString(9);
			String uComAddress=r1.getString(10);
			String uComPhone=r1.getString(11);
			String uPassword=r1.getString(12);
			SellerUserInformation s1=new SellerUserInformation(uFirstName,uLastName,uNic,uEmail,uPhone,uAddress,uPostalCode,uComName,uComAddress,uComPhone,uPassword);
			by.add(s1);
		}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return by;
	}

}
