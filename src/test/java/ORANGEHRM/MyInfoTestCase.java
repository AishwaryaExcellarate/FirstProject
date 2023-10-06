package ORANGEHRM;

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

import QAPages.EmployeesPage;
import QAPages.InfoPage;
import QAPages.LoginPage;
import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyInfoTestCase extends BaseTest
{
	@Test()
	public void enttoendtesting() throws InterruptedException, AWTException
	{
		String Username="Admin";
		String Password="admin123";
		LoginPage lp=new LoginPage(driver);
		lp.gotoUrl();
		lp.loginApplication(Username, Password);
		InfoPage ipage=new InfoPage(driver);
		ipage.ClickOnInfobtn();
		ipage.ChangeProfile();
		ipage.ClickOnSelecticon();
		System.out.println("File uploaded successfull");
         
   }
       }

