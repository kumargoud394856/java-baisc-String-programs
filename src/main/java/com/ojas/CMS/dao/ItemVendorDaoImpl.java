package com.ojas.CMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ojas.CMS.db.DBUtility;
import com.ojas.CMS.model.FoodItems;
import com.ojas.CMS.query.query;

public class ItemVendorDaoImpl implements ItemVenderDao {

	      Connection con=null;
	      FoodItems foodItems=null;
	     
	@Override
	public int addFoodItem(FoodItems foodItems) {
		 int status=0;
		    try {
		    	   
		    	
		    	Connection con=DBUtility.getConnection();
		    	PreparedStatement ps=con.prepareStatement(query.ADDFOODITEMS);
		    
		    	ps.setString(2, foodItems.getFname());
		    	ps.setDouble(3, foodItems.getQty());
		    	ps.setDouble(4, foodItems.getPrice());
		    	ps.setInt(5, foodItems.getVid());
		    	status= ps.executeUpdate();
		    	
		    	
		    	
		    	
		    }catch(Exception e) {
		    	
		    }
		  
		
		return status;
	}

	@Override
	public FoodItems viewFoodItem(int id) {
		
		      FoodItems foodItems=new FoodItems();
			 try {
				Connection con=DBUtility.getConnection();
				 PreparedStatement ps=con.prepareStatement(query.ADDFOODITEMS);
				 ps.setInt(1, id);
				 ResultSet rs=ps.executeQuery();
				 rs.next();
				 foodItems.setFid(rs.getInt("fid"));
				 foodItems.setFname(rs.getString("fname"));
				 foodItems.setQty(rs.getDouble("qty"));
				 foodItems.setPrice(rs.getDouble("price"));
				 foodItems.setVid(rs.getInt("vid"));
				 
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return foodItems;
			 
			  
	}
	@Override
	public List<FoodItems> viewAllFoodIt() {
		List<FoodItems> foodItemList=new ArrayList<>();
		FoodItems foodItems=new  FoodItems();
		try {
			  Connection con=DBUtility.getConnection();
			  PreparedStatement ps=con.prepareStatement(query.VIEWALLFOODITEMS);
			   ResultSet rs=ps.executeQuery();
			    while (rs.next()) {
			    	 foodItems.setFid(rs.getInt("fid"));
					 foodItems.setFname(rs.getString("fname"));
					 foodItems.setQty(rs.getDouble("qty"));
					 foodItems.setPrice(rs.getDouble("price"));
					 foodItems.setVid(rs.getInt("vid"));
					 foodItemList.add(foodItems);
					
				}
			  
		}catch (Exception e) {
			e.printStackTrace();
		}
		return foodItemList;
	}

	@Override
	public int updateFoodItem(int fid,String fname,double qty,double price ) {
		int status=0;
		try
		{
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement(query.UPDATEFOODITEMS);
			ps.setString(1,fname);
			ps.setDouble(2, qty);
			ps.setDouble(3, price);
			ps.setInt(4, fid);
			status=ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int deleteFoodItem(int id) {
		
		int status=0;
		try {
			Connection con=DBUtility.getConnection();
			 PreparedStatement ps=con.prepareStatement(query.DELETEFOODITEMS);
			  ps.setInt(1, id);
			status=  ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
