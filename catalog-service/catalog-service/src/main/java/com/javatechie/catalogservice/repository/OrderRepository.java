package com.javatechie.catalogservice.repository;
import com.javatechie.catalogservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import java.util.List;
public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByCategory(String category);
}


