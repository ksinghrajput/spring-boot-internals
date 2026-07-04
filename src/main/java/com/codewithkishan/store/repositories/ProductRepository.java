package com.codewithkishan.store.repositories;

import com.codewithkishan.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}