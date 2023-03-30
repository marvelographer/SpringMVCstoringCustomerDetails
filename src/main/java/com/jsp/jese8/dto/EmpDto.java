package com.jsp.jese8.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.jsp.jese8.dao.EmpDao;

import lombok.Data;

//@Component
@Entity		// create a User table into the MySQL database.
// @Data	// it generate getters and setters

public class EmpDto {
	@Id
	private String email;
	private String pwd;
	private String name;
	private long phone;
	private String role;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
