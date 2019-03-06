package com.spring.wiring;
import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestResourceNameType {

	@Bean(name = "defaultFile")
	public File defaultFile() {
		File namedFile = new File("defaultFile.txt");
		return namedFile;
	}

	@Bean(name = "namedFile")
	public File namedFile() {
		File namedFile = new File("namedFile.txt");
		return namedFile;
	}
}
