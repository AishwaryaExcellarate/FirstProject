package ORANGEHRM;

import org.testng.annotations.Test;

import QAPages.EmployeesPage;
import QAPages.LoginPage;
import TestComponents.BaseTest;

public class OrangeHrmTestCase extends BaseTest
{

	@Test( )
	public void orangehrmtestcase() 
	{
		String Username="Admin";
		String Password="admin123";
		String firstname="Linda";
		String middlename="Lee";
		String lastname = "Ley";
		String empid="213";
		LoginPage lp=new LoginPage(driver);
		lp.gotoUrl();
		lp.loginApplication(Username, Password);
		EmployeesPage emppage=new EmployeesPage(driver);
		emppage.ClickOnPipbtn();
		emppage.ClickOnAddEmpbtn();
		emppage.EnterEmployeeDetails(firstname, middlename, lastname, empid);
		emppage.ClickOnUploadbtn();
		emppage.ClickOnSavebtn();
		System.out.println(" ************ ");
		System.out.println(" ************ ");
		
		System.out.println("File uploaded successgully");
		


     }
}
	
		




















































//driver.findElement(By.xpath("//span[contains(.,'Dashboard')]")).click();


//WebElement uploadele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i"));
//uploadele.sendKeys("C:\\Users\\aishwaryaa\\Desktop\\data.csv.txt");
//WebElement uploadele = driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));
//uploadele.sendKeys("C:\\Users\\aishwaryaa\\Documents\\1.txt");
//System.out.println("file is uploaded successfully");
