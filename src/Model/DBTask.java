package Model;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.UserInformation;

public class DBTask {
	private static Connection c=null;
	private static Statement s=null;
	private static ResultSet r=null;
	private static Connection c1=null;
	private static Statement s1=null;
	private static ResultSet r1=null;
	private static Connection c2=null;
	private static Statement s2=null;
	private static ResultSet r2=null;
	private static Connection c3=null;
	private static Statement s3=null;
	private static ResultSet r3=null;

	private static int success;
	
public static int validate(String nic,String password){
		
		//ArrayList <user> u1=new ArrayList<>();
		//create database connection
		String url="jdbc:mysql://localhost:3306/projectdb";
		String user="root";
		String pass="oop@12";
		
		//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			c=DataBaseConnect.getDBConnect();
			s=c.createStatement();
			String sql="select * from buyer where NIC='"+nic+"'and Password='"+password+"'";
			r=s.executeQuery(sql);
			
			 c1=DataBaseConnect.getDBConnect();
			 s1=c1.createStatement();
			 String sqla="select * from seller where nic='"+nic+"'and password='"+password+"'";
			 r1=s1.executeQuery(sqla);
			 
			
			 c2=DataBaseConnect.getDBConnect();
			 s2=c2.createStatement();
			 String sqlb="select * from admin where nic='"+nic+"'and password='"+password+"'";
			 r2=s2.executeQuery(sqlb);
			 
			 c3=DataBaseConnect.getDBConnect();
			 s3=c3.createStatement();
			 String sqlc="select * from accountant where nic='"+nic+"'and password='"+password+"'";
			 r3=s3.executeQuery(sqlc);
			
			if(r.next() ) {
				success=1;
				//String username=re.getString(1);
				//String password=re.getString(2);
				
				//user u=new user(username,password);
				//u1.add(u);
			}
			else if(r1.next()) {
				success=2;
			}
			else if(r2.next()) {
				success=3;
			}
			else if(r3.next()) {
				success=4;
			}
			else {
				success =8;
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return success;
		
		
	}
	
	
		
	


}
