package com.jpjava.projectconceptualmodeling.model;

import javax.persistence.Entity;

import com.jpjava.projectconceptualmodeling.model.enums.StatusPayment;

@Entity
public class PaymentCard extends Payment {
	
	private static final long serialVersionUID = 1L;
	
	private int numberInstallments;

	public PaymentCard() {

	}

	public PaymentCard(Integer id, StatusPayment status, OrderPay order, int numberInstallments) {
		super(id, status, order);
		
		this.numberInstallments = numberInstallments;
		
	}

	public int getNumberInstallments() {
		return numberInstallments;
	}

	public void setNumberInstallments(int numberInstallments) {
		this.numberInstallments = numberInstallments;
	}
		
}
