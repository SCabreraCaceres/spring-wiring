package com.spring.wiring;

import com.spring.dependency.ArbitraryDependency;

public class YetAnotherArbitraryDependency extends ArbitraryDependency {

	private final String label = "Yet Another Arbitrary Dependency";

	@Override
	public String toString() {
		return label;
	}
}
