package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="course")
public class Course {

	@Id
	private int id;
	private String title;
	private int fees;
	
	@ManyToMany
	@JoinTable(name="user_course", joinColumns =@JoinColumn(name= "course_id"),inverseJoinColumns = @JoinColumn(name="user_id"))
	private List<User> user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", fees=" + fees + "]";
	}
	
	
}
