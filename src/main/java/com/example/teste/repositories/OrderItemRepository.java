package com.example.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
