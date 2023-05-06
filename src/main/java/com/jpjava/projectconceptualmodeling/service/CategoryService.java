package com.jpjava.projectconceptualmodeling.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpjava.projectconceptualmodeling.model.Category;
import com.jpjava.projectconceptualmodeling.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Optional<Category> find(Long id) {
		
		 Optional<Category> category = categoryRepository.findById(id);
		
		 return category;
	}
}
