package com.liang.jpa.service;

import java.util.List;


import com.liang.jpa.entity.Fruit;

public interface FruitService {
	

	List<Fruit> findAll();
	
	Fruit findFruitByFruitName(String fruitName);
	
	
	

}
