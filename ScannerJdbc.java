package com.student;

import java.sql.*;
import java.util.Scanner;

public class ScannerJdbc {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter id :");
		int sid=scan.nextInt();
		System.out.print("enter student name : ");
		String sname=scan.next();
		System.out.print("enter phone number :");
		int sphone=scan.nextInt();
		System.out.print("enter address : ");
		String saddress=scan.next();
		
		try {
			    //registering my sql driver
			 	Class.forName("com.mysql.cj.jdbc.Driver");
			 	//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c2268","root","root");
				PreparedStatement stmt;
				//inserting data in database table
				String s="insert into student_manage values(?,?,?,?)";
				stmt=con.prepareStatement(s);
				stmt.setInt(1,sid);
				stmt.setString(2, sname); 
				stmt.setInt(3,sphone);
				stmt.setString(4, saddress);
				stmt.execute();
				System.out.println("______inserted successfully____");
		 }
        catch(Exception e) {
	          System.out.println(e);
                }
	    }
}