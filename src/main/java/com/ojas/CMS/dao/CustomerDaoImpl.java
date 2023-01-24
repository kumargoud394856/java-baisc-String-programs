package com.ojas.CMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ojas.CMS.db.DBUtility;
import com.ojas.CMS.model.FoodItems;
import com.ojas.CMS.query.query;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public FoodItems viewfoodItems(int fid) {
		FoodItems foodItems=new FoodItems();
		
		try {
		   Connection con=DBUtility.getConnection();
		   PreparedStatement ps=con.prepareStatement(query.VIEWFOODITEM);
		   ps.setInt(1, fid);
		   ResultSet rs=ps.executeQuery();
		   rs.next();
		   foodItems.setFid(rs.getInt("fid"));
		   foodItems.setFname(rs.getString("fname"));
		   foodItems.setQty(rs.getDouble("qty"));
		   foodItems.setPrice(rs.getDouble("price"));
		   foodItems.setVid(rs.getInt("fid"));
		   
		   
		}catch(Exception e) {
			
		}
		   
		return foodItems;
	}

	@Override
	public List<FoodItems> viewAllFoodItems() {
		    List<FoodItems> foodItemsList=new ArrayList();
		    FoodItems foodItems=new FoodItems();
		    
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement(query.VIEWALLFOODITEMSFORCUSTOMER);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
			
				 foodItems.setFid(rs.getInt("fid"));
				 foodItems.setFname(rs.getString("fname"));
				 foodItems.setQty(rs.getDouble("qty"));
				 foodItems.setPrice(rs.getDouble("price"));
				 foodItems.setVid(rs.getInt("vid"));
				 foodItemsList.add(foodItems);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return foodItemsList;
	}

	@Override
	public void oderFoodItems(String fname, double qty) {
		
		
	}

	@Override
	public int cancleFoodItems(int fid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelCart() {
		// TODO Auto-generated method stub
		
	}

}
