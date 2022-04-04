package com.example.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
