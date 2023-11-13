package com.example.michele;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.example.michele.*", exclude = {SecurityAutoConfiguration.class})
@EnableSwagger2
@ComponentScan("com.example.michele")
public class SpringbootMVC {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMVC.class, args);
	}

}
