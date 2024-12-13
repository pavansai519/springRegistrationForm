package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")

public class User {
	
	

	private String name;
	@Id
	private String username;
	private String gmail;
	private String  pass;
	private String conformpass;
	private long phonenumber; 
	private String gender;
	
	
	public User(String name, String username, String gmail, String pass, String conformpass, long phonenumber,
			String gender) {
	
		this.name = name;
		this.username = username;
		this.gmail = gmail;
		this.pass = pass;
		this.conformpass = conformpass;
		this.phonenumber = phonenumber;
		this.gender = gender;
	}


	public User() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getConformpass() {
		return conformpass;
	}


	public void setConformpass(String conformpass) {
		this.conformpass = conformpass;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", gmail=" + gmail + ", pass=" + pass
				+ ", conformpass=" + conformpass + ", phonenumber=" + phonenumber + ", gender=" + gender + "]";
	}

	
	
	
}
