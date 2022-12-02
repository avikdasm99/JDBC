package com.student;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MenudrivenEg {

//	public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int eid,eage,esalary;
        String ename,ecity;
        //saving employee details in database
        public void saveMenudriven()throws SQLException{
        	System.out.println("Enter employee id :");
        	eid=s.nextInt();
        	System.out.println("enter employee name :");
        	ename=s.next();
        	System.out.println("Enter employee age :");
        	eage=s.nextInt();
        	System.out.println("enter employee city :");
        	ecity=s.next();
        	System.out.println("Enter employee salary :");
        	esalary=s.nextInt();
        	Connection conn=Helper.con();
        	PreparedStatement stmt=conn.prepareStatement("insert into menudriven values(?,?,?,?,?)");
        	stmt.setInt(1, eid);
        	stmt.setString(2, ename);
        	stmt.setInt(3, eage);
        	stmt.setString(4, ecity);
        	stmt.setInt(5, esalary);
        	stmt.executeUpdate();	
        }
        public void fetchMenudriven()throws SQLException{
        	Connection conn=Helper.con();
			Statement stmt=conn.createStatement(); 
        	ResultSet rs=stmt.executeQuery("select * from menudriven");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));			
	}
}
//updating
        public void updateMenudriven()throws SQLException{
        	Connection conn=Helper.con();
			Statement stmt=conn.createStatement(); 
			System.out.println("enter employee city : ");
			ecity=s.nextLine();
			System.out.println("enter employee id : ");
			eid=s.nextInt();
			stmt.executeUpdate("update menudriven set ecity='"+ecity+"' where eid="+eid);
        }
//deleting
		public void deleteMenudriven()throws SQLException{
	        Connection conn=Helper.con();
			Statement stmt=conn.createStatement(); 
			System.out.println("enter employee id : ");
			eid=s.nextInt();
			stmt.executeUpdate("delete from menudriven where eid="+eid);
        }
}