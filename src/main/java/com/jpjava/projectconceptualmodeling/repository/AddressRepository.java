package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpjava.projectconceptualmodeling.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	

}
