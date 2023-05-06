package com.jpjava.projectconceptualmodeling.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpjava.projectconceptualmodeling.model.Categories;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@GetMapping()
	public List<Categories> list() {
		
		Categories cat1 = new Categories((long) 1, "Informática");
		Categories cat2 = new Categories((long) 2, "Escritório");
		
		List<Categories> listCategories = new ArrayList<>();
		listCategories.add(cat1);
		listCategories.add(cat2);
		
		return listCategories;
	}
}

