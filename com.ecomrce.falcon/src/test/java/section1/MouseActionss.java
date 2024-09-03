package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionss {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebElement element = null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		//Actions act = new Actions(driver);
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.manage().window().maximize();
 		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
 		Thread.sleep(3000);
 	WebElement ele =driver.findElement(By.xpath("//div[@class='zoom-button ']"));
 	Thread.sleep(3000);
 		Actions act = new Actions(driver);
 		act.clickAndHold(ele).perform();
 		act.release(ele).perform(); 				
	}
}
