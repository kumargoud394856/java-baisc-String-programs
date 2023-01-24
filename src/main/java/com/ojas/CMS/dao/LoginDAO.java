package com.ojas.CMS.dao;

public interface LoginDAO {
      public String login(String uname,String type);
      public String forgotPassword(String uname,String type);
}
