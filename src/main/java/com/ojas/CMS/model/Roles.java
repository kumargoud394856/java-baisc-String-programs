package com.ojas.CMS.model;

import java.util.Objects;

public class Roles {
     private int rid;
     private String rname;
	public Roles() {
		
		// TODO Auto-generated constructor stub
	}
	public Roles(int rid, String rname) {
		
		this.rid = rid;
		this.rname = rname;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "Roles [rid=" + rid + ", rname=" + rname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rid, rname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roles other = (Roles) obj;
		return rid == other.rid && Objects.equals(rname, other.rname);
	}
     
}
