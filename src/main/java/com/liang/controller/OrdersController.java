package com.liang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liang.jpa.entity.Orders;
import com.liang.jpa.service.OrdersService;

@RestController
@RequestMapping("/fruitShop")
public class OrdersController {

	@Autowired
	OrdersService ordersService;

	@GetMapping("/allOrders")
	public List<Orders> findAllOrders() {

		return ordersService.findAll();
	}

	@GetMapping("/customerOrders/{customer}")
	public List<Orders> findOrdersByCustomer(@PathVariable(value = "customer") String customer) {
		
		return ordersService.findOrdersByCustomer(customer);
	}

}
