package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventoryInfo")
public class InventoryManagement {
      
	@Id
	@SequenceGenerator(name = "gen", sequenceName="product_seq", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "gen", strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Product_Name", length = 25)
	private String productName;
	@Column(name = "Description", length= 200)
	private String productDescription;
	@Column(name = "Price")
	private double price;
	@Column(name = "product_availability")
	private int productAvailability;
	
	public InventoryManagement(){}

	public InventoryManagement(int id, String productName, String productDescription, double price,
			int productAvailability) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.productAvailability = productAvailability;
	}

	public int getProductId() {
		return id;
	}

	public void setProductId(int productId) {
		this.id = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return price;
	}

	public void setProductPrice(double price) {
		this.price = price;
	}

	public int getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(int productAvailability) {
		this.productAvailability = productAvailability;
	}

	@Override
	public String toString() {
		return "InventoryManagement [productId=" + id + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + price + ", productAvailability=" + productAvailability
				+ "]";
	}
	
	
	
}
