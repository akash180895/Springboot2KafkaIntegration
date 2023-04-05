package com.nt.akash.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nt.akash.constant.KafkaConstants;
import com.nt.akash.model.Customer;

@Service("custService")
public class CustomerService {

	@KafkaListener(topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
	public Customer listener(Customer c) {
		System.out.println("*****MSG RECIEVED FROM KAFKA TOPIC***** " + c);
		return c;

	}
}
