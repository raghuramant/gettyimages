package org.softcrylic.GettyImages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainScript extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		browserOpen();
		launchURL("https://www.gettyimages.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(driver.findElement(By.xpath("(//div[@class='ups-menu-item ups-account ups-sign-in'])[2]")));
		driver.findElement(By.linkText("Register")).click();
		WebElement txtFirstName = driver.findElement(By.id("register_first_name"));
		setText(txtFirstName, "arun");

		WebElement txtLastName = driver.findElement(By.id("register_last_name"));
		setText(txtLastName, "Sekar");

		WebElement drpdownCompanyType = driver.findElement(By.id("register_organization_type"));
		selectByValue(drpdownCompanyType, "26");
		
		WebElement txtCompanyName = driver.findElement(By.id("register_organization_name"));
		setText(txtCompanyName, "cw");

		WebElement drpdownJobTitle = driver.findElement(By.id("register_job_title"));
		selectByValue(drpdownJobTitle, "56");

		WebElement txtEmail = driver.findElement(By.id("register_email"));
		setText(txtEmail, "arun@gmail.com");

		WebElement txtMobile = driver.findElement(By.id("register_telephone"));
		setText(txtMobile, "9876543211");

		WebElement txtPassword = driver.findElement(By.id("register_password"));
		setText(txtPassword, "mypassworD123");

		WebElement btnLogin = driver.findElement(By.id("register-button"));
		click(btnLogin);
		Thread.sleep(3000);
		
		browserClose();
	}

}
