package com.jpjava.projectconceptualmodeling.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.jpjava.projectconceptualmodeling.model.enums.CustomerType;

@Entity
public class Client implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String CpfOrCnpj;
	private Integer Type;
	
	@OneToMany(mappedBy = "client")
	private List<Address> addresses = new ArrayList<>(); //lista de endereços
	
	@ElementCollection
	@CollectionTable(name = "telephone")
	private Set<String> telephones = new HashSet<>(); //Conjunto de strings, nao se repete em set
	
	
	
	public Client() {
	}

	public Client(Long id, String name, String email, String cpfOrCnpj, CustomerType customerType) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.CpfOrCnpj = cpfOrCnpj;
		this.Type = customerType.getCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOrCnpj() {
		return CpfOrCnpj;
	}

	public void setCpfOrCnpj(String cpfOrCnpj) {
		CpfOrCnpj = cpfOrCnpj;
	}
	
	public CustomerType getCustomerType() {
		return CustomerType.toEnum(Type);
	}
	
	public void setCustomerType(CustomerType customerType) {
		this.Type = customerType.getCode();
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Set<String> getTelephones() {
		return telephones;
	}

	public void setTelephones(Set<String> telephones) {
		this.telephones = telephones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
