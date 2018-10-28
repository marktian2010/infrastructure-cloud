package com.aiyingshi.infrastructure.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDiscoveryClient
@Controller
@EnableTurbineStream
@SpringBootApplication
public class TurbineApplication {

	@RequestMapping("/")
	public String home() {
		return "forward:/hystrix";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication.class, args);

	}

}
