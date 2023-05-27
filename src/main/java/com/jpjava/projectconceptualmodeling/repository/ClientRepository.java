package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpjava.projectconceptualmodeling.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
	@Query(value = "select c from Client c "
			+ "inner join c.addresses a "
			+ "inner join a.city b "
			+ "join b.state "
			+ "where c.id = :id")
	Client findByClient(Long id);
}
