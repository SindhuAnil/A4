package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingchromebrower {

	public static  void main(String[] args) throws Exception {
		String expectedData="demoapps";
		String expectedTitle="Demoapps";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		String actualDataUrl=driver.getCurrentUrl();		
		String actualTitle=driver.getTitle();
		System.out.println(actualDataUrl);
		System.out.println(actualTitle);
		if(actualTitle.contains(expectedTitle) && actualDataUrl.contains(expectedData)) {
			System.out.println("access demoapps successfully");
			
		}else {
			System.out.println("not accessed");
		}
		Thread.sleep(4000);
		driver.close();

	}

}
