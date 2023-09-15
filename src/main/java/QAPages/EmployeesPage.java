package QAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComponentsPage.AbstractComponent;

public class EmployeesPage  extends AbstractComponent
{
	
    WebDriver driver;
    public EmployeesPage emppage;
    public LoginPage lp;
	public EmployeesPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(.,'PIM')]")
	WebElement Pipbtn;
	
	@FindBy(xpath="//a[contains(.,'Add Employee')]")
	WebElement AddEmpbtn;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement FirstNameedt;
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement MiddleNameedt;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastNameedt;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	WebElement Empidedt;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")
	WebElement Uploadbtnedt;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savebtn;
	
	@FindBy(xpath = "//span[contains(.,'Dashboard')]")
	WebElement Dashboardbtn;
	
	public void ClickOnPipbtn()
	{
		Pipbtn.click();
	}
	public void ClickOnAddEmpbtn()
	{
		AddEmpbtn.click();
	}
	
	public void EnterEmployeeDetails(String fname, String mname, String lname, String eid)
	{
		FirstNameedt.sendKeys(fname);
		MiddleNameedt.sendKeys(mname);
		LastNameedt.sendKeys(lname);
		Empidedt.sendKeys(eid);
		
	}
	public void ClickOnUploadbtn()
	{
		Uploadbtnedt.click();
	}
	public void ClickOnSavebtn()
	{
		savebtn.click();
	}
	public void ClickOnDashboardPage()
	{
		Dashboardbtn.click();
	}
	
	
	

}
