package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[text()=' for boys']/parent::div")).click();
		
	String text = driver.findElement(By.xpath("//span[contains(text(),'1-48 of over 50,000 results for')]")).getText();

		
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'\"bags for boys\"')]")).getText();
		System.out.println(text  +text2);
		
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String text3 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		System.out.println(text3);
		
		String text4 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(text4);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		

	}

}
