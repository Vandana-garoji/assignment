package com.spring.demo.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Document(collection = "Employee")
public class Employee {
    public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(int eid, String name, int age, int salary, String department) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	@Id
	private int eid;
   
	private String name;
    
	private int age;
    
	private int salary;
   
	private String department;
	
	
}
