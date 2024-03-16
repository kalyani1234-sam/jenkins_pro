package basic_Jenkins1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganisationsTest {

	@Test
	public void createOrganisationsTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	}
}
