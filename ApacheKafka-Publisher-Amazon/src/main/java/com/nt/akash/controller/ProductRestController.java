package com.nt.akash.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.akash.model.Product;
import com.nt.akash.service.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value = "/addProducts",
			consumes = {
					MediaType.APPLICATION_JSON,
					MediaType.APPLICATION_XML
					}
				)
	public String addProduct(@RequestBody List<Product> products) {
		return productService.add(products);
	}
}
