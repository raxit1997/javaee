package com.zilker.bean;

public class Student {
	
	private String firstName, lastName, deptName, regno, status;
	private int year;
	
	public Student(String firstName, String lastName, String deptName, String regno, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
		this.regno = regno;
		this.year = year;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setRegno(String regno) {
		this.regno = regno;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public String getRegno() {
		return regno;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getStatus() {
		return status;
	}
	
}
