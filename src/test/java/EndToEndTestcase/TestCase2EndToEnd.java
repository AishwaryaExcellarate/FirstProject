package EndToEndTestcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2EndToEnd 
{
	@Test()
	public void enttoendtesting() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("remote--allow--origin");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(.,'My Info')]")).click();
       driver.findElement(By.xpath("//img[contains(@class,'employee-image')]")).click();
       driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
       Robot r=new Robot();
		
		StringSelection str=new StringSelection("C:\\Users\\aishwaryaa\\Pictures\\pic1\\pic1.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		 r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_V);
	     
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	     
	     System.out.println("File uploaded successfull");
	     
         driver.quit();
   }
        
	

}

