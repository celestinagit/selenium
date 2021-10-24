package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		//d2 q.no 2
		System.setProperty("webdriver.chrome.driver", "D:\\tina\\softesting\\Locators\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		
		WebElement mail = driver.findElement(By.name("username"));
		mail.sendKeys("snapp@gmail.com");
		
}
}
