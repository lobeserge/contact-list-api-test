package com.gotraining.model;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Contact {

	@Id
	private int id;
	private String name;
	private long phonenumber;
	
	
	public Contact() {
		super();
	}


	public Contact(int id, String name, long phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	
	
	

	
	
}
