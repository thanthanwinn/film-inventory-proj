package com.jdc.ttw.entity.BusinessData;

import com.jdc.ttw.entity.CustomerData.Customer;
import com.jdc.ttw.entity.Listeners.EnableTimesListeners;
import com.jdc.ttw.entity.Listeners.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "payment_tbl")
public class Payment implements EnableTimesListeners{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double amount;
	@Embedded
	private Times times;
	@ManyToOne(optional = false)
	private Customer customer;
	@ManyToOne(optional = false)
	private Rental rental;
	@ManyToOne(optional = false)
	private Staff staff;
	
	@Override
    public Times getTimes() {
        return times;
    }

    @Override
    public void setTimes(Times times) {
        this.times = times;
    }

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}
