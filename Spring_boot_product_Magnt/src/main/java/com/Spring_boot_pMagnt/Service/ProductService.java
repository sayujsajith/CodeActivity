package com.Spring_boot_pMagnt.Service;

import com.spring_boot_pmgnt.entity.Product;

public interface ProductService 
{
	Product save(Product p);
	
	void deleteProduct (int pid);
	
	Product getProductById(int productId);

	void update(Product product,int productId);

}