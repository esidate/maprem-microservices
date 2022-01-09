package com.maprem.microservice.users.repository;

import com.maprem.microservice.users.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
	private final static Map<Integer, User> users = new HashMap<>();

	static {
		users.put(1, new User(1, "Cuisto", "cuisto.diler@gmail.com"));
		users.put(2, new User(2, "John Doe", "john.doe@mail.com"));
		users.put(3, new User(3, "Michael Knight", "michael.knight@mail.com"));
		users.put(4, new User(4, "Black Hawk", "black.hawk@mail.com"));
	}

	public Optional<User> findById(Integer id) {
		return Optional.ofNullable(users.get(id));
	}

	public Optional<Collection<User>> findAll() {
		return Optional.ofNullable(users.values());
	}
}
