package com.GroceryBookings.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class GroceryOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int GroceryOrderId;
	private int Quantity;
	
	@ManyToOne
	@JoinColumn(name = "OrderId")
	private Orders order;
	@ManyToOne
	@JoinColumn(name = "GroceryId")
	private Grocery grocery;
	public int getGroceryOrderId() {
		return GroceryOrderId;
	}
	public void setGroceryOrderId(int groceryOrderId) {
		GroceryOrderId = groceryOrderId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Grocery getGrocery() {
		return grocery;
	}
	public void setGrocery(Grocery grocery) {
		this.grocery = grocery;
	}
	public GroceryOrder(int groceryOrderId, int quantity, Orders order, Grocery grocery) {
		super();
		GroceryOrderId = groceryOrderId;
		Quantity = quantity;
		this.order = order;
		this.grocery = grocery;
	}
	public GroceryOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroceryOrder [GroceryOrderId=" + GroceryOrderId + ", Quantity=" + Quantity + ", order=" + order
				+ ", grocery=" + grocery + "]";
	}
	
	
	
}
