package com.ojas.CMS.model;

import java.util.Objects;

public class Cart {
     private int cartId;

	public Cart(int cartId) {
		
		this.cartId = cartId;
	}

	public Cart() {
		
		// TODO Auto-generated constructor stub
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return cartId == other.cartId;
	}
     
}
