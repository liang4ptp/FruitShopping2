package com.liang.jpa.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liang.jpa.dao.FruitDAOJpa;
import com.liang.jpa.entity.Fruit;
import com.liang.jpa.service.FruitService;

@Service
public class FruitServiceImpl implements FruitService {
	
	@Autowired
	private FruitDAOJpa fruitDAOJpa;


	@Override
	public List<Fruit> findAll() {
		// 查詢所有水果品項，OK
		return fruitDAOJpa.findAll();
	}


	@Override
	public Fruit findFruitByFruitName(String fruitName) {
		return fruitDAOJpa.findFruitByFruitName(fruitName);
	}




}
