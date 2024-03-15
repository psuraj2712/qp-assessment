package com.GroceryBookings.Entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Stocks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StockId;
	private int Quantity;
	@ManyToOne
	@JoinColumn(name ="GroceryId")
	private Grocery grocery;
	public int getStockId() {
		return StockId;
	}
	public void setStockId(int stockId) {
		StockId = stockId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Grocery getGrocery() {
		return grocery;
	}
	public void setGrocery(Grocery grocery) {
		this.grocery = grocery;
	}
	public Stocks(int stockId, int quantity, Grocery grocery) {
		super();
		StockId = stockId;
		Quantity = quantity;
		this.grocery = grocery;
	}
	public Stocks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stocks [StockId=" + StockId + ", Quantity=" + Quantity + ", grocery=" + grocery + "]";
	}
	
	
	
	
	

}
