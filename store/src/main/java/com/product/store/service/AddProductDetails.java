package com.product.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.store.dao.ProductDetails;
import com.product.store.repository.AddProduct;

@Service
public class AddProductDetails {

	@Autowired
	private AddProduct productRespo;
	
	public void saveProductDetails(ProductDetails product) {
		productRespo.save(product);
	}

	public List<ProductDetails> getAllProducts() {
		return productRespo.findAll();
		
	}

	public void deleteByProduct(int productId) {
		productRespo.deleteById((long) productId);
		
	}
	
	public Optional<ProductDetails> getProductById(int productId) {
		return productRespo.findById((long)productId);
	}
	
//	public void updateProduct(ProductDetails product) {
//		productRespo.s
//	}
}
