package com.jpjava.projectconceptualmodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jpjava.projectconceptualmodeling.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
