package com.liang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liang.jpa.entity.Fruit;
import com.liang.jpa.service.FruitService;

@RestController
@RequestMapping("/fruitShop")
public class FruitController {

	@Autowired
	FruitService fruitService;

	@GetMapping(value = "/allFruits")
	public List<Fruit> findFruits() {

		return fruitService.findAll();
	}

	@GetMapping(value = "/oneFruit/{fruitName}")
	public Fruit findFruitByFruitName(@PathVariable(value = "fruitName") String fruitName) {
		Fruit fruit = fruitService.findFruitByFruitName(fruitName.trim());
		
		return fruit;
		
	}
	
	@PostMapping(value = "insertFruit")	
	public void insertOrUpdate(@Param("fruitName") String fruitName, @Param("fruitPrice") int fruitPrice) {
		Fruit fruit =  new Fruit();
		fruit.setFruitName(fruitName);
		fruit.setFruitPrice(fruitPrice);
		
		System.out.println("MISSION COMPLETE!");
	}
}
