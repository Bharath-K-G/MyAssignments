package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Rohit");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("MGS");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10000000");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind =new Select(industry);
		ind.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select os=new Select(ownership);
		os.selectByVisibleText("S-Corporation");
		
		WebElement employee = driver.findElement(By.name("dataSourceId"));
		Select emp=new Select(employee);
		emp.selectByValue("LEAD_EMPLOYEE");
		
		

		WebElement market = driver.findElement(By.name("marketingCampaignId"));
		Select mc=new Select(market);
		mc.selectByIndex(6);
		
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sv=new Select(state);
		sv.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
	
	
	
	
	}
	

}
