package com.GroceryBookings.Entities;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderId;
	
	@ManyToOne
	@JoinColumn(name = "UserId")
	private User user;
	
	@OneToMany(mappedBy = "GroceryOrderId",cascade = CascadeType.ALL)
	List<GroceryOrder> groceryOrder;

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<GroceryOrder> getGroceryOrder() {
		return groceryOrder;
	}

	public void setGroceryOrder(List<GroceryOrder> groceryOrder) {
		this.groceryOrder = groceryOrder;
	}

	public Orders(int orderId, User user, List<GroceryOrder> groceryOrder) {
		super();
		OrderId = orderId;
		this.user = user;
		this.groceryOrder = groceryOrder;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", user=" + user + ", groceryOrder=" + groceryOrder + "]";
	}
	
	

}
