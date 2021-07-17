package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelenimTestDemo {
			public static void main(String[] args) throws Exception {
				WebDriverManager.chromedriver().setup();//we can use WebDriverManager.chromedriver().version("2.46").setup() for the choosing of version you want.
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				Thread.sleep(5000);
				driver.close();
				
			}

	}


