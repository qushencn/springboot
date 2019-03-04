package com.example.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * 
 * @author qushe
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserMapper usermapper;
	
	@Override
	public User selectUser(int id) {
		
		return usermapper.selectUser(id);
	}

}
