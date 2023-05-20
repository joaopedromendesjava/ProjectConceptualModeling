package com.jpjava.projectconceptualmodeling;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpjava.projectconceptualmodeling.model.Category;
import com.jpjava.projectconceptualmodeling.model.Product;
import com.jpjava.projectconceptualmodeling.repository.CategoryRepository;
import com.jpjava.projectconceptualmodeling.repository.ProductRepository;

@EnableJpaRepositories(basePackages = {"com.jpjava.projectconceptualmodeling.repository"})
@SpringBootApplication
public class ProjectConceptualModelingApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectConceptualModelingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { //metodo implementado 
		
//		Category cat1 = new Category(null, "Informática");
//		Category cat2 = new Category(null, "Escritório");
//		
//		Product p1 = new Product(null, "Computador", 2000.00);
//		Product p2 = new Product(null, "Impressora", 1500.00);
//		Product p3 = new Product(null, "Mouse", 50.00);
//	
//		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
//		cat2.getProducts().addAll(Arrays.asList(p2));
//		
//		p1.getCategories().addAll(Arrays.asList(cat1));
//		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
//		p3.getCategories().addAll(Arrays.asList(cat1));
//		
//		
//		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
//		productRepository.saveAll(Arrays.asList(p1, p2, p3));
//		
	}

}

