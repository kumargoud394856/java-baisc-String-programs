package com.ojas.CMS.dao.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ojas.CMS.query.query;

public class AdminCustomerdaoImpl implements adminCustomer {

	@Override
	public String addCustomer(String cname, long mobile, String address, String wallet, int rid) {

		String msg = null;
		try {
			Connection con = com.ojas.CMS.db.DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement(query.ADDCUSTOMERS);
			ps.setString(1, cname);
			ps.setLong(2, mobile);

			ps.setString(3, address);
			ps.setString(4, wallet);
			ps.setInt(5, rid);
			int n = ps.executeUpdate();
			if (n != 0) {
				msg = "Successfully Vendror added......";
			} else {
				msg = "Notable to added.Please try again...";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;

	
	}

}
