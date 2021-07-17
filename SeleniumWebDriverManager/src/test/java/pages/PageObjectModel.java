package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {
	WebDriver driver=null;
	By text_box= By.name("q");
	By button_search= By.name("btnK");
	public PageObjectModel(WebDriver driver){
		this.driver=driver;
		driver.get("https://www.google.com");
	}
	public void textBoxSearch(String text) {
		driver.findElement(text_box).sendKeys(text);
	}
	public void searchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
