package com.spring.wiring;

import com.spring.dependency.ArbitraryDependency;

public class AnotherArbitraryDependency extends ArbitraryDependency {
	private String label = "Another Arbitrary Dependency";

	/*
	 * @Bean(name = "anotherDependency") public void setLabel(String label) {
	 * this.label = label; }
	 */

	@Override
	public String toString() {
		return label;
	}
}
