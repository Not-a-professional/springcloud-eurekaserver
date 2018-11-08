package com.example.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//需要有这个注解启动微服务注册发现
@EnableEurekaServer
public class SpringcloudEurekaserverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaserverApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringcloudEurekaserverApplication.class);
	}
}
