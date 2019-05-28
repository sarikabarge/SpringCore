package com.bridgeit.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.bridgeit.spring.annotation")
public class CollegeConfig {

	@Bean(name = { "colBean","collegeBeanAnother"})
	public College collegeBean() {  //collegeBean- beanid
		College college=new College();
		return college;
	}
}
