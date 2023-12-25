package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBconnection;

public class Deleteaccount 
{
	  public static int Deleteaccountnuano(Integer ano)
	  {
	      int result=0;
	 	  String query="delete from bank where ano=?";
		  try
		  {
			  Connection con=DBconnection.getconeection();
			  PreparedStatement ps=con.prepareStatement(query);
			  ps.setInt(1, ano);
			  result=ps.executeUpdate();
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
          return result; 
	  }
}
