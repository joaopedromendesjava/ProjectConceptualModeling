package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpjava.projectconceptualmodeling.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
}
