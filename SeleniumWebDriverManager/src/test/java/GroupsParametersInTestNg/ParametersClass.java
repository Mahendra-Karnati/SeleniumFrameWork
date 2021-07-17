package GroupsParametersInTestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametersClass {
	@Test
	@Parameters({"MyName"})
	private void test(@Optional String Name) {
		System.out.println("My Name is"+ Name);

	}

}
