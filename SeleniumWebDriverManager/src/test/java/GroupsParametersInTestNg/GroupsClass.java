package GroupsParametersInTestNg;

import org.testng.annotations.Test;

public class GroupsClass {
@Test(groups= {"sanity","Regression"})
public void test1() {
	System.out.println("Iam inside Test1");
}
@Test(groups= {"sanity"})
public void test2() {
	System.out.println("Iam inside Test2");
}
@Test(groups= {"Regression"})
public void test3() {
	System.out.println("Iam inside Test3");
}
}
