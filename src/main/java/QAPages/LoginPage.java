package QAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ComponentsPage.AbstractComponent;

public class LoginPage extends AbstractComponent
{
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void gotoUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@FindBy(name = "username")
	WebElement UserNameEdt;
	
	@FindBy(name = "password")
	WebElement PassWordEdt;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement errormsg;
	
	public EmployeesPage loginApplication(String Username,String Password)
	{
		UserNameEdt.sendKeys(Username);
		PassWordEdt.sendKeys(Password);
		LoginBtn.click();
		
		EmployeesPage emppage = new EmployeesPage(driver);
		return emppage;
		
	}
	public String getErrormsg()
	{
		return errormsg.getText();
	}
	
	}
