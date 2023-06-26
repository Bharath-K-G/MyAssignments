package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MGS");
		driver.findElement(By.name("departmentName")).sendKeys("MCA");
		driver.findElement(By.name("description")).sendKeys("I am from TestLeaf");
		
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("XYC@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println("title " +title);
		
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		driver.findElement(By.className("inputBox")).clear();
		driver.findElement(By.className("inputBox")).sendKeys("CTS");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Virat");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String Title1= driver.getTitle();
		System.out.println("" +Title1);
		
		
	
	
	
	}

}
