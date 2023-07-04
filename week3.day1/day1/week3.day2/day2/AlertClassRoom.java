package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassRoom {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	Thread.sleep(3000);
	Alert Prompt = driver.switchTo().alert();
	String text = Prompt.getText();
	System.out.println(text);
	Prompt.sendKeys("Bharath");
	Thread.sleep(3000);
	Prompt.accept();
	
	
	
	
}
}
