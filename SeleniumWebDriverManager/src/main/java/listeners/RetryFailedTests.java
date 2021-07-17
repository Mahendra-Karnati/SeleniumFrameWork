package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTests {
@Test
	public void test1() {
		System.out.println("Iam inTest1");
	}
@Test(retryAnalyzer = MyRetry.class)
public void test2() {
	Assert.assertTrue(0>1);
	System.out.println("Iam inTest2");
}
}
