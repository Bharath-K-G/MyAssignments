package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
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
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bharathkumar20192019@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600972481");
	Thread.sleep(2000);
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(5000);
	driver.close();
	

}



}
