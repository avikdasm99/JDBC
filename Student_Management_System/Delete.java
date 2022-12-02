package school;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import school.Helper;

public class Delete {
	Scanner s=new Scanner(System.in);
	public void deletedata()throws Exception{
        Connection c2=Helper.con();
		Statement stmt=c2.createStatement(); 
		System.out.println("enter roll : ");
		int roll=s.nextInt();
		stmt.executeUpdate("delete from schooldata where roll="+roll);
    }
}
