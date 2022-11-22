package com.liang.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.jpa.dao.OrdersDAOJpa;
import com.liang.jpa.entity.Orders;
import com.liang.jpa.service.OrdersService;


@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersDAOJpa ordersDAOJpa;

	@Override
	public void insert(Orders orders) {
		// 將購物車內的資料加入訂單中
	}

	@Override
	public List<Orders> findAll() {
		
		//搜尋所有訂單，OK
		
		return ordersDAOJpa.findAll();
	}

	@Override
	public Orders findByCustomer(String customer) {
		
		//搜尋該顧客的所有訂單，OK
		
		return null;
	}

	@Override
	public List<Orders> findOrdersByCustomer(String customer) {
		return ordersDAOJpa.findOrdersByCustomer(customer);
	}

}
