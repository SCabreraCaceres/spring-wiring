import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ArbitraryDependency {
	private String label = "Arbitrary Dependency";

	public String getLabel() {
		return label;
	}

	@Bean(name = "defaultDependecy")
	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}
}
