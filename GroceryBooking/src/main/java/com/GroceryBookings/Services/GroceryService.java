package com.GroceryBookings.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.GroceryBookings.Dao.GroceryRepository;
import com.GroceryBookings.Entities.Grocery;

@Service
public class GroceryService {

	@Autowired
	private GroceryRepository groceryRepository;

	// Get all Groceries
	public List<Grocery> getAllGroceries() {
		return groceryRepository.findAll();

	}

	public Optional<Grocery> getItemById(Integer id) {
		return groceryRepository.findById(id);
	}

	public Grocery createItems(Grocery items) {
		return groceryRepository.save(items);
	}

	public Grocery updateItems(int id, Grocery updateItems) {
		Grocery items = groceryRepository.findById(id).orElse(null);
		if (items != null) {
			items.setGroceryName(updateItems.getGroceryName());
			items.setGroceryPrice(updateItems.getGroceryPrice());
			return groceryRepository.save(items);
		}
		return null;
	}

	public void deleteItem(Integer id) {
		groceryRepository.deleteById(id);
	}

}
