package com.ojas.CMS.dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ojas.CMS.db.DBUtility;
import com.ojas.CMS.query.query;

public class LoginDaoImpl implements LoginDAO {

	public String login(String uname, String password) {

		String userRole = null;
		System.out.println("hello ");
		PreparedStatement ps = null;
		try {

			
			
			Connection con = DBUtility.getConnection();

			ps = con.prepareStatement(
					"SELECT roles.rname FROM cms.roles WHERE rid = (SELECT rid FROM cms.users u WHERE u.uname=? AND u.pass=?)");
			ps.setString(1, uname);
			ps.setString(2, password);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				rs.next();
				userRole = rs.getString(1);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return userRole;
	}

	@Override
	public String forgotPassword(String uname, String type) {
		String password = null;
		Connection con = null;
		try {
			PreparedStatement ps = con.prepareStatement(query.FORGOTUSER);
			ps.setString(1, uname);
			ps.setString(2, type);
			ResultSet rs = ps.executeQuery();
			rs.next();
			password = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}

}
