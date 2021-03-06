package com.luigis.luigisreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan({ "com.luigis.luigisreview" })
@EnableSwagger2
public class LuigisReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuigisReviewApplication.class, args);
	}

}
