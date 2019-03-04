package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
/**
 * 
 * @author qushe
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService usersivice;
	
	@GetMapping("/getUser")
	@ResponseBody
	public User getUserInfo(int id) {
		
		return usersivice.selectUser(id);
	}
	
	@RequestMapping("/hello")
	public String HelloSpringBoot() {
		
		System.out.println("测试Controller跳转前台页面");
		return "user/index";
	}
	
}
