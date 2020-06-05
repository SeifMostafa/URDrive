package com.urdrive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urdrive.model.ACCESS;
import com.urdrive.model.User;



@RestController
@RequestMapping("users")
public class UserController {

	User loggedInUser;
	
	
	@GetMapping
	public User[] getUsers() {
		return new User[] {new User("Seif","123456",1,ACCESS.WRITE)};
	}
	// master add user to be able to access
	@PostMapping
	public boolean registerUser(@RequestBody User user) {
		return true;
		/// update local database to add user.
		// master provide name and password and access type.
		//if any technical failure 
	}
	/// handle HTTP reponse error code.
	public boolean login(User user) {
		return true;
	}
	
	
	//... delete mapping, update. mapping
	// delete for delete user, update for update password.
	
	
}
