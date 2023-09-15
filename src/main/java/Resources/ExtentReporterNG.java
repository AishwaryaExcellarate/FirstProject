package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG 
{
	
	public  static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dire"+"\\reports\\index.html");
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Orange Hrm");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Aishwarya");
		return extent;
	}

}
