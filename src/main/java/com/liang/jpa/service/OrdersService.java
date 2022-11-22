package com.liang.jpa.service;

import java.util.List;

import com.liang.jpa.entity.Orders;

public interface OrdersService {
	
	void insert(Orders orders);
	
	List<Orders> findAll();
	
	Orders findByCustomer(String customer);
	
	List<Orders> findOrdersByCustomer(String customer);

}
