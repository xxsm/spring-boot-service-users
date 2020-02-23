package com.kairos.springboot.app.users.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kairos.springboot.app.commons.users.entity.User;

@RepositoryRestResource(path="users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{

	@RestResource(path="buscar-username")
	public User findByUsername(@Param("username") String username);
	
	@Query("select u from User u where u.username=?1")
	public User obtenerPorUsername(String username);

	public void deleteById(Long id);
}
