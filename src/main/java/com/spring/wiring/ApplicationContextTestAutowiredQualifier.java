package com.spring.wiring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dependency.ArbitraryDependency;

@Configuration
public class ApplicationContextTestAutowiredQualifier {
	@Bean
	public ArbitraryDependency autowiredFieldDependency() {
		ArbitraryDependency autowiredFieldDependency = new ArbitraryDependency();
		return autowiredFieldDependency;
	}

	@Bean
	public ArbitraryDependency anotherAutowiredFieldDependency() {
		ArbitraryDependency anotherAutowiredFieldDependency = new AnotherArbitraryDependency();
		return anotherAutowiredFieldDependency;
	}
}
