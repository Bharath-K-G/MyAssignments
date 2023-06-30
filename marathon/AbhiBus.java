package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		driver.findElement(By.xpath("//label[text()='Going to']/following::input")).click();
		driver.findElement(By.xpath("//a[text()='1']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h2[contains(text(),'Parveen ')]"));
		
		driver.findElement(By.xpath("(//input[@name='Bustypes'])[4]")).click();
		
		String text = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();
		System.out.println(text);
		
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'31 Seats Available')]")).getText();
		System.out.println(text2);
		
		driver.findElement(By.xpath("//span[contains(text(),'Select Seat')]")).click();
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[3]")).click();
		String text3 = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println(text3);
		
		String text4 = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println(text4);
		
		WebElement boardingpoint = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		
		Select bp = new Select(boardingpoint);
		bp.selectByIndex(7);
		
		WebElement droppingpoint = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		
		Select dp =new Select(droppingpoint);
		dp.selectByIndex(3);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is " +title );
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
