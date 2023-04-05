package com.nt.akash.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor @NoArgsConstructor @Setter @Getter
public class Customer {
	private Long customerId;
	private String customerName;
	private String customerEmail;
}
