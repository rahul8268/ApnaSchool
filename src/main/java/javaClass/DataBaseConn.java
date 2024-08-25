package javaClass;

import java.sql.Connection;
import java.sql.DriverManager;


public class DataBaseConn {
	
	private static final String URL="jdbc:mysql://localhost:3307/apnaschool";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	
	Connection connection=null;
	public Connection CheckConn() {
		
	
			
		//	Class.forName("com.mysql.cj.jdbc-Driver");
			try {
				
				 Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (Exception e) {
				System.out.println("conncter not fount");
			}
			
			 try {
			
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("connected");
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("not connect"+ e.getMessage());
		}
		
		return connection;
		
	}
}
