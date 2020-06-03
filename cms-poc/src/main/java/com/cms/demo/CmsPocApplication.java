package com.cms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CmsPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsPocApplication.class, args);
	}

}
