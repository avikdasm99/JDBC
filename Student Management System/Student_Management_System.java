package com.sms.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.sms.delete.Delete;
import com.sms.fetch.Fetch;
import com.sms.insert.Insert;
import com.sms.update.Update;
public class Student_Management_System{

	public static void main(String[] args) throws SQLException{
		Scanner sc=new Scanner(System.in);
		Insert i=new Insert();
		Update u=new Update();
		Delete d=new Delete();
		Fetch f=new Fetch();
		System.out.println("Welcome to the Student Management System .");
		while(true) {
			System.out.println("+++++++++++++++++++++++++++++++");
			System.out.println("+++++++++++++++++++++++++++++++");
			System.out.println("||||      1  ->  insert    ||||");
			System.out.println("||||      2  ->  update    ||||");
			System.out.println("||||      3  ->  delete    ||||");
			System.out.println("||||      4  ->  display   ||||");
			System.out.println("+++++++++++++++++++++++++++++++");
			System.out.println("+++++++++++++++++++++++++++++++");
			int choice=sc.nextInt(); 
			if(choice==1) {
				i.saveData();
			}else if(choice==2) {
				u.updateData();
			}else if(choice==3) {
				d.deleteData();
			}else if(choice==4) {
				f.fetchData();
			}
		}
	}

}
