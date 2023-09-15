package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import QAPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	
	public WebDriver initializedriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("remote--allow--origin");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\aishwaryaa\\eclipse-workspace\\OrangeHrm\\src\\main\\java\\Resources\\GlobalData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String Browsername = prop.getProperty("browser");
		String Username = prop.getProperty("username");
		String Password = prop.getProperty("password");
		String Firstname = prop.getProperty("firstname");
		String Middlename = prop.getProperty("middlename");
		String Lastname = prop.getProperty("lastname");
		
		if(Browsername.equalsIgnoreCase("chrome"))
		{
		
           driver=new ChromeDriver(Option);
       
		}
		
		  else if(Browsername.equalsIgnoreCase("firefox"))
		  {
			  driver=new FirefoxDriver();
			  }
		  else if(Browsername.equalsIgnoreCase("edge"))
		  {
			  driver=new EdgeDriver(); }
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     return driver;
	}
	
	 public String getScreenshot(String testcaseName,WebDriver driver) throws IOException
	 {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File file=new File(System.getProperty("user.dire")+ "\\reports\\"+testcaseName+".png");
		 FileUtils.copyFile(source, file);
		 return System.getProperty("user.dire")+ "\\reports\\"+testcaseName+".png";
	 }
	
	
	
		
	@BeforeMethod(alwaysRun = true)
	public LoginPage launchApplication() throws IOException
	{
	driver=initializedriver();
	new LoginPage(driver);
	return lp ;
	}
	
	
	@AfterMethod(alwaysRun = true)
	public  void closeBrowser()
	{
		driver.quit();
	}
	
	

}
