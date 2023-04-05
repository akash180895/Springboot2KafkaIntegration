package com.nt.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.nt.akash.constant.KafkaConstants;
import com.nt.akash.model.Customer;

@Service("customerService")
public class CustomerService {
	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;

	public String add(List<Customer> customers) {
		if (!customers.isEmpty()) {
			for (Customer c : customers) {
				kafkaTemplate.send(KafkaConstants.TOPIC, c);
				System.out.println("******MSG PUBLISH TO KAFKA TOPIC******");
			}
		}
		return "CUSTOMER RECORD ADDED TO KAFKA QUEUE SUCCESSFULLY";
	}
}
