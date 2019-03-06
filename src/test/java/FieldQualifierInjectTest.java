import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = ApplicationContextTestInjectQualifier.class)
public class FieldQualifierInjectTest {

	@Inject
	private ArbitraryDependency defaultDependency;

	@Inject
	private ArbitraryDependency namedDependency;

	@Test
	public void givenInjectQualifier_WhenOnField_ThenDefaultFileValid() {
		assertNotNull(defaultDependency);
		assertEquals("Arbitrary Dependency", defaultDependency.toString());
	}

	@Test
	public void givenInjectQualifier_WhenOnField_ThenNamedFileValid() {
		assertNotNull(namedDependency);
		assertEquals("Another Arbitrary Dependency",
				namedDependency.toString());
	}
}
