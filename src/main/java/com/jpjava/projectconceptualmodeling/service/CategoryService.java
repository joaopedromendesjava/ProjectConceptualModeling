package com.jpjava.projectconceptualmodeling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpjava.projectconceptualmodeling.model.Category;
import com.jpjava.projectconceptualmodeling.repository.CategoryRepository;
import com.jpjava.projectconceptualmodeling.service.exceptions.ObjectNotFoundExecption;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category findCategory(Long id) {
		
		 Category category = categoryRepository.findByCategoryId(id);
		 
		 if (category == null) {
			 
			 throw new ObjectNotFoundExecption("Objeto não encontrado " + id + " Tipo: "
					 + Category.class.getSimpleName());
		 }
		 
		 return category;
	}
}
