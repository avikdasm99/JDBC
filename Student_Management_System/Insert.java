package school;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import school.Helper;

public class Insert {
      public  void insertdata() throws Exception{
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter Roll : ");
	     int roll=s.nextInt();
	     System.out.println("Enter Name : ");
	     String name=s.next();
	     System.out.println("Enter Age : ");
	     int age=s.nextInt();
	         Connection c1=Helper.con();
	    	 PreparedStatement stm= c1.prepareStatement("insert into schooldata values(?,?,?)");
	    	 stm.setInt(1,roll);
	    	 stm.setString(2, name);
	    	 stm.setInt(3,age);
	    	 stm.executeUpdate();
	    	 System.out.println("____inserted successfully___");	 
	     
	     
    }	
}
