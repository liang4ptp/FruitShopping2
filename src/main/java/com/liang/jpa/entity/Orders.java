package com.liang.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String fruitName;
	private String customer;
	private int fruitPrice;
	private int quantity;
	private int totalAmount;
	@Override
	public String toString() {
		return "Orders [customer=" + customer + ", fruitName=" + fruitName + ", fruitPrice=" + fruitPrice
				+ ", quantity=" + quantity + ", totalAmount=" + totalAmount + "]";
	}
	
	
}
