package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpjava.projectconceptualmodeling.model.OrderPay;

@Repository
public interface OrderRepository extends JpaRepository<OrderPay, Long> {

	
	@Query(value = "select c from OrderPay c where c.id = :id")
	OrderPay orderById(Integer id);
}
