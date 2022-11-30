package com.student;
import java.sql.*;
public class Helper {
	// register mysql driver
	static {
		try {
			// registering
		Class.forName("com.mysql.cj.jdbc.driver");	
		}
		catch(Exception e){
			System.out.println(e);
		    }
		}
	public static Connection con() throws SQLException{
		// connection
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/c2268","root","root");
	}
}
