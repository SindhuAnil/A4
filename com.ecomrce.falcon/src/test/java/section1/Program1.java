package section1;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.manage().window().maximize();
 		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
 		Thread.sleep(3000);
 		
 		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
 		Thread.sleep(3000);
		WebElement mobilesrc=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
 		WebElement mobileDest=driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
 		act.dragAndDrop(mobilesrc,mobileDest).perform();
 		Thread.sleep(3000);
 		WebElement laptopsrc=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
 		WebElement laptopDest=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
 		act.dragAndDrop(laptopsrc,laptopDest).perform();
 		Thread.sleep(3000);
 		WebElement laptopc=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
 		WebElement laptopD=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
 		act.dragAndDrop(laptopc,laptopD).perform();
 		Thread.sleep(3000);
 		WebElement mobiles=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	WebElement mobileD=driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
 		act.dragAndDrop(mobiles,mobileD).perform();	

	}

}
