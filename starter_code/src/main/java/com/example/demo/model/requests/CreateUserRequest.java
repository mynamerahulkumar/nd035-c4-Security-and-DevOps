package com.example.demo.model.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequest {

	@JsonProperty
	private String username;

	public String getUsername() {
		System.out.println("hello username");
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
