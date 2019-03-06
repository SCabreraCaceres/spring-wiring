import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.spring.dependency.ArbitraryDependency;
import com.spring.wiring.ApplicationContextTestAutowiredQualifier;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = ApplicationContextTestAutowiredQualifier.class)
public class FieldQualifierAutowiredTest {

	@Autowired
	@Qualifier("autowiredFieldDependency")
	private ArbitraryDependency fieldDependency1;

	@Autowired
	@Qualifier("anotherAutowiredFieldDependency")
	private ArbitraryDependency fieldDependency2;

	/*
	 * org.springframework.beans.factory.UnsatisfiedDependencyException: Error
	 * creating bean with name 'FieldQualifierAutowiredTest': Unsatisfied
	 * dependency expressed through field 'fieldDependency1'; nested exception
	 * is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No
	 * qualifying bean of type 'ArbitraryDependency' available: expected single
	 * matching bean but found 2:
	 * autowiredFieldDependency,anotherAutowiredFieldDependency at
	 * org.springframework.beans.factory.annotation.
	 * AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(
	 * AutowiredAnnotationBeanPostProcessor.java:598) at
	 * org.springframework.beans.factory.annotation.InjectionMetadata.inject(
	 * InjectionMetadata.java:90) at
	 * org.springframework.beans.factory.annotation.
	 * AutowiredAnnotationBeanPostProcessor.postProcessProperties(
	 * AutowiredAnnotationBeanPostProcessor.java:376)
	 */

	@Test
	public void givenAutowiredQualifier_WhenOnField_ThenDep1Valid() {
		assertNotNull(fieldDependency1);
		assertEquals("Arbitrary Dependency", fieldDependency1.toString());
	}

	@Test
	public void givenAutowiredQualifier_WhenOnField_ThenDep2Valid() {
		assertNotNull(fieldDependency2);
		assertEquals("Another Arbitrary Dependency",
				fieldDependency2.toString());
	}

}
