package com.student;
import java.sql.*;
public class JDBC_Testcase {
	public static void main(String[] args) {
		try{  
			// registering
			Class.forName("com.mysql.cj.jdbc.Driver");  
			// connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c2268","root","root");  
	        // create Statement
			Statement stmt=con.createStatement(); 
			// execute query and fetch data from database
			ResultSet rs=stmt.executeQuery("select * from student_manage");  
			// iterating through columns
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getBigDecimal(3)+"  "+rs.getString(4));  
			}
			con.close();	
	        }
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
	
	
	
