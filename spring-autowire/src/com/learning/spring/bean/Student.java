package com.learning.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private int id;

    private String name;

    private String email;

    @Autowired
    private Address address;

    public Student() {
    }

    public Student(int id, String name, Address address, String email) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.email = email;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
    }

}
