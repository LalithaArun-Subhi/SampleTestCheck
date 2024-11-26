package com.product.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class StoreApplication {

	public static void main(String[] args) {
		log.info("Store Application Main Page Working");
		log.warn("Warning in main page working");
		log.error("Error in main page");
		SpringApplication.run(StoreApplication.class, args);
	}

}
