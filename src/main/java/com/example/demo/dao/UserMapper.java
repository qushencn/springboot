package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

/**
 * 
 * @author qushe
 *
 */
@Mapper

public interface UserMapper {
  User selectUser(int id);
	
}
