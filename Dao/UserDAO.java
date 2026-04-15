package com.oupp.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private final String jdbcURL = "jdbc:mysql://localhost:3306/restaurantdb?allowPublicKeyRetrieval=true&useSSL=false";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "5518";

    public boolean isValidUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // If user exists, return true; otherwise, false
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
        return false;
    }
}

