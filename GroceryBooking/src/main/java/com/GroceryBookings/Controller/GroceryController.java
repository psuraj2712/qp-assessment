package com.GroceryBookings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GroceryBookings.Entities.Grocery;
import com.GroceryBookings.Services.GroceryService;

@RestController
public class GroceryController {
	@Autowired
	private GroceryService groceryService;
	//get all items
	@GetMapping("grocerybookings/admin/grocery-items")
	public ResponseEntity<List<Grocery>> getAllGrocery()
	{
		List<Grocery> groceries=groceryService.getAllGroceries();
		return ResponseEntity.ok().body(groceries);
	}
	
	//get single item
	
	
	
}
