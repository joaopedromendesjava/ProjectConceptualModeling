package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpjava.projectconceptualmodeling.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
