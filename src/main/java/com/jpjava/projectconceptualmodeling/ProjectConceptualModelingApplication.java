package com.jpjava.projectconceptualmodeling;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpjava.projectconceptualmodeling.model.Category;
import com.jpjava.projectconceptualmodeling.repository.CategoryRepository;

@SpringBootApplication
public class ProjectConceptualModelingApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectConceptualModelingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { //metodo implementado 
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}

