package com.maprem.microservice.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private Integer id;
	private String fullname;
	private String email;
}
