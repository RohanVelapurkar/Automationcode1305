import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("rohan");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rvelapurkar@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("121221");

		
	
		
		
		
	}
}
