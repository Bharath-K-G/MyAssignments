package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        
        driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
        WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
        Select gn = new Select(genre);
        gn.selectByVisibleText("ANIMATION");
        
        WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
        Select lang = new Select(language);
        lang.selectByVisibleText("ENGLISH");
       
        
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        
        Thread.sleep(3000);
       driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
       
       WebElement cinema = driver.findElement(By.xpath("//select[@id='cinemaName']"));
       Select Cl = new Select(cinema);
       Cl.selectByValue("SPI Sathyam Chennai");
       
       driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']//input")).click();
       
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='controls']/*[2]")).click();
       driver.findElement(By.xpath("//span[text()='6']")).click();
       
       WebElement time = driver.findElement(By.xpath("//select[@name='timings']"));
       Select t = new Select(time);
       t.selectByIndex(2);
       
       driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("5");
       
       driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Bharath");
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("XYZ@gmail.com");
       driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9600972481");
       WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
       Select fb =new Select(food);
       fb.selectByVisibleText("No");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//label[text()='F&B Requirements']/following::input")).sendKeys("None");
       driver.findElement(By.xpath("//div[@class='form-group col-sm-6']//label")).click();
       driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
       driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
       driver.findElement(By.xpath("(//button[text()='×'])")).click();
       
       String title = driver.getTitle();
       System.out.println(title);
       
	}

}
