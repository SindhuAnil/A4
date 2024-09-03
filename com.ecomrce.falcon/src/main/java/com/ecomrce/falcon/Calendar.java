package com.ecomrce.falcon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver();
 		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();

		driver.findElement(By.xpath("")).click();
	}

}
