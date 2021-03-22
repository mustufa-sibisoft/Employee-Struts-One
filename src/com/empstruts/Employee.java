package com.empstruts;

public class Employee {

	private int id;
	private String fullName;
	private int age;

	public Employee() {
	}

	public Employee(int id, String fullName, int age) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public int getId() {
		return this.id;
	}

	public String getFullName() {
		return this.fullName;
	}

}
