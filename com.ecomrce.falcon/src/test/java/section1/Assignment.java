package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		String pname =driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Purple, 128 GB)']")).getText();
		//String price=driver.findElement(By.xpath(""));
		
		
	}

}
