package com.jpjava.projectconceptualmodeling;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpjava.projectconceptualmodeling.model.Address;
import com.jpjava.projectconceptualmodeling.model.Category;
import com.jpjava.projectconceptualmodeling.model.City;
import com.jpjava.projectconceptualmodeling.model.Client;
import com.jpjava.projectconceptualmodeling.model.Product;
import com.jpjava.projectconceptualmodeling.model.State;
import com.jpjava.projectconceptualmodeling.model.enums.CustomerType;
import com.jpjava.projectconceptualmodeling.repository.AddressRepository;
import com.jpjava.projectconceptualmodeling.repository.CategoryRepository;
import com.jpjava.projectconceptualmodeling.repository.CityRepository;
import com.jpjava.projectconceptualmodeling.repository.ClientRepository;
import com.jpjava.projectconceptualmodeling.repository.ProductRepository;
import com.jpjava.projectconceptualmodeling.repository.StateRepository;

@EnableJpaRepositories(basePackages = {"com.jpjava.projectconceptualmodeling.repository"})
@SpringBootApplication
public class ProjectConceptualModelingApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectConceptualModelingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { //metodo implementado 
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 1500.00);
		Product p3 = new Product(null, "Mouse", 50.00);
	
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
		State st1 = new State(null, "Minas Gerais");
		State st2 = new State(null, "Rio de Janeiro");
		
		City c1 = new City(null, "Belo Horizonte", st1);
		City c2 = new City(null, "Uberlândia", st1);

		City c3 = new City(null, "Cabo Frio", st2);
		City c4 = new City(null, "Copa Cabana", st2);
		
		st1.getCities().addAll(Arrays.asList(c1, c2));
		st1.getCities().addAll(Arrays.asList(c3,c4));
		
		stateRepository.saveAll(Arrays.asList(st1, st2));
		cityRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		Client cl1 = new Client(null,"João Pedro", "joaopedromendessilva@gmail.com", "15474201621", CustomerType.PESSOAFISICA);
		cl1.getTelephones().addAll(Arrays.asList("31971669011", "31992109120"));
		
		Address a1 = new Address(null, "Rua professor nelson figueiredo" , "65", "ap302", "Parque São José", "30570540", cl1 , c1);
		Address a2 = new Address(null, "Rua niquelina", "213", "Sala T.I", "Santa Efigênia", "30260100", cl1, c1);
		
		cl1.getAddresses().addAll(Arrays.asList(a1,a2));
		
		clientRepository.saveAll(Arrays.asList(cl1));
		addressRepository.saveAll(Arrays.asList(a1,a2));
		
	}

}

