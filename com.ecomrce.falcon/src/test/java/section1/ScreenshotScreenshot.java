package section1;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
public class ScreenshotScreenshot {
	public static void main(String[] args) {
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver();
 		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(outputType.FILE);
		File dest= new File("");
		Files.copy(src, dest);
		driver.findElement(By.xpath(""))send.keys("i phone 14");
}
}
