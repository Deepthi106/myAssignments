package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
    
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("2345");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Lead')]")).click();
		{
			String firstLead = driver.findElement(By.xpath("//button[contains(text(),'Find Lead')]")).getText();
			System.out.println(firstLead);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'15995')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.id("id")).sendKeys("15995");
		driver.findElement(By.name("x-btn-text")).click();
		
		
		
		
	}

}
