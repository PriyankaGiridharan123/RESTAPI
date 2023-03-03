package com.example.demo.FoodApp.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="forgetpwd")
public class ForgetPwdEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
private String email;
private String newPassword;
@JsonIgnore
private String confirmPassword;
public ForgetPwdEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public ForgetPwdEntity(int userId, String email, String newPassword, String confirmPassword) {
	super();
	this.userId = userId;
	this.email = email;
	this.newPassword = newPassword;
	this.confirmPassword = confirmPassword;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNewPassword() {
	return newPassword;
}
public void setNewPassword(String newPassword) {
	this.newPassword = newPassword;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
}
