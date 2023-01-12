package com.Spring_boot_pMagnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_pMagnt.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}