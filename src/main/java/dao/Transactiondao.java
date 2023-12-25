package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBconnection;
import dto.Transactiondto;

public class Transactiondao 
{
	public static int  inserttransaction(Transactiondto dto)
	{
		System.out.println(dto);
		  int result=0;
		  String query="insert into transactions(date,amount,typeoftransaction,netamount,ano) values (?,?,?,?,?)";
		  Double netamount=Updateaccountdao.getbalance(dto.getAno());		  
		  try
		  {
			  Connection con=DBconnection.getconeection();
			  PreparedStatement ps=con.prepareStatement(query);
			  ps.setString(1, dto.getDate());
			  ps.setDouble(2, dto.getAmount());
			  ps.setString(3, dto.getTypeoftransaction());
			  ps.setDouble(4, netamount);
			  ps.setInt(5,dto.getAno());
			  result=ps.executeUpdate();	  
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
		  return result;
	}
}
