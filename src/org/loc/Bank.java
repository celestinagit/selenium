package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\tina\\softesting\\Locators\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://infinity.icicibank.com/corp/Login.jsp");
    
    WebElement userid1 = driver.findElement(By.name("DUMMY1"));
    userid1.click();
    
    WebElement userid = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
    userid.sendKeys("icic123");
    
    WebElement psd = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
    psd.sendKeys("icic123");
}
}
