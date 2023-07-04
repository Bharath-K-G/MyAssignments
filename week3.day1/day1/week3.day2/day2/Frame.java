package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.switchTo().frame("iframeResult");
	        
	        driver.findElement(By.xpath("//button[text()='Try it']")).click();
	              
	        Alert alert = driver.switchTo().alert();
	        String text = alert.getText();
	        System.out.println(text);
	        
	        alert.accept();
	        
	        String text2 = driver.findElement(By.id("demo")).getText();	
	        System.out.println(text2);
	        }


}
		
			

		




		