package com.ojas.CMS.model;

import java.util.Date;
import java.util.Objects;

public class OrderFood_Items {
       private int oid;
       private Date date;
	public OrderFood_Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderFood_Items(int oid, Date date) {
		super();
		this.oid = oid;
		this.date = date;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "OrderFood_Items [oid=" + oid + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, oid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderFood_Items other = (OrderFood_Items) obj;
		return Objects.equals(date, other.date) && oid == other.oid;
	}
        
       
}
