package com.hsbc.tr.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.dao.EmpDaoMock2Impl;

@Configuration
@ComponentScan(basePackages = "com.hsbc.tr.spring")
public class AppConfig {

	@Bean
	@Primary
	public EmpDao modDao2() {
		return new EmpDaoMock2Impl();
	}

}
