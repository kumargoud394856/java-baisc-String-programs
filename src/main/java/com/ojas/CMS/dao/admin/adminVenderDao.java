package com.ojas.CMS.dao.admin;

import com.ojas.CMS.model.Vendor;

public interface adminVenderDao {
	public String addVendor(String vname,String email,long mobile,String address);
      public Vendor viewvendor(int vid);
      
}
