package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("li[class='w- [100%]flex justify- between items- center py- 1 cursor- pointer" + "PX-2 relative PS-1 text-[14PX]text-back']"))
	.click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id='name']"))
	.sendKeys("Anil");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id='email']"))
	.sendKeys("sindhuanil@gamil.com");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.cssSelector("input[type='password']"));
	element.sendKeys("sindhuandanil");
	Thread.sleep(3000);
	element.submit();
	}

}
