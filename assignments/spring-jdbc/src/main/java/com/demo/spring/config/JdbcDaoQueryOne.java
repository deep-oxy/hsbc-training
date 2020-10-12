package com.demo.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;

public class JdbcDaoQueryOne {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		EmpDao dao = ctx.getBean(EmpDao.class);
		Emp e = dao.findBtId(201);
		System.out.println(e.getEmpId() + " " + e.getName());

	}

}
