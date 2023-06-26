package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
        WebElement op=  driver.findElement(By.id("createLeadForm_industryEnumId"));
		
        Select options = new Select(op);
        options.selectByValue("IND_SOFTWARE");
        
        WebElement op1=  driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        
        Select options1 = new Select(op1);
        
        options1.selectByVisibleText("Corporation");
        
        WebElement op2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
        Select options2=new Select(op2);
        
        
        
        
        options2.selectByVisibleText("Arkansas");
        
        
		
	}

}
