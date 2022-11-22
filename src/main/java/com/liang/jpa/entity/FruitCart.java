package com.liang.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fruitcart")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FruitCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String fruitName;
	private String customer;
	private int quantity;
	
	@Override
	public String toString() {
		return "FruitCart [customer=" + customer + ", fruitName=" + fruitName + ", quantity=" + quantity + "]";
	}
}
