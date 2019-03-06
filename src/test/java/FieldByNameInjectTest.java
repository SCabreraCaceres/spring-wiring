import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = ApplicationContextTestInjectName.class)
public class FieldByNameInjectTest {

	@Inject
	// @Named("yetAnotherFied")
	private ArbitraryDependency yetAnotherField;

	@Test
	public void givenInjectQualifier_WhenSetOnField_ThenDependencyValid() {
		System.out.println(yetAnotherField.getLabel());
		assertNotNull(yetAnotherField);
		assertEquals("Yet Another Arbitrary Dependency",
				yetAnotherField.toString());
	}
}
