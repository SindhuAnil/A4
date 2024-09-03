package com.ecomrce.falcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.decorators.WebDriver;

public class MouseAction {

	public static void main(String[] args) {
	//	WebDriverDecorator driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver();
 		Actions act = new Actions(driver);
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.manage().window().maximize();
 		driver.get("https://www.flipkart.com/");
 		WebElement element=driver.findElement(By.xpath("//span[text()='Login']"));
 		act.click(element).build().perform();
 		boolean b =driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed();
 		System.out.println(b);
 		
 		
 		
 		
	}

}
