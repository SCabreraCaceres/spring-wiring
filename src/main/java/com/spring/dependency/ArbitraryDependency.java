package com.spring.dependency;

import org.springframework.stereotype.Component;

@Component(value = "autowiredFieldDependency") // tells the Spring Framework
												// that the ArbitraryDependency
												// class is a component named
												// autowiredFieldDependency.
												// In order for the @Autowired
												// annotation to resolve
												// dependencies by name
public class ArbitraryDependency {
	private String label = "Arbitrary Dependency";

	public String getLabel() {
		return label;
	}

	/*
	 * @Bean(name = "defaultDependecy") public void setLabel(String label) {
	 * this.label = label; }
	 */

	@Override
	public String toString() {
		return label;
	}
}
