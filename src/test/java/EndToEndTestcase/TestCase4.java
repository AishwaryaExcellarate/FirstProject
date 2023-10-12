package EndToEndTestcase;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 
{
	@Test()
	public void enttoendtesting() throws  AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("remote--allow--origin");
		
		//FirefoxOptions Option1=new FirefoxOptions();
		//Option1.addArguments("remote--allow--origin");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver2=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();
		
		driver.findElement(By.xpath("(//span[contains(.,'Admin')])[1]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		
	    driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).click();
	    driver.findElement(By.xpath("//span[text()='ESS']")).click();
	    driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
	    driver.findElement(By.xpath("//span[text()='Enabled']")).click();
	    driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("zefc@321");
	    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Sarah Johnson");
	    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("harrypotter@321.com");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("zefc@321");
	    driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	    
	  
	   
		
		

}
}
