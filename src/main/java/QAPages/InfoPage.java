package QAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComponentsPage.AbstractComponent;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class InfoPage extends AbstractComponent
{
	 WebDriver driver;
	    public EmployeesPage emppage;
	    public LoginPage lp;
		public InfoPage(WebDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath = "//span[contains(.,'My Info')]")
		WebElement infobtn;
		
		@FindBy(xpath = "//img[contains(@class,'employee-image')]")
		WebElement profileimg;
		
		@FindBy(xpath = "//i[@class='oxd-icon bi-plus']")
		WebElement imgselecticon;
		
		@FindBy(xpath = "//button[contains(.,'Save')]")
		WebElement savebtn;
		
		public void ClickOnInfobtn()
		{
			infobtn.click();
		}
		public void ChangeProfile()
		{
			profileimg.click();
		}
		public void ClickOnSelecticon()
		{
			imgselecticon.click();
		}
		public void ClickOnSavebtn()
		{
			savebtn.click();
		}
			

}
