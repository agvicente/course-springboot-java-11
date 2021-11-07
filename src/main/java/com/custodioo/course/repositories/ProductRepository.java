package com.custodioo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custodioo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
