package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchingChromeBrowser {
public static void main(String[] args) {
	String expectedData="flipkart";
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	String actualData=driver.getCurrentUrl();
	if(actualData.contains(expectedData)) {
System.out.println("accest");


	}else {
		System.out.println("not");
	}
	
	
}
	

}
