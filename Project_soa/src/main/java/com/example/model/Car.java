package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@Column(name = "car_id")
	private int car_id;
	@Column(name = "car_name")
	private String car_name;
	@Column(name = "description")
	private String description;
	@Column(name = "price_per_day")
	private double price_per_day;
	@Column(name = "color")
	private String color;
	@Column(name = "plat_number")
	private String plat_number;
	@ManyToOne
    @JoinColumn(name="type_id", nullable=true)
    private Car_Type type_id;
	public Car(int car_id, String car_name, String description, double price_per_day, String color, String plat_number,
			Car_Type type_id) {
		super();
		this.car_id = car_id;
		this.car_name = car_name;
		this.description = description;
		this.price_per_day = price_per_day;
		this.color = color;
		this.plat_number = plat_number;
		this.type_id = type_id;
	}
	public Car() {
		
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice_per_day() {
		return price_per_day;
	}
	public void setPrice_per_day(double price_per_day) {
		this.price_per_day = price_per_day;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlat_number() {
		return plat_number;
	}
	public void setPlat_number(String plat_number) {
		this.plat_number = plat_number;
	}
	public Car_Type getType_id() {
		return type_id;
	}
	public void setType_id(Car_Type type_id) {
		this.type_id = type_id;
	}
	
}
