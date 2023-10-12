package ORANGEHRM;

import java.awt.AWTException;
import org.testng.annotations.Test;

import QAPages.AdminPage;
import QAPages.LoginPage;
import TestComponents.BaseTest;

public class AdminmoduleTestCase  extends BaseTest
{
	@Test()
	public void enttoendtesting() throws  AWTException
	{
		String Username="Admin";
		String Password="admin123";
		String UserPassword="zefc@321";
		String Empname="Sara Johnson";
		String Usersname="harrypotter@321.com";
		String Conirmpwd="zefc@321";
		
		LoginPage lp=new LoginPage(driver);
		lp.gotoUrl();
		lp.loginApplication(Username,Password );
		
		AdminPage adminpage=new AdminPage(driver);
		adminpage.ClickOnAdmin();
		adminpage.ClickOnAddUsrbtn();
		adminpage.ChooseUserRole();
		adminpage.SelectingRole();
		adminpage.ChooseStatus();
		adminpage.Selectstatus();
		adminpage.EnterPassword(UserPassword);
		adminpage.EnterEmployeename(Empname);
		adminpage.EnterUsername(Usersname);
		adminpage.Confirmpassword(Conirmpwd);
		adminpage.ClickOnSavebtn();
		
		}
}



