package com.example.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
