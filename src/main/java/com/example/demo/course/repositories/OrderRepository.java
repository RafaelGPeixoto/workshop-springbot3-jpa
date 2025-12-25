package com.example.demo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Order;
import com.example.demo.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
