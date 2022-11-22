package com.liang.jpa.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Fruit {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String fruitName;
	private int fruitPrice;
	
	

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + "]";
	}
	
	
}
