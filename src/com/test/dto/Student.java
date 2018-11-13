package com.test.dto;

public class Student {
	private String name;
	private boolean active;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, boolean active, int age) {
		super();
		this.name = name;
		this.active = active;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
