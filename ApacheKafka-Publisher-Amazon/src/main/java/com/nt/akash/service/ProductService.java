package com.nt.akash.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.nt.akash.constant.KafkaConstants;
import com.nt.akash.model.Product;

@Service("productService")
public class ProductService {
	
	@Autowired
	private KafkaTemplate<String, Product> kafkaTemplate;
	
	public String add(List<Product> product) {
		if(!product.isEmpty()) {
			for(Product p : product) {
				kafkaTemplate.send(KafkaConstants.TOPIC, p);
				System.out.println("*****MSG PUBLISH TO KAFKA TOPIC*****");
			}
		}
		return "PRODUCT RECORDS ADDED TO KAFKA QUEUE SUCCESSFULLY";
	}
}
