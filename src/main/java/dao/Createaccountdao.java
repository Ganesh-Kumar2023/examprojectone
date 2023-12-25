package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBconnection;
import dto.Bankdto;

public class Createaccountdao 
{

	  public static int Insertdetails(Bankdto dto)
	  {
		  String query="insert into bank(cname, gender, branch, balance) values(?,?,?,?)";
		  int result=0;
		  try
		  {
			  Connection con=DBconnection.getconeection();
			  PreparedStatement ps= con.prepareStatement(query);
			  ps.setString(1, dto.getCname());
			  ps.setString(2, dto.getGender());
			  ps.setString(3, dto.getBranch());
			  ps.setDouble(4, dto.getBalance());
			  result=ps.executeUpdate();
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
		  return result;
	  }

}
