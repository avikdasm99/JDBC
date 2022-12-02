package school;
import java.sql.*;
public class Helper {
	static {
		try { Class.forName("com.mysql.cj.jdbc.driver"); }
		catch(Exception e) { System.out.println(e); }
	}
	
	public static Connection con()throws Exception {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
	}
	public static void main(String[] args)throws Exception{
		Insert obj1=new Insert();
		Fetch  obj2=new Fetch();
		Update obj3=new Update();
		Delete obj4=new Delete();
	    obj1.insertdata();
	    obj2.fetchdata();
	    obj3.updatedata();
	    obj4.deletedata();


	}
}
