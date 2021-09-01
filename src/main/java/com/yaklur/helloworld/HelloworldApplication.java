package com.yaklur.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	//@Bean
	//public PasswordEncoder passwordEncoder(){
	//	return NoOpPasswordEncoder.getInstance();
	//}


}
