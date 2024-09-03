package com.ecomrce.falcon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownwithSelect {

	public static void main(String[] args) throws Exception {
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Select S=null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(3000);
		WebElement DD1=driver.findElement(By.xpath("//select[@id='phoneInput']"));
		Thread.sleep(3000);
		S=new Select(DD1);
Thread.sleep(3000);
S.selectByIndex(2);
WebElement gender=driver.findElement(By.xpath("//select[@id='select40']"));
S=new Select(gender);
S.selectByVisibleText("Male");
Thread.sleep(3000);
WebElement country=driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
S=new Select(country);
System.out.println("country dropdown is multiselected:"+S.isMultiple());
S.selectByValue("Poland");
S.selectByIndex(3);
S.selectByVisibleText("United Kingdom");
System.out.println("all options are:--------------");
Thread.sleep(3000);
List<WebElement>alloptions=S.getOptions();
for(WebElement elements:alloptions) { 
	String value=elements.getText();
	System.out.println(value);
}
System.out.println("{All selected options are:------------");
List<WebElement>allSelectedoptions=S.getAllSelectedOptions();
for(WebElement element:allSelectedoptions) {
	String value=element
			
			.getText();
	System.out.println(value);
	
}
S.deselectAll();
driver.close();

	}

}
