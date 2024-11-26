package com.product.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.store.dao.ProductDetails;

@Repository
public interface AddProduct extends JpaRepository<ProductDetails,Long>{

}
