package QAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComponentsPage.AbstractComponent;

public class AdminPage extends AbstractComponent
{
	 WebDriver driver;
	    public EmployeesPage emppage;
	    public LoginPage lp;
		public AdminPage(WebDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath = "(//span[contains(.,'Admin')])[1]")
		WebElement Adminbtn;
		
		@FindBy(xpath = "//button[contains(.,'Add')]")
		WebElement AddUserbtn;
		
		@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
		WebElement ChooseARolebtn;
		
		@FindBy(xpath = "//span[text()='ESS']")
		WebElement selectrole;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
		WebElement ChooseAStatusbtn;
		
		@FindBy(xpath = "//span[text()='Enabled']")
		WebElement selectstatus;
		
		@FindBy(xpath = "(//input[@type='password'])[1]")
		WebElement passwordbtn;
		
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		WebElement Empnamefield;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
		WebElement Usernamefield;
		
		@FindBy(xpath = " //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
		WebElement confirmpwd;
		
		@FindBy(xpath = "//button[text()=' Save ']")
		WebElement savebtn;
		
		public void ClickOnAdmin()
		{
			Adminbtn.click();
		}
		public void ClickOnAddUsrbtn()
		{
			AddUserbtn.click();
		}
		public void ChooseUserRole()
		{
			ChooseARolebtn.click();
		}
		public void SelectingRole()
		{
			selectrole.click();
		}
		public void  ChooseStatus()
		{
			ChooseAStatusbtn.click();
		}
		public void Selectstatus()
		{
			selectstatus.click();
		}
		public void EnterPassword(String pwd)
		{
			passwordbtn.sendKeys(pwd);
		}
		public void EnterEmployeename(String empname)
		{
			Empnamefield.sendKeys(empname);
		}
		public void EnterUsername(String uname)
		{
			Usernamefield.sendKeys(uname);
		}
		public void Confirmpassword(String cnfpwd)
		{
			confirmpwd.sendKeys(cnfpwd);
		}
		public void ClickOnSavebtn()
		{
			savebtn.click();
		}

}
