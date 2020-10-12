package com.demo.sping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.sping.items.Computer;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Computer computer = ctx.getBean(Computer.class);

		computer.getSpecs();

	}

}
