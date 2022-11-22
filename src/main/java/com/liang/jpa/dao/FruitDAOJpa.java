package com.liang.jpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.liang.jpa.entity.Fruit;

@Repository
public interface FruitDAOJpa extends JpaRepository<Fruit, Long>{
	
	@Query(value = "Select * from fruit where fruitName = ?1", nativeQuery = true)
	 Fruit findFruitByFruitName(String fruitName);

}
