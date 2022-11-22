package com.liang.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.liang.jpa.entity.Orders;

@Repository
public interface OrdersDAOJpa extends JpaRepository<Orders, Long>{

	@Query(value = "Select * from orders where customer = ?1", nativeQuery = true)
	List<Orders> findOrdersByCustomer(String customer);
}
