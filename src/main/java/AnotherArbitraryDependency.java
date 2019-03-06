import org.springframework.context.annotation.Bean;

public class AnotherArbitraryDependency extends ArbitraryDependency {
	private String label = "Another Arbitrary Dependency";

	@Override
	@Bean(name = "anotherDependency")
	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}
}
