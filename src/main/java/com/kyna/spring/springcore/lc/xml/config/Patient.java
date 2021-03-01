package com.kyna.spring.springcore.lc.xml.config;

public class Patient {
	
	public int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	public void hi() {
		System.out.println("inside hi method");
	}

	public void bye() {
		System.out.println("inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	 

}
