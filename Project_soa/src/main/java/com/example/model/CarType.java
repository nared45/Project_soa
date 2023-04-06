package com.example.model;
// Generated Apr 7, 2023, 3:25:04 AM by Hibernate Tools 5.6.3.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * CarType generated by hbm2java
 */
public class CarType implements java.io.Serializable {

	private Integer typeId;
	private String typeModel;
	
	private Set cars = new HashSet(0);

	public CarType() {
	}

	public CarType(String typeModel) {
		this.typeModel = typeModel;
	}

	public CarType(String typeModel, Set cars) {
		this.typeModel = typeModel;
		this.cars = cars;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeModel() {
		return this.typeModel;
	}

	public void setTypeModel(String typeModel) {
		this.typeModel = typeModel;
	}

	public Set getCars() {
		return this.cars;
	}

	public void setCars(Set cars) {
		this.cars = cars;
	}

}