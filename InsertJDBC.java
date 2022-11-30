package com.student;
import java.sql.*;  
public class InsertJDBC {

	public static void main(String[] args) {
		try{  
			// registering
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c2268","root","root");  
			 // create Statement
			Statement stmt=con.createStatement();
			// inserting data into database table
			stmt.executeUpdate("insert into Student_Manage values(1,'Avik',6289417909,'Kolkata')");
			stmt.executeUpdate("insert into Student_Manage values(2,'Sanjib',6289417909,'Kolkata')");
			stmt.executeUpdate("insert into Student_Manage values(3,'Ratan',6289417909,'Kolkata')");
			stmt.executeUpdate("insert into Student_Manage values(4,'Joy',6289417909,'Kolkata')");
			stmt.executeUpdate("insert into Student_Manage values(5,'Somnath',6289417909,'Kolkata')");
			System.out.println("insert Successfully");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


