package com.example.model;
// Generated Apr 7, 2023, 3:25:04 AM by Hibernate Tools 5.6.3.Final

import java.util.Date;

/**
 * Reservation generated by hbm2java
 */
public class Reservation implements java.io.Serializable {

	private Integer reservationId;
	private Car car;
	private Users users;
	private Date startDate;
	private Date endDate;
	private double totalCost;

	public Reservation() {
	}

	public Reservation(Car car, Users users, Date startDate, Date endDate, double totalCost) {
		this.car = car;
		this.users = users;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalCost = totalCost;
	}

	public Integer getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public Car getCar() {
		return this.car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

}
