package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.User;
import com.example.demo.entity.fwl;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

@Mapper
public interface FwlMapper {

	 public User selectfwl(int id);
	  
	  
	 public int insertfwl(fwl wl);
	  
	 public List<fwl> selectall();
	 
	 public  fwl  selectbyid(int id);
}

