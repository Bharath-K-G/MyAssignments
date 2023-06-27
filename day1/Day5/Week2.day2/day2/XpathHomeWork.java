package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathHomeWork {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chris");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ana");
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select employee = new Select(source);
		employee.selectByVisibleText("Employee");
		
		WebElement market = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select camp =new Select(market);
		camp.selectByValue("9001");
		
		WebElement owner = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select corp =new Select(owner);
		corp.selectByIndex(5);
		
		WebElement country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select ind = new Select(country);
		ind.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String tilte = driver.getTitle();
		System.out.println(""  +tilte);
		
		
		
		
		

	}

}
