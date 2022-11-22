package com.liang.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liang.jpa.entity.FruitCart;
import com.liang.jpa.service.FruitCartService;

@RestController
@RequestMapping("/fruitShop")
public class FruitCartController {
	
	@Autowired
	FruitCartService fruitCartService;
	
	
	@GetMapping("/fruitCart/{customer}")
	public List<FruitCart> findFruit(@PathVariable(value = "customer") String customer){
		
		return fruitCartService.findFruitCartByCustomer(customer);
		
	}
	

	
	
}
