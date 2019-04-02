package com.example.demo.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.dao.FwlMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.fwl;
import com.example.demo.service.UserService;
import com.example.demo.util.csdn;
/**
 * 
 * @author qushe
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService usersivice;
	
	@Autowired
	private FwlMapper fwlmapper;
	
	@Autowired
	private UserMapper usermapper;
	
	@GetMapping("/getUser")
	@ResponseBody
	public User getUserInfo(int id) {
		
		return usermapper.selectUser(1);
	}
	
	@RequestMapping("/hello")
	public String HelloSpringBoot() {
		
		System.out.println("测试Controller跳转前台页面");
		return "user/index";
	}
	
	@RequestMapping("/csdn")
	@ResponseBody
	@Scheduled(cron="0 0 12 * * ?")   //每天12点执行一次
	public String selectcsdn() throws IOException {
		
		csdn csdn=new csdn();
		int fwl=csdn.selectcsdn();
		fwl wl=new fwl();
		wl.setFwl(fwl);
		wl.setTime(getTime());
		System.out.println("fwl:"+fwl);
		System.out.println("显示时间是:"+getTime());
		int a=fwlmapper.insertfwl(wl);
		System.out.println("a："+a);
		return "插入成功";
	}
	
	@RequestMapping("/selecttime")
	@ResponseBody
	public List<fwl> selecttime(){
		
		System.out.println("进入了");

		return fwlmapper.selectall();
	}
	


	
	
	public static String getTime() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String updateTime=sdf.format(date);
		return updateTime;
	}
	


	}

	

