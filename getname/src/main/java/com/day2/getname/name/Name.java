package com.day2.getname.name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@Value("${name}")
	private String name;
	@GetMapping("/name")
	public String getName()
	{
		
		//System.out.print("Getting name using properties");
		//return "Getting name using properties";
		return "Getting name using properties"+"<br>I am "+name;		
	}
	
}
