import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessChrome {
	public static void main(String[] args) throws Exception {
		HeadlessBrowser();
		
	}
	public static void HeadlessBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		//we can use WebDriverManager.chromedriver().version("2.46").setup() for the choosing of version you want.
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		String eTitle=driver.getTitle();
		System.out.println(eTitle);
		driver.findElement(By.name("q")).sendKeys("RajaMahendra");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		driver.close();
		driver.quit();
		
	}

}
