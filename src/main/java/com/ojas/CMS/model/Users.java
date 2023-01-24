package com.ojas.CMS.model;

import java.util.Objects;

public class Users {

	   private int userId;
	   private String userName;
	   private String  password;
	   private String email;
	   private double mob;
	   private String adress;
	   private int rid;
	public Users() {
		
	}
	public Users(int userId, String userName, String password, String email, double mob, String adress, int rid) {
		
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mob = mob;
		this.adress = adress;
		this.rid = rid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMob() {
		return mob;
	}
	public void setMob(double mob) {
		this.mob = mob;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", mob=" + mob + ", adress=" + adress + ", rid=" + rid + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adress, email, mob, password, rid, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(email, other.email)
				&& Double.doubleToLongBits(mob) == Double.doubleToLongBits(other.mob)
				&& Objects.equals(password, other.password) && rid == other.rid && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}
	
	   
	   
}
