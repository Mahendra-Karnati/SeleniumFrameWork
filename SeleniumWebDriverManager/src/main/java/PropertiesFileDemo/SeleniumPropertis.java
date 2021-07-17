package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPropertis {
	static Properties pro=new Properties();
	public static void main(String[] args) {
		getProperties();
		setProperties();
	}
	public static void getProperties()  {
		try {
			
			FileInputStream fis =new FileInputStream("C:\\Users\\RAJA MAHENDRA\\eclipse-workspace\\SeleniumWebDriverManager\\src\\main\\java\\PropertiesFileDemo\\selenium.properties");
			pro.load(fis);
			String browser=pro.getProperty("browser");
			System.out.println(browser);
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get(pro.getProperty("url"));
			String word11=pro.getProperty("word");
			driver.findElement(By.name("q")).sendKeys(word11);
			driver.close();
			int i=1/1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
	}
	public static void setProperties()  {
		try {
			FileOutputStream fos= new FileOutputStream("C:\\\\Users\\\\RAJA MAHENDRA\\\\eclipse-workspace\\\\SeleniumWebDriverManager\\\\src\\\\main\\\\java\\\\PropertiesFileDemo\\\\selenium.properties");
			pro.setProperty("browser", "chrome");
			pro.store(fos, "Reddy");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
