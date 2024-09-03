package com.ecomrce.falcon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
WebElement ele=driver.findElement(By.xpath("//span[text()='Men']"));
Actions act=new Actions(driver);
act.moveToElement(ele).perform();
List<WebElement>options=driver.findElements(By.xpath(""));
Iterator<WebElement>itr=options.iterator();
while(itr.hasNext()) {
	String data=itr.next().getText();
	System.out.println(data);

}
driver.quit();
	}

}
