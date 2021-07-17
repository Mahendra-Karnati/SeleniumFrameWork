import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItRunningClass {

	public static void main(String[] args)  {
		try {
			getRun();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
	public static  void getRun() throws Exception  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://smallpdf.com/word-to-pdf");
		String eTittle=driver.getTitle();
		System.out.println(eTittle);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\reddy.exe");
		System.out.println("FileUploaded Successfully");

		driver.close();

	}

}
