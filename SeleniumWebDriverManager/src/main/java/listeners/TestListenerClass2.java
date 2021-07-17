package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestListenerClass2 {
	WebDriver driver=null;
	@Test
	  public void test1() {
		System.out.println("Iam InsideTest1");
	  }

	@Test
	public void test2(){
		System.out.println("Iam InsideTest2");
		WebDriverManager.chromedriver().setup();//we can use WebDriverManager.chromedriver().version("2.46").setup() for the choosing of version you want.
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("Mahendra");
		 driver.findElement(By.name("btnk")).sendKeys("keys.ENTER");
		 driver.close();
	}
	@Test
	public void test3(){
		System.out.println("Iam InsideTest3");
		throw new SkipException("This test is Skipped");
	}
	

}
