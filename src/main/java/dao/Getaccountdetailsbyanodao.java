package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBconnection;
import dto.Bankdto;

public class Getaccountdetailsbyanodao 
{


	public static Bankdto Getdetailsbyano(Integer ano)
	{
		Bankdto dto=null;
		String Getdetailsbiano="select * from bank where ano=?";
		try
		{
			Connection con=DBconnection.getconeection();
			PreparedStatement ps= con.prepareStatement(Getdetailsbiano);
			ps.setInt(1,ano);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				dto=new Bankdto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return dto;
	}

}
