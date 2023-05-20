package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpjava.projectconceptualmodeling.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
