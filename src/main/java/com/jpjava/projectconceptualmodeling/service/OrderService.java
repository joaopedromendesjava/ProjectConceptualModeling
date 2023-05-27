package com.jpjava.projectconceptualmodeling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpjava.projectconceptualmodeling.model.OrderPay;
import com.jpjava.projectconceptualmodeling.repository.OrderRepository;
import com.jpjava.projectconceptualmodeling.service.exceptions.ObjectNotFoundExecption;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public OrderPay findOrder(Integer id) {
		
		OrderPay order = orderRepository.orderById(id);
		
		if(order == null) {
			
			throw new ObjectNotFoundExecption("Objeto não encontrado " + id + " Tipo " + 
					OrderPay.class.getSimpleName());
			}
		
		return order;
	}
}
