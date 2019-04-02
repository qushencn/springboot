package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
@EnableScheduling
public class SpringbootmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybatisApplication.class, args);
	}

}
