package GroupsParametersInTestNg;

import org.testng.annotations.Test;
public class DependsOnGroupClass { 
	@Test()
	public void test1()
	{
		System.out.println("Iam inside Tet1");
	}
	@Test(groups= {"sanity1"},priority=-1)
   public void test2() {
	   System.out.println("Iam inside Test2");
   }
   @Test(dependsOnGroups= {"sanity1"})
	 public void test3() {
		   System.out.println("Iam inside Test3");
	   }
}
