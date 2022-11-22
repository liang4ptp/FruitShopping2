package com.liang.jpa.service;



import java.util.List;

import com.liang.jpa.entity.FruitCart;

public interface FruitCartService {
	
	void insertOrUpdate(FruitCart fruitCart);
	
	
	void deleteByCustomer(FruitCart fruitCart);
	
	List<FruitCart> findAll();
	
	void addQuantity(int quantity);
	
	void reduceQuantity(int quantity);
	
	List<FruitCart> findFruitCartByCustomer(String customer);
	
	String findFruitCartCustomer(String customer);
	

}
