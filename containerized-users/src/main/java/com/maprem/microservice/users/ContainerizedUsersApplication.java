package com.maprem.microservice.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContainerizedUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerizedUsersApplication.class, args);
	}
}
