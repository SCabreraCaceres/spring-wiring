package com.spring.wiring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dependency.ArbitraryDependency;

@Configuration
public class ApplicationContextTestAutowiredType {

	@Bean
	public ArbitraryDependency autoWiredFieldDependency() {
		ArbitraryDependency autoWiredFieldDependency = new ArbitraryDependency();
		return autoWiredFieldDependency;
	}
}
