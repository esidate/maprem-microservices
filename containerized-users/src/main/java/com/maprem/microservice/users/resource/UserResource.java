package com.maprem.microservice.users.resource;

import com.maprem.microservice.users.model.User;
import com.maprem.microservice.users.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserResource
{
	private final UserRepository repository;

	@GetMapping("/{id}")
	public ResponseEntity<User> get(@PathVariable("id") Integer id)
	{
		final var user = repository.findById(id).get();
		log.info("User {} detail fetched {}", id, user);
		return ResponseEntity.ok(user);
	}

	@GetMapping()
	public ResponseEntity<Collection<User>> getAll()
	{
		final var users = (repository.findAll().get());
		log.info("Executing fetching all users {}", users);
		return ResponseEntity.ok(users);
	}
}
