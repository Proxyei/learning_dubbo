package com.xywei.dubbo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xywei.dubbo.helloworld.service.HelloworldService;

@Controller
public class HelloworldController {

	@Reference
	private HelloworldService helloworldService;

	@RequestMapping("helloworld")
	@ResponseBody
	public String sayHello(String username) {

		return helloworldService.sayHellworld(username);
	}

}
