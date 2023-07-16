package com.aioeam.service;

import com.aioeam.entity.UserInfo;
import com.aioeam.exception.LoginFailedException;
import com.aioeam.exception.UserAlreadyExistException;

public interface UserService {
	
	
	public UserInfo singup(UserInfo userInfo);
	
	public UserInfo login(UserInfo userInfo) throws Exception;
	
	UserInfo getUserByUserName(String id) throws Exception;
	
	UserInfo getinfo(String userid);
	
	
}
