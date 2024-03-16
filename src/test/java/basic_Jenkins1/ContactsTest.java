package basic_Jenkins1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {

	@Test
	public void createContactsTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ajio.com/");
	}
}
