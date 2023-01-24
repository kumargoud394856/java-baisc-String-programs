package com.ojas.CMS.dao;

import java.util.List;

import com.ojas.CMS.model.FoodItems;

public interface CustomerDao {
	
   public  FoodItems viewfoodItems(int fid) ;
   public  List<FoodItems> viewAllFoodItems();
   public  void oderFoodItems(String fname,double qty);
   public  int cancleFoodItems(int fid);
   public  void addCart();
   public  void viewCart();
   public  void cancelCart();
   
	   
   

}
