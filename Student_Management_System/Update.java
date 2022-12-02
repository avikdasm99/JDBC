package school;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import school.Helper;

public class Update {
	Scanner s=new Scanner(System.in);

	public void updatedata()throws Exception{
		
		Connection c1=Helper.con();
		Statement stmt=c1.createStatement(); 
		System.out.println("enter name: ");
		String name=s.nextLine();
		System.out.println("enter roll : ");
		int roll=s.nextInt();
		stmt.executeUpdate("update schooldata set name='"+name+"' where Roll ="+roll);
    }
}
