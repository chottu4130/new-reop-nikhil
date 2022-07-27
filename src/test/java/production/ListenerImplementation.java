package production;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	WebDriver lDriver;
	public void onTestFailure(ITestResult result) {
		lDriver = ContactModuleTest.driver;
		TakesScreenshot t = (TakesScreenshot)lDriver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/ss.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
