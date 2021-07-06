package com.revature.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.beans.Box;

/*
 * This configuration is where we will tell Spring Framework how to create our beans
 * 
 * This can also be done in an XML File, but we will be using annotations.
 * (n.b. take a look at the shared repo for examples of XML configuration)
 * 
 * 
 * */

@Configuration
public class BoxConfig {
	
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Box getSingleBox() {
		System.out.println("Getting you a box...");
		return new Box();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Box getNewBox() {
		System.out.println("Getting you a NEW box...");
		return new Box(8);
	}

}
