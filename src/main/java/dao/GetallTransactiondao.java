package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBconnection;
import dto.Transactiondto;


public class GetallTransactiondao 
{
	public static void main(String[] args) {
		System.out.println(GetallTransactiondao.Getdetailsbyano(5));
	}
	public static List<Transactiondto> Getdetailsbyano(Integer ano)
	{
		List<Transactiondto> transactiondetails=new ArrayList<Transactiondto>();
		String Getdetailsbiano="select * from transactions where ano=?";
		try
		{
			Connection con=DBconnection.getconeection();
			PreparedStatement ps= con.prepareStatement(Getdetailsbiano);
			ps.setInt(1,ano);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				transactiondetails.add(new Transactiondto(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4),rs.getDouble(5)));
			}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return transactiondetails;
	}

}
