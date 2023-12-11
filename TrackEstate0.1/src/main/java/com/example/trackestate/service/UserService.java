package com.example.trackestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trackestate.entity.User;
import com.example.trackestate.repository.UserRepository;

@Service
public class UserService {

	
	
	@Autowired
	UserRepository userRepository;

	public String addUser(User user) {
		User s1= userRepository.save(user);
		
		if(s1!=null)
			return "User " + s1.getUser_id()+ " successfully created";
		else
			return null;
	}
	
	public List<User> getList(){
		return (List<User>)userRepository.findAll();
	}
	
 
    

    public User getUser(Long id)  {
    	User user=null;
    	
		user  = userRepository.findById(id).get();
    	
		return user;
	}
    
	
	public String updateUser(Long id, User newUser) {
		User s1=userRepository.findById(id).get();
		s1.setFirstName(newUser.getFirstName());
		s1 = userRepository.save(s1);
		if(s1!=null)
			return "User " + s1.getUser_id() + ", " + s1.getFirstName() + " successfully updated";
		else
			return null;
	}

	
	
}
