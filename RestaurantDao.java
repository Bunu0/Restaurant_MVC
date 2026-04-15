package com.oupp.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.oupp.restaurant.model.Restaurant;

public class RestaurantDao {
	public static int getRestaurant(Restaurant restaurant)throws ClassNotFoundException
	{
		String Insert_Statement="INSERT INTO RESTAURANT"+"name,address,phoneNumber,capacity"+
								"(?,?,?,?);";
		
		int result=0;
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb?allowPublicKeyRetrieval=true&useSSL=false","root","5518"))
		{
			//Creating connection object
			PreparedStatement ps=connection.prepareStatement(Insert_Statement);
			ps.setString(1, restaurant.getName());
			ps.setString(2, restaurant.getAddress());
			ps.setString(3, restaurant.getPhoneNumber());
			ps.setString(4, restaurant.getCapacity());
			result=ps.executeUpdate();
			
		}catch(SQLException e){
			//processs sql exception
			e.printStackTrace();
		}
		return result;
	}
}
