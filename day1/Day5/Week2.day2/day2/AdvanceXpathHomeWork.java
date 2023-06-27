package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathHomeWork {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
			driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.xpath("//div[@id='label']/a")).click();
			driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[2]")).click();
			driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
			driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("Hari");
		    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    driver.findElement(By.linkText("10612")).click();
		    
		    String title = driver.getTitle();
		    System.out.println("" +title);
		    
		    driver.findElement(By.xpath("(//a[@class='subMenuButton']/following-sibling::a)[2]")).click();
		    
		    driver.findElement(By.id("updateLeadForm_companyName")).clear();
		    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		    driver.findElement(By.name("submitButton")).click();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.close();
	}

}
