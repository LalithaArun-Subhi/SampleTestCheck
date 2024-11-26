package com.product.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.store.dao.ProductDetails;
import com.product.store.service.AddProductDetails;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductController {
	
	@Autowired
	private AddProductDetails productDetails;
	
	@PostMapping(value="/api/addProduct")
	public void storeProductDetails(@RequestBody ProductDetails product) {
		log.info("Product details are stored to the database");
		productDetails.saveProductDetails(product);
	}
	
	@GetMapping(value="api/getAllProduct")
	public List<ProductDetails> getAllProducts(){
		log.info("Retrieve all product details");
		return productDetails.getAllProducts();
	}
	
	@DeleteMapping(value="api/deleteById/{productId}")
	public void deleteByProductId(@PathVariable("productId") int productId) {
		log.info("Delete the item by Id");
		productDetails.deleteByProduct(productId);
		
	}
	
	@GetMapping(value="api/getProductById/{productId}")
	public ProductDetails getProductById(@PathVariable("productId") int productId) {
		log.info("Get product by id");
		return productDetails.getProductById(productId).get();
	}
	
//	@PutMapping(value="api/update")
//	public void updateProduct(@RequestBody ProductDetails prodDet) {
//		productDetails.u
//	}

}
