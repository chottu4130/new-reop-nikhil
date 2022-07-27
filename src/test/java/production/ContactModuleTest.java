package production;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(production.ListenerImplementation.class)
public class ContactModuleTest {
	
	public static WebDriver driver;
	
@Test
public void createContactTest() {
	ListenerImplementation li = new ListenerImplementation();
	driver = new ChromeDriver();
	Assert.fail();
	System.out.println("createContactTest executed");
	System.out.println("Change done by Deepak");
}
@Test
public void createOrganizationTest() {
	System.out.println("createOrganizationTest executed");
	System.out.println("Change done by Deepak");
}
}
   