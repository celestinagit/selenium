package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	//d2 q3
	System.setProperty("webdriver.chrome.driver","D:\\tina\\softesting\\Locators\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
    WebElement search = driver.findElement(By.name("q"));   
    search.sendKeys("GreensTechnology");

}
}
