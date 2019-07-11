package com.xywei.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class SpringbootDubboHelloworldConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboHelloworldConsumerApplication.class, args);
	}

}
