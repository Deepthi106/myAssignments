package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited AccountD");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("uvw");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("500000");
		
		WebElement IndDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(IndDD);
		sec.selectByIndex(3);
		
		WebElement OwnerDD = driver.findElement(By.name("ownershipEnumId"));
		Select sec1= new Select(OwnerDD);
		sec1.selectByVisibleText("S-Corporation");
		
		WebElement SoureDD = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(SoureDD);
		sec2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MarDD = driver.findElement(By.id("marketingCampaignId"));
		Select sec3 = new Select(MarDD);
		sec3.selectByIndex(6);
		
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4 = new Select(stateDD);
		sec4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

	}

}
