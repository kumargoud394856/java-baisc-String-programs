package com.ojas.CMS.dao;

import java.util.List;

import com.ojas.CMS.model.FoodItems;

public interface ItemVenderDao {
    
	    public int addFoodItem(FoodItems foodItems);
	    public FoodItems viewFoodItem(int id);
	    public List<FoodItems> viewAllFoodIt();
	    public int updateFoodItem(int Fid,String fname,double qty,double price);
	    public int deleteFoodItem( int id);
	    default void sales() {
	    	 //default method 
	    }
	    
}
