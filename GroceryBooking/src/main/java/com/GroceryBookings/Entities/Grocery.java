package com.GroceryBookings.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Grocery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int GroceryId;
	private String GroceryName;
	private double groceryPrice;
	
	@OneToMany(mappedBy = "grocery",cascade = CascadeType.ALL)
	private List<Stocks> stocks;

	public int getGroceryId() {
		return GroceryId;
	}

	public void setGroceryId(int groceryId) {
		GroceryId = groceryId;
	}

	public String getGroceryName() {
		return GroceryName;
	}

	public void setGroceryName(String groceryName) {
		GroceryName = groceryName;
	}

	public double getGroceryPrice() {
		return groceryPrice;
	}

	public void setGroceryPrice(double groceryPrice) {
		this.groceryPrice = groceryPrice;
	}

	public List<Stocks> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stocks> stocks) {
		this.stocks = stocks;
	}

	
	
	public Grocery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grocery(int groceryId, String groceryName, double groceryPrice, List<Stocks> stocks) {
		super();
		GroceryId = groceryId;
		GroceryName = groceryName;
		this.groceryPrice = groceryPrice;
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Grocery [GroceryId=" + GroceryId + ", GroceryName=" + GroceryName + ", groceryPrice=" + groceryPrice
				+ ", stocks=" + stocks + "]";
	}
	
	
	
	

}
