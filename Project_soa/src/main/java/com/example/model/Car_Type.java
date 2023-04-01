package com.example.model;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Car_Type {
	@Id
	@Column(name = "type_id")
	private int type_id;
	@Column(name = "type_model")
	private String type_model;
	
	public Car_Type() {
		
	}
	public Car_Type(int type_id,String type_model){
		this.type_id = type_id;
		this.type_model = type_model;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_model() {
		return type_model;
	}
	public void setType_model(String type_model) {
		this.type_model = type_model;
	}

	
}
