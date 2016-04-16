package com.jlearn.spring.annotation.bean;

public class Report {

	private int id;

	private String name;

	private String content;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", name=" + name + ", content=" + content + "]";
	}

}
