package com.example.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//需要有这个注解启动微服务注册发现
@EnableEurekaServer
public class SpringcloudEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaserverApplication.class, args);
	}
}
