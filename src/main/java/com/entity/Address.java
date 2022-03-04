package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="address")
public class Address {
	
	@Id
	private int id;
	private String line;
	private String area;
	private String city;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", line=" + line + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
