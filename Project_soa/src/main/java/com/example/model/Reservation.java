package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
	@Column(name = "reservation_id")
	private int reservation_id;
	@ManyToOne
	@JoinColumn(name="user_id",nullable = true)
	private Users user;
	@ManyToOne
	@JoinColumn(name="car_id",nullable = true)
	private Car car;
	@Column(name = "start_date")
	private Date start_date;
	@Column(name = "end_date")
	private Date end_date;
	@Column(name = "total_cost")
	private double total_cost;
	
	public Reservation() {
		
	}

	public Reservation(int reservation_id, Users user, Car car, Date start_date, Date end_date, double total_cost) {
		super();
		this.reservation_id = reservation_id;
		this.user = user;
		this.car = car;
		this.start_date = start_date;
		this.end_date = end_date;
		this.total_cost = total_cost;
	}

	public int getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public double getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	
}
