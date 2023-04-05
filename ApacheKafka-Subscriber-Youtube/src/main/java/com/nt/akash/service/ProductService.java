package com.nt.akash.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nt.akash.constants.KafkaConstants;
import com.nt.akash.model.Product;

@Service("productService")
public class ProductService {
	
	@KafkaListener(topics = KafkaConstants.TOPIC,groupId = KafkaConstants.GROUP_ID)
	public Product listener(Product p) {
		System.out.println("*****MSG RECIVED FROM KAFKA TOPIC***** "+p);
		return p;
	} 
}
