package com.daud.app.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class AppUser {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(updatable = false,nullable = false)
	private long id;
	private String name;
	
	@Column(unique = true)
	private String username;
	private String password;
	private String email;
	private String contact_number;
	
	@Column(columnDefinition = "text")
	private String address;
	private Date createdDate;
	
	@OneToMany(mappedBy = "appUser",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<UserRole> userRole = new HashSet();

	public AppUser() {
	};

	public AppUser(long id, String name, String username, String password, String email, String contact_number,
			String address, Date createdDate, Set<UserRole> userRole) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact_number = contact_number;
		this.address = address;
		this.createdDate = createdDate;
		this.userRole = userRole;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

}
