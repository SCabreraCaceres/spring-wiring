import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = ArbitraryDependency.class)
public class FieldInjectTest {

	@Inject
	private ArbitraryDependency fieldInjectionDependency;

	@Test
	public void givenInjectAnnotation_WhenOnField_ThenValidDependency() {
		assertNotNull(fieldInjectionDependency);
		assertEquals("Arbitrary Dependency",
				fieldInjectionDependency.toString());
	}

}
