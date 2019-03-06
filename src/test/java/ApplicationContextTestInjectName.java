import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dependency.ArbitraryDependency;
import com.spring.wiring.YetAnotherArbitraryDependency;

@Configuration
public class ApplicationContextTestInjectName {
	@Bean
	public ArbitraryDependency yetAnotherFieldInjectDependency() {
		ArbitraryDependency yetAnotherFieldInjectDependency = new YetAnotherArbitraryDependency();
		return yetAnotherFieldInjectDependency;
	}
}
