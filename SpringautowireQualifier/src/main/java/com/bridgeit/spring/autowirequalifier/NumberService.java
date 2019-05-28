package com.bridgeit.spring.autowirequalifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

	@Autowired
	private NumberGenerator generator;
	
	public NumberService(){
		
	}
	
	public Integer getNumber(){
		return generator.generate();
	}
}