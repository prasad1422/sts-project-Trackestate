package com.example.trackestate.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trackestate.entity.User;
import com.example.trackestate.service.UserService;



@RestController
public class UserController {

	@Autowired
	UserService userService;	

	@PostMapping("/addUser")
	public String addUser( @Validated @RequestBody User user) {
		System.out.println("In add User:" + user);
		return userService.addUser(user);
	}

	

	@GetMapping("/GetList")
	public List<User> getList(){
		return userService.getList();
	}
	
	@GetMapping("/getUser/{id}")
	public User getUserData(@PathVariable Long id) {
		
		return userService.getUser(id);
	}

	
	
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable Long id, @RequestBody User newUser) {
		return userService.updateUser(id, 	newUser);
	}
}
