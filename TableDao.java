package com.oupp.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.oupp.restaurant.model.Table;

public class TableDao {
	public static int getTable(Table table)throws ClassNotFoundException
	{
		String Insert_Statement="INSERT INTO RESTAURANTTABLE"+"id,capacity,available"+
								"(?,?,?);";
		int result=0;
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ouppdb?allowPublicKeyRetrieval=true&useSSL=false","root","5518"))
		{
			PreparedStatement ps=connection.prepareStatement(Insert_Statement);
			ps.setInt(1, table.getId());
			ps.setInt(2, table.getCapacity());
			ps.setBoolean(3, table.isAvailable());
			result=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
}
