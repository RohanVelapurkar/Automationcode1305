import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
	
	public static void main(String[] args) {
System.setProperty("chromedriver.chrome.driver", "D:\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("")).sendKeys("");
		
       driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("ddfd");		
       
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");		

       driver.findElement(By.linkText("Forgot your password?")).click();		

     System.out.println( driver.findElement(By.tagName("p")).getText());
     

}
}