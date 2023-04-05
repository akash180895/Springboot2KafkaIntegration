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
@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class Customer {
	private Long custId;
	private String custName;
	private String custEmail;
}
