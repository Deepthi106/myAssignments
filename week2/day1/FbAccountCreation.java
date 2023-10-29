package week2.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAccountCreation {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		//driver.findElement(By.name("firstname")).sendKeys("Ruthra");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ruthra");
		
		//driver.findElement(By.name("lastname")).sendKeys("Muruga");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Muruga");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8148490961");
		//driver.findElements(By.xpath("//input[@name='reg_email__']"))).sendKeys("8148490961");
		
		//driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sweet#1234");
		
		WebElement DayDD = driver.findElement(By.id("day"));
		Select sec = new Select(DayDD);
		sec.selectByIndex(5);
		
		WebElement MonthDD = driver.findElement(By.id("month"));
		Select sec1 = new Select(MonthDD);
		sec1.selectByVisibleText("May");
		
		WebElement YearDD = driver.findElement(By.id("year"));
		Select sec2 =new Select(YearDD);
		sec2.selectByValue("2010");
		
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		radio.click();
		
		
		
		
	}

}