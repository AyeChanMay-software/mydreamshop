package javaee.spring.mydreamshop.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private Long id;
	private String name;
	//private List<Category> category;
	private String category;
	private long price;
	
	/* public enum Category {
		Clothes,Bags,Accessories;
	} */
	
	
}
