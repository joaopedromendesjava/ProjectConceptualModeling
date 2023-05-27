package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpjava.projectconceptualmodeling.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
