package ORANGEHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndTesting
{

	@Test(enabled = true)
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
		driver.findElement(By.xpath("(//*[local-name()='svg' and @role=\"presentation\"])[3]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add Employee')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Linda");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Ley");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Lee");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("123");
		//WebElement uploadele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i"));
		//uploadele.sendKeys("C:\\Users\\aishwaryaa\\Desktop\\data.csv.txt");
		//WebElement uploadele = driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));
		//uploadele.sendKeys("C:\\Users\\aishwaryaa\\Documents\\1.txt");
		//System.out.println("file is uploaded successfully");
		WebElement uploadele = driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));
		uploadele.click();
		Thread.sleep(2000);
		
		Robot r=new Robot();
		
		StringSelection str=new StringSelection("C:\\Users\\aishwaryaa\\Pictures\\pic1\\pic1.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		 r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_V);
	     
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     System.out.println(" ***** ");
	     System.out.println("File uploaded successgully");
		 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(.,'Dashboard')]")).click();
		driver.quit();






	}
}
