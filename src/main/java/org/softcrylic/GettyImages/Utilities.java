package org.softcrylic.GettyImages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	public static WebDriver driver;

	public static void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void setText(WebElement element, String inputText){
		element.sendKeys(inputText);
	}
	public static void click(WebElement element){
		element.click();
		
	}
	
	
	public static void launchURL(String url){
		driver.get(url);
	}
	public static void browserClose(){
		driver.quit();
	}
	public static void selectByValue(WebElement element, String value){
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	
}
