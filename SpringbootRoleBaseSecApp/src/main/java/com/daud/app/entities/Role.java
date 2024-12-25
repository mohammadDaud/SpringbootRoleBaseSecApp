package com.daud.app.entities;

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
public class Role {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(updatable = false,nullable = false)
	private long roleId;
	private String name;
	@OneToMany(mappedBy = "role",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<UserRole> userRole = new HashSet<>();

	public Role() {
	};

	public Role(long roleId, String name, Set<UserRole> userRole) {

		this.roleId = roleId;
		this.name = name;
		this.userRole = userRole;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

}
