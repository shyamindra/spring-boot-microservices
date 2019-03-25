package com.sid.userdata.user;

import javax.persistence.Entity;

import com.sid.userdata.shared.Address;

@Entity
public class UserDetails {
	
	private User user;
	private String email;
	private String mobileNumber;
	private Address address;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
