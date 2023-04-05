package com.nt.akash.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.core.MediaType;
import com.nt.akash.model.Customer;
import com.nt.akash.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/addCustomers",
			consumes = {
						MediaType.APPLICATION_JSON,
						MediaType.APPLICATION_XML
					}
			)
	public String addCustomer(@RequestBody List<Customer> customers) {
		return customerService.add(customers);
	}
}
