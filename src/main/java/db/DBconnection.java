package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{

	  static Connection con=null;
	  public  static Connection getconeection()
	  {
		  try
		  {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingproject","root","ganesh");

		  } 
		  catch (Exception e)
		  {
			e.printStackTrace();
		  }
		  return con;
	  }

}
