/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.LoginBean;
import com.utils.JDBCUtils;

/**
 *
 * @author falcon
 */
public class LoginDAO {

	public boolean validateLogin( LoginBean login ) throws ClassNotFoundException {
		
		boolean status = false; // default not login is false
		String SQL = "SELECT * FROM users WHERE username = ? AND password = ?";
		
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement preSta = connection.prepareStatement(SQL);
			preSta.setString(1, login.getUsername());
			preSta.setString(2, login.getPassword());

			ResultSet rs = preSta.executeQuery();

			status = rs.next();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return status;
	}

}
