package com.ojas.CMS.model;

import java.util.Objects;

public class Vendor {

	 private int vid;
	 private String vname;
	 private String email;
	 private long  mob;
	 private String adress;
	public Vendor() {
		
	}
	public Vendor(int vid, String vname, String email, long mob, String adress) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.email = email;
		this.mob = mob;
		this.adress = adress;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", email=" + email + ", mob=" + mob + ", adress=" + adress
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adress, email, mob, vid, vname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(email, other.email) && mob == other.mob
				&& vid == other.vid && Objects.equals(vname, other.vname);
	}
	 
	 
}
