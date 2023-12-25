package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import db.DBconnection;

public class Updateaccountdao 
{
	public static void main(String[] args) {
		System.out.println(getbalance(1));
	}
	public static Double getbalance(Integer ano)
	{
		  String query="select balance from bank where ano=?";
		  Double balance=0.0;
		  
		  try
		  {
			  Connection con=DBconnection.getconeection();
			  PreparedStatement ps=con.prepareStatement(query);
			  ps.setInt(1,ano);
			  ResultSet rs=ps.executeQuery();
			  while(rs.next())
			  {
				  balance=rs.getDouble(1);
			  }
			  
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
		  return balance;
	}
  public static int Depositemoney(Integer ano,Double amount)
  {
	  System.out.println("deposite dao"+ano);
	  String query="update bank set balance=(balance+?) where ano=?";
	  int result=0;
	  
	  try
	  {
		  Connection con=DBconnection.getconeection();
		  PreparedStatement ps=con.prepareStatement(query);
		  ps.setDouble(1, amount);
		  ps.setInt(2, ano);
		  result=ps.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  System.out.println("result from dao"+result);
	  return result; 
  }
  public static int Withdrawmoney(Integer ano,Double amount)
  {
      int result=0;
	  Double balance=getbalance(ano); 
	  if(balance>=amount)
	  {
 	  String query="update bank set balance=(balance-?) where ano=?";
	  
	  try
	  {
		  Connection con=DBconnection.getconeection();
		  PreparedStatement ps=con.prepareStatement(query);
		  ps.setDouble(1, amount);
          ps.setInt(2, ano);
		  result=ps.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  }
	  else
	  {
		  System.out.println("insufficient funds");
	  }
	  
	  return result; 
  }
  public static int Updatename(Integer ano,String name)
  {
	  String query="update bank set cname=? where ano=?";
	  int result=0;
	  try
	  {
		  Connection con=DBconnection.getconeection();
		  PreparedStatement ps=con.prepareStatement(query);
		  ps.setString(1, name);
		  ps.setInt(2,ano );
		  result=ps.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }	  
	  return result;
  }
}
