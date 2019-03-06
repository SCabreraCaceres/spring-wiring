import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = ApplicationContextTestResourceNameType.class)
public class MethodResourceInjectionIntegrationTest {

	private File namedFile;

	@Resource // Type??
	protected void setNamedFile(File defaultFile) {
		this.namedFile = defaultFile;
	}

	@Test
	public void givenResourceAnnotation_WhenSetter_ThenDependencyValid() {
		assertNotNull(namedFile);
		assertEquals("namedFile.txt", namedFile.getName());
	}

}
