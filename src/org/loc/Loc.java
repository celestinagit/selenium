package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {
public static void main(String[] args) {
	
	//day 2 Queno.1
	System.setProperty("webdriver.chrome.driver", "D:\\tina\\softesting\\Locators\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get(" https://www.facebook.com/");
    
    WebElement mail = driver.findElement(By.id("email"));
    mail.sendKeys("green@gmail.com");
    
    WebElement psd = driver.findElement(By.name("pass"));
    psd.sendKeys("fb123");
    
    
}
}

