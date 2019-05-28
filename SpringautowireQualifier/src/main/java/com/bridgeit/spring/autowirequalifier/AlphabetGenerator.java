package com.bridgeit.spring.autowirequalifier;

import org.springframework.stereotype.Component;

@Component
public class AlphabetGenerator implements Generator<String>{

	private char alphabet;
	public AlphabetGenerator(){
		alphabet = 65;
	}
	
	@Override
	public String generate(){
		return"" + (alphabet++);
	}
}

