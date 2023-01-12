package com.Spring_boot_pMagnt.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
	@ID
	@GeneratedValue(strategy=GenerationType.AUTO)
	int productId;
	String productName;
	double productPrice;
	@Column(name="manufactureDate")
	Date mnfDate;
	@Column(name="Expirydtae")
	Date expDate;


}
