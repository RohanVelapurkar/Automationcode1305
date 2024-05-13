import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	
	public static void main(String[] args) {
		
		System.setProperty("chromedriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rvelapurkar@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("fdfdfdfdf");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		
		
	
		
	}

}
