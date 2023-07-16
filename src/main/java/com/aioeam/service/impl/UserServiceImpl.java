package com.aioeam.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aioeam.entity.Booking;
import com.aioeam.entity.UserInfo;
import com.aioeam.exception.LoginFailedException;
import com.aioeam.exception.UserAlreadyExistException;
import com.aioeam.repo.UserRepository;
import com.aioeam.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	          
          @Autowired
	      private UserRepository userrepository;        
	



		@Override
		public UserInfo singup(UserInfo userInfo) {
			// TODO Auto-generated method stub
			return userrepository.save(userInfo);
		}




		public UserInfo login(UserInfo userInfo) throws Exception {
			
			Optional <UserInfo> info= userrepository.findById(userInfo.getUserName());
			if (info.isEmpty()) {
				throw new LoginFailedException();
			}
			
			String pass=info.get().getPassword();
			if (pass==null || !pass.equals(userInfo.getPassword()))
			{
				 throw new LoginFailedException();
			}
			
			System.out.println("Success");
			return userInfo;
			
			
			}

		public UserInfo getUserByUserName(String id) throws Exception {
			Optional <UserInfo> userInfo= userrepository.findById(id);
			if (userInfo.isEmpty())
			{
				return null;
			
			}
			return userInfo.get();
		}
		
		
		
		
		public UserInfo getinfo(String userid) {
			
			return userrepository.findById(userid).get();
		}
		

	
}
