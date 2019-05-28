package com.bridgeit.spring.autowirequalifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlphabetService {

	@Autowired
	private AlphabetGenerator generator;
	
	public AlphabetService(){	}
	
	public String getAlphabet(){
		return generator.generate();
	}	
}