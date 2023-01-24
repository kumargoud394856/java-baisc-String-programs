package com.ojas.CMS.model;

import java.util.Objects;

public class Customer {

	  private int cid;
	  private String cname;
	  private long mob;
	  private String address;
	  private String wallet;
	  private int rid;
	public Customer() {
		
	}
	public Customer(int cid, String cname, long mob, String address, String wallet, int rid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mob = mob;
		this.address = address;
		this.wallet = wallet;
		this.rid = rid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + ", address=" + address + ", wallet="
				+ wallet + ", rid=" + rid + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, cid, cname, mob, rid, wallet);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && cid == other.cid && Objects.equals(cname, other.cname)
				&& mob == other.mob && rid == other.rid && Objects.equals(wallet, other.wallet);
	}
	
	  
	  
	  
}
