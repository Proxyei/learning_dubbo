package com.xywei.dubbo.helloworld.service.impl;

import com.xywei.dubbo.helloworld.service.HelloworldService;

public class HelloworldServiceImpl implements HelloworldService {

	public String sayHellworld(String username) {
		return username + ", helloworld!";
	}

}
