package com.xywei.dubbo.helloworldservice.impl;

import org.springframework.stereotype.Service;

import com.xywei.dubbo.helloworld.service.HelloworldService;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class HelloworldServiceImpl implements HelloworldService {

	@Override
	public String sayHellworld(String username) {
		return username + "helloworld-springboot";
	}

}
