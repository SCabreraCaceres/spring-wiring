import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dependency.ArbitraryDependency;
import com.spring.wiring.AnotherArbitraryDependency;

@Configuration
public class ApplicationContextTestInjectQualifier {

	@Bean
	public ArbitraryDependency defaultDependency() {
		ArbitraryDependency defaultDependency = new ArbitraryDependency();
		return defaultDependency;
	}

	@Bean
	public ArbitraryDependency namedDependency() {
		ArbitraryDependency namedDependency = new AnotherArbitraryDependency();
		return namedDependency;
	}
}