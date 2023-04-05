package com.nt.akash.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor @NoArgsConstructor @Setter @Getter
public class Product {
	private Long productId;
	private String productName;
	private Double productRating;
	private Double productPrice;
}
