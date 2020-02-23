package com.kairos.springboot.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.kairos.springboot.app.commons.users.entity"})
@SpringBootApplication
public class SpringbootUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUsersApplication.class, args);
	}

}
