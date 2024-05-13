import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rbc");
	driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("123");
	driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
	driver.close();

	
	
}
}
