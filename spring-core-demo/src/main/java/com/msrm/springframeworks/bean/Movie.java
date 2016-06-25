package com.msrm.springframeworks.bean;

public class Movie {

	private String name;

	private String theater;

	public Movie() {
	}

	public Movie(String name, String theater) {
		super();
		this.name = name;
		this.theater = theater;
		System.out.println("Constructor Invoked");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter Method Invoked");
		this.name = name;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", theater=" + theater + "]";
	}

}
