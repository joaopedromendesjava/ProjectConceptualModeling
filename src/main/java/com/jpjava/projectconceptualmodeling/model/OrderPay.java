package com.jpjava.projectconceptualmodeling.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderPay implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date instant;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
	private Payment payment;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "delivery_address_id")
	private Address deliveryAddress;

	@OneToMany(mappedBy = "id.orderPay")
	private Set<OrderItem> items = new HashSet<>();
	
	public OrderPay() {

	}


	public OrderPay(Integer id, Date instant, Client client, Address deliveryAddress) {
		super();
		this.id = id;
		this.instant = instant;
		this.client = client;
		this.deliveryAddress = deliveryAddress;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getInstant() {
		return instant;
	}


	public void setInstant(Date instant) {
		this.instant = instant;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Address getDeliveryAddress() {
		return deliveryAddress;
	}


	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Set<OrderItem> getItems() {
		return items;
	}


	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		OrderPay other = (OrderPay) obj;
		if (id != other.id)
			return false;
		return true;
	}


}