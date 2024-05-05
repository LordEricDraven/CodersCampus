package com.coderscampus.week18.hibernateexample.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.week18.hibernateexample.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	// select * from users where username = :name
	List<User> findByUsername(String username);
	
	// select * from users where name = :name
	List<User> findByName(String name);
	
	// select * from users where name = :name and username = :usernamename
	List<User> findByNameAndUsername(String name, String username);
	
	List<User> findByCreatedDateBetween(LocalDate date1, LocalDate date2);
	
	
}
