package com.liang.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.liang.jpa.entity.FruitCart;

@Repository
public interface FruitCartDAOJpa extends JpaRepository<FruitCart, Long>{
	
	@Query(value = "Select * from fruitcart where customer =?1", nativeQuery = true)
	 List<FruitCart> findFruitCartByCustomer(String customer);
}
