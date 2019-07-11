package com.xywei.helloworld.action;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xywei.dubbo.helloworld.service.HelloworldService;

public class HelloworldAction {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		applicationContext.start();
		HelloworldService helloworldService = applicationContext.getBean(HelloworldService.class);
		System.out.println(helloworldService.sayHellworld("admin"));
		System.in.read();
	}

}
