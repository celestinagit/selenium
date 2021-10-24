package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException {
		//d2 q.no 2
		System.setProperty("webdriver.chrome.driver", "D:\\tina\\softesting\\Locators\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		//Thread.sleep(3000);
		//WebElement mailclic = driver.findElement(By.xpath("//span[text()='Phone number, username, or email']"));
		//mailclic.click();
		
		WebElement mail = driver.findElement(By.xpath("//span[text()='Phone number, username, or email']"));
		mail.sendKeys("insta@gmail.com");
		
		
		//WebElement psd = driver.findElement(By.xpath("//input[@name='password']"));
	    //psd.sendKeys("ins23");
}}
