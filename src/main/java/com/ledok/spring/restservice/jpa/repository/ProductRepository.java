package com.ledok.spring.restservice.jpa.repository;

import com.ledok.spring.restservice.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <ProductEntity,Integer> {
}
