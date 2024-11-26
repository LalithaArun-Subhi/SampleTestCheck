package com.product.store.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="ProductDetails")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private String productName;
	private String unit;
	private double originalPrice;
	private double marginPrice;
	private double quantity;
	private String gstNo;
	
	public ProductDetails(int productId, String productName, String unit, double originalPrice, double marginPrice,
			double quantity, String gstNo) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.unit = unit;
		this.originalPrice = originalPrice;
		this.marginPrice = marginPrice;
		this.quantity = quantity;
		this.gstNo = gstNo;
	}


}
