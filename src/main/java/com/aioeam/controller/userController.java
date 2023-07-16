package com.aioeam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aioeam.entity.Response;
import com.aioeam.entity.UserInfo;
import com.aioeam.exception.LoginFailedException;
import com.aioeam.exception.UserAlreadyExistException;
import com.aioeam.service.UserService;



@RestController
@RequestMapping("/User")
public class userController {
	
	
	private static ResponseEntity<Response> userNotFoundExceptionResponse = new ResponseEntity<Response>(
			new Response(null, "User not found."), HttpStatus.BAD_REQUEST);

	private static ResponseEntity<Response> LoginSucceessfully = new ResponseEntity<Response>(
			new Response(null, "Login SuccessFully"), HttpStatus.OK);
	
	@Autowired
	private UserService userservice;

	@PostMapping("/Signup")
	public ResponseEntity<String> singup(@RequestBody UserInfo userInfo)
	{
		try
		{
			UserInfo existedUser=null;
			try
			{
				existedUser=userservice.getUserByUserName(userInfo.getUserName());
			
		}catch (Exception e)
		{
			
		}
		
		if (existedUser!=null)
		{
			throw new UserAlreadyExistException();
		}
		
		userservice.singup(userInfo);
		return ResponseEntity.ok("Signup Sucessfully");
		
	  } 
		catch (Exception e)
	  {
		return ResponseEntity.ok("Signup failed as username already exist");  
	  }
		
	}
	@PostMapping("/login")
       public ResponseEntity<Response> login(@RequestBody UserInfo userInfo) throws Exception {
    	   
		try {
				userservice.login(userInfo);
			
		}catch(LoginFailedException e) {
			return userNotFoundExceptionResponse;
			
		}
		return LoginSucceessfully;
	
       }
	
	@GetMapping("/GetUserName/{userid}")
	public UserInfo getinfo(@PathVariable String userid) throws Exception {
		return this.userservice.getinfo(userid);
	}
	

		
	}