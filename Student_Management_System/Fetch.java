package school;

import java.sql.*;
import school.Helper;

public class Fetch {

	public void fetchdata()throws Exception{
    	Connection conn=Helper.con();
		Statement stm=conn.createStatement(); 
    	ResultSet r=stm.executeQuery("select * from schooldata");
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));			
             }
	  }
}
