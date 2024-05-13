import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@id=\"inputUsername\"]")).sendKeys("rvelapurkar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshfdfdfdettyacademy");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p")).getText());
		
		
		//driver.close();
		
		
		
		
		
	}

}
