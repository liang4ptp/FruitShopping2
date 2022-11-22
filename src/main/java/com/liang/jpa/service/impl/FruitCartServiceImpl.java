package com.liang.jpa.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.jpa.dao.FruitCartDAOJpa;
import com.liang.jpa.entity.FruitCart;
import com.liang.jpa.service.FruitCartService;


@Service
public class FruitCartServiceImpl implements FruitCartService {
	
	@Autowired
	private FruitCartDAOJpa fruitCartDAOJpa;

	@Override
	public void insertOrUpdate(FruitCart fruitCart) {
		// 判斷是否有這個顧客，若無則是新增，若有則是更新
	}


	@Override
	public void deleteByCustomer(FruitCart fruitCart) {
		// 當該顧客完成結帳轉入訂單或是整個購物清單不要時使用。
	}


	@Override
	public void addQuantity(int quantity) {
		//增加購物車內水果數量，判斷quantity > 0
	}


	@Override
	public void reduceQuantity(int quantity) {
		//減少購物車內水果數量，判斷 原先的水果數量 => quantity > 0，若原先水果數量 = quantity，則刪除顧客該筆資料
	}


	@Override
	public List<FruitCart> findAll() {
		
		return fruitCartDAOJpa.findAll();
	}


	@Override
	public List<FruitCart> findFruitCartByCustomer(String customer) {
		
		
		return fruitCartDAOJpa.findFruitCartByCustomer(customer);
	}


	@Override
	public String findFruitCartCustomer(String customer) {
		
		return "";
	}



}
