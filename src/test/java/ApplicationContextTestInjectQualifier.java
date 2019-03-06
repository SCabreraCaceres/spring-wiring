import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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