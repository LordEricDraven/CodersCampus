package com.coderscampus.week22.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.week22.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	// automagically creates a SQL select statement
	//   select* from users where username = :username
	User findByUsername(String username);

}
