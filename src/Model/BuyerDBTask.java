package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.UserInformation;

public class BuyerDBTask {
	
	private static Connection c=null;
	private static Statement s=null;
	private static ResultSet r=null;
	public static List<UserInformation> verify(String nic,String password){
		ArrayList<UserInformation> by=new ArrayList<>();
		
		//validate user
		try {
		
		c=DataBaseConnect.getDBConnect();
		s=c.createStatement();
		String sql="select * from buyer where NIC='"+nic+"'and Password='"+password+"'";
		r=s.executeQuery(sql);
		 
		
		/* c2=DataBaseConnect.getDBConnect();
		 s2=c2.createStatement();
		 String sqlb="select * from user_information where nic='"+nic+"'and password='"+password+"'";
		 r2=s2.executeQuery(sql);
		 
		 c3=DataBaseConnect.getDBConnect();
		 s3=c3.createStatement();
		 String sqlc="select * from user_information where nic='"+nic+"'and password='"+password+"'";
		 r3=s3.executeQuery(sql);*/
			
		
		if(r.next()) {
			
			String uFirstName=r.getString(2);
			String uLastName=r.getString(3);
			String uNic=r.getString(4);
			String uEmail=r.getString(5);
			String uPhone=r.getString(6);
			String uAddress=r.getString(7);
			String uPostalCode=r.getString(8);
			String uComName=r.getString(9);
			String uComAddress=r.getString(10);
			String uComPhone=r.getString(11);
			String uPassword=r.getString(12);
			
			UserInformation b1=new UserInformation(uFirstName,uLastName,uNic,uEmail,uPhone,uAddress,uPostalCode,uComName,uComAddress,uComPhone,uPassword);
			by.add(b1);
		}
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return by;
	}
	

}
