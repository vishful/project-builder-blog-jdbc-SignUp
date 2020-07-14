package model;

import java.time.LocalDate;

public class User {
	private String email;
	private String password;
	private LocalDate date;
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
}
