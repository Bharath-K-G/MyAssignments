package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shalini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sri");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9600972481");
        driver.findElement(By.xpath("//input[contains(@id,'step')]")).sendKeys("Password123@");
        WebElement dd = driver.findElement(By.id("day"));
        Select dropdown =new Select(dd);
        dropdown.selectByVisibleText("21");
        
        WebElement dd1 = driver.findElement(By.id("month"));
        Select dropdown1 =new Select(dd1);
        dropdown1.selectByValue("9");
        
        WebElement dd2 =driver.findElement(By.id("year"));
        Select dropdown2 = new Select(dd2);
        dropdown2.selectByVisibleText("1998");
        
        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        
                
        

	}

}
