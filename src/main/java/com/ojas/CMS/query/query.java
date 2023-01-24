package com.ojas.CMS.query;

public interface query {
	/**
	 *  LOGINUSE & FORGOTUSER is static final Constant variable which  is this 
	 *  we have storeed query . there queries are static using 'query' Interface we can call this variables as query
	 */
   public static final String LOGINUSE="SELECT roles.rname FROM cms.roles WHERE rid = (SELECT rid FROM cms.users u WHERE u.uname=? AND u.pass=?)";
   public static final String FORGOTUSER="SELECT u.password FROM pms.users u WHERE u.username=? AND u.rid=(SELECT rid FROM pms.roles WHERE rname=?)";
   // admin vendor 
   public static final String ADDVENDOR="INSERT INTO vendor(vname,email,mobile,address) VALUES(?,?,?,?)";
   public static final String ADDCUSTOMERS="INSERT INTO customer VALUES(?,?,?,?,?)";
   public static final String VIEWVENDOR="SELECT * FROM vendor";
   
   /**
    *   
    * 
    */
   public static final String   ADDFOODITEMS="INSERT INTO food_items VALUES(?,?,?,?)";
   public static final String   VIEWALLFOODITEMS="SELECT * FROM food_Items";
   public static final String   VIEWFOODITEM="SELECT * FROM food_items WHERE fid=?";
   public static final String   	UPDATEFOODITEMS=" UPDATE food_items SET fname=? ,qty=? ,price=? WHERE fid=?";
   public static final String DELETEFOODITEMS="DELETE * FROM food_items WHERE fid=?";
   /**
    *  Customer
    */
 public static final String VIEWALLFOODITEMSFORCUSTOMER="SELECT * FROM foodItems";
 
   
}
