package com.employeeTravel.main.domain;

import java.util.Objects;

public class Login {
	private int loginId;
	private String userId;
	private String password;
	private String designation;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int loginId, String userId, String password, String designation) {
		super();
		this.loginId = loginId;
		this.userId = userId;
		this.password = password;
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, loginId, password, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(designation, other.designation) && loginId == other.loginId
				&& Objects.equals(password, other.password) && Objects.equals(userId, other.userId);
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userId=" + userId + ", password=" + password + ", designation="
				+ designation + "]";
	}

	
	
}
