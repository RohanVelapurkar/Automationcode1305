import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PC {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("chromedriver.chrome.driver", "D:\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("Rohan ");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("rbc@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1121212");
		driver.findElement(By.xpath("//div/button[2]")).click();
		
		
		
	}

}
