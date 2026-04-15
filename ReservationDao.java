package com.oupp.restaurant.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.oupp.restaurant.model.Reservation;;
public class ReservationDao {
	public static int getReservation(Reservation reservation)throws ClassNotFoundException
	{
		String Insert_Statement="INSERT INTO RESERVATION"+"id,date,time,partysize,customername,phonenumber,tableid"+
								"(?,?,?,?,?,?,?);";
		
		int result=0;
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb?allowPublicKeyRetrieval=true&useSSL=false","root","5518"))
		{
			//Creating connection object
			PreparedStatement preparedstatement=connection.prepareStatement(Insert_Statement);
			//preparedstatement.setInt(1, 1);
			preparedstatement.setString(1, reservation.getId());
			preparedstatement.setString(2, reservation.getDate());
			preparedstatement.setString(3, reservation.getTime());
			preparedstatement.setString(4, reservation.getPartySize());
			preparedstatement.setString(5, reservation.getCustomerName());
			preparedstatement.setString(6, reservation.getPhoneNumber());
			preparedstatement.setString(7, reservation.getTableId());
			//System.out.println(preparedstatement);
			//execute thw query or update
			result=preparedstatement.executeUpdate();
			
		}catch(SQLException e){
			//processs sql exception
			e.printStackTrace();
		}
		return result;
	}

}
