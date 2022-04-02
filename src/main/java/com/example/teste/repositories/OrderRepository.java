package com.example.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
