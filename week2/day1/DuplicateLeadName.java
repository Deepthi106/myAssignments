package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLeadName {
	
public static void main(String[] args) {
	
         ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
        driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("zxc");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ROP");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SSS");
		
		WebElement SoureDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(SoureDD);
		sec.selectByVisibleText("Employee");
		
		WebElement MarDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(MarDD);
		sec1.selectByValue("9001");
		
		WebElement OwnerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2= new Select(OwnerDD);
		sec2.selectByIndex(5);
		
		WebElement CountryDD = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select sec3 = new Select(CountryDD);
		sec3.selectByValue("IND");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();{
			
			System.out.println(title);
			
			}
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DFG");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deeps");
		driver.findElement(By.name("submitButton")).click();
        
		String titleDup = driver.getTitle();{
			
			System.out.println(titleDup);
			
			}	
	}
	}

