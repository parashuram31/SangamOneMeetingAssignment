package com.SangamOne.meeting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.meeting.Entity.UserDetails;
import com.SangamOne.meeting.Repository.UserRepository;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody UserDetails userDetails) {
		userRepository.save(userDetails);
		return "Inserted";
	}
	
	@GetMapping("/viewUser")
	public List<UserDetails>getAllUser(){
		return userRepository.findAll();
	}
}
