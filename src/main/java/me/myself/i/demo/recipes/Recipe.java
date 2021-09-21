package me.myself.i.demo.recipes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Recipe {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String value;
	
}
