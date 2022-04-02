package com.example.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.entites.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
