package edu.douglaslima.certificacao.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class UserDetails {

	private String username;
	private String password;
	private List<String> roles = new ArrayList<>();

	UserDetails(String username, String password) {
		this.username = username;
		this.password = password;
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

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles.clear();
		this.roles = roles.stream()
			.map(role -> "ROLE_" + role.toUpperCase())
			.toList();
	}

}
