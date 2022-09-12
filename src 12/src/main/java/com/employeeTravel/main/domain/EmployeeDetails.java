package com.employeeTravel.main.domain;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeDetails {
	private int employeeId;
	private String employeeName;
	private String gender;
	private LocalDate dob;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String email;
	private int contact;
	private String designation;
	private int reportsTo;
	private double salary;
	private int loginId;
	private int slabId;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String employeeName, String gender, LocalDate dob, String city, String state,
			String country, int pincode, String email, int contact, String designation, int reportsTo, double salary,
			int loginId, int slabId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.email = email;
		this.contact = contact;
		this.designation = designation;
		this.reportsTo = reportsTo;
		this.salary = salary;
		this.loginId = loginId;
		this.slabId = slabId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public int getSlabId() {
		return slabId;
	}

	public void setSlabId(int slabId) {
		this.slabId = slabId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, contact, country, designation, dob, email, employeeId, employeeName, gender, loginId,
				pincode, reportsTo, salary, slabId, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		return Objects.equals(city, other.city) && contact == other.contact && Objects.equals(country, other.country)
				&& Objects.equals(designation, other.designation) && Objects.equals(dob, other.dob)
				&& Objects.equals(email, other.email) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName) && Objects.equals(gender, other.gender)
				&& loginId == other.loginId && pincode == other.pincode && reportsTo == other.reportsTo
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary) && slabId == other.slabId
				&& Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", dob=" + dob + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + ", email=" + email + ", contact=" + contact + ", designation=" + designation
				+ ", reportsTo=" + reportsTo + ", salary=" + salary + ", loginId=" + loginId + ", slabId=" + slabId
				+ "]";
	}

	
}
