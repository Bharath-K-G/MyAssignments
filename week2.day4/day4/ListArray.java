package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListArray {

	public static void main(String[] args) {
		
		 ChromeDriver driver= new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.manage().window().maximize();
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        int link = links.size();
	        
	        System.out.println(link);
	        
	    for (int i = 0; i < link; i++) {
	        String text = links.get(i).getText();
	        System.out.println(text);
	    }}
}
