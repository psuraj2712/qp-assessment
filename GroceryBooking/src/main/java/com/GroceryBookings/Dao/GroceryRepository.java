package com.GroceryBookings.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GroceryBookings.Entities.Grocery;



public interface GroceryRepository extends JpaRepository<Grocery, Integer> {
	
	//  public Grocery findByGroceryId(int GroceryId);

}
