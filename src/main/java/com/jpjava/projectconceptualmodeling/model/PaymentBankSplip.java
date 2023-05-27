package com.jpjava.projectconceptualmodeling.model;

import java.util.Date;

import javax.persistence.Entity;

import com.jpjava.projectconceptualmodeling.model.enums.StatusPayment;

@Entity
public class PaymentBankSplip extends Payment {
	
	private static final long serialVersionUID = 1L;
	
	private Date paymentDate;
	private Date dueDate;
	
	
	public PaymentBankSplip() {

	}


	public PaymentBankSplip(Integer id, StatusPayment status, OrderPay order, Date paymentDate, Date dueDate ) {
		
		super(id, status, order);
		this.paymentDate = paymentDate;
		this.dueDate = dueDate;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	

}
