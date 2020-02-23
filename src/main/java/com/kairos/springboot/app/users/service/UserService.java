package com.kairos.springboot.app.users.service;

import java.util.Optional;

import com.kairos.springboot.app.commons.users.entity.User;

public interface UserService {

	public Iterable<User> findAll();
	
	public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);
}
