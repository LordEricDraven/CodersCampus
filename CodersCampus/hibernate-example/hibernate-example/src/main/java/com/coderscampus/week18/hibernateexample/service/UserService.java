package com.coderscampus.week18.hibernateexample.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.week18.hibernateexample.domain.Account;
import com.coderscampus.week18.hibernateexample.domain.Address;
import com.coderscampus.week18.hibernateexample.domain.User;
import com.coderscampus.week18.hibernateexample.repository.AccountRepository;
import com.coderscampus.week18.hibernateexample.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AccountRepository accountRepo;
	
	public List<User> findByUsername(String username){
		return userRepo.findByUsername(username);
	}
	
	public List<User> findByNameAndUsername(String name, String username){
		return userRepo.findByNameAndUsername(name, username);
	}
	
	public List<User> findByCreatedDateBetween(LocalDate date1, LocalDate date2){
		return userRepo.findByCreatedDateBetween(date1, date2);
	}
	
	public User findExactlyOneUserByUsername(String username) {
		List<User> users = userRepo.findExactlyOneUserByUsername(username);
		if (users.size() > 0)
			return users.get(0);
		else
			return new User();
	}
	
	public Set<User> findAll (){
		return userRepo.findAllUsersWithAccountsAndAddresses();
	}
	
	public User findById(Long userId) {
		Optional<User> userOpt = userRepo.findById(userId);
		return userOpt.orElse(new User());
	}

	public User saveUser(User user) {
		if(user.getUserId() == null) {
			Account checking = new Account();
			checking.setAccountName("Checking Account");
			checking.getUsers().add(user);
			Account savings = new Account();
			savings.setAccountName("Savings Account");
			savings.getUsers().add(user);
			
			user.getAccounts().add(checking);
			user.getAccounts().add(savings);
			accountRepo.save(checking);
			accountRepo.save(savings);
		}
		
		// CascadeTypes => PERSIST, MERGE, REMOVE 
		// PERSIST new User() <-> new Address() --> saveUser
		// MERGE existingUser -> new/updating Address() --> saveUser
		// REMOVE existingUser -> setAddress(null) --> saveUser
		if(user.getAddress() == null) {
			Address address = new Address();
			address.setAddressLine1("123 Fake st");
			address.setAddressLine2("Unit 4");
			address.setCity("Some City");
			address.setCountry("Some Country");
			address.setRegion("Some Region");
			address.setZipCode("12345");
			address.setUser(user);
			address.setUserId(user.getUserId());
			user.setAddress(address);
		}
		return userRepo.save(user);
	}

	public void delete(Long userId) {
		userRepo.deleteById(userId);
	}
	

}
