package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends swagLabPgeElement implements ITestListener{
   public void onTestSuccess(ITestResult result) {
	   System.out.println("result is successful"+ result.getName());
   }
   public void onTestFailure(ITestResult result,WebDriver driver) {
	   try {
		screenshot.takescreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void onTestSkipped(ITestResult result) {
	   System.out.println("test is skipped "+ result.getName());
   }
   public void onTestStrart(ITestResult result) {
	   System.out.println("test is start"+result.getName());
   }
}
