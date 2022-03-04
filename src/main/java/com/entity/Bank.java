package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="bank")
public class Bank {
	
	@Id
	private int id ;
	private int account_number ;
	private String bank_name ; 
	private String ifsc_code;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", account_number=" + account_number + ", bank_name=" + bank_name + ", ifsc_code="
				+ ifsc_code + ", user=" + user + "]";
	}
	

	
	
	
	
}
