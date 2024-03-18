package basic_Jenkins1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtils.ExcelUtils;
import commonUtils.JavaUtils;
import commonUtils.PropertyFileUtils;
import commonUtils.WebDriverUtils;

public class ContactsTest {

	JavaUtils jUtil = new JavaUtils();
	PropertyFileUtils pUtil = new PropertyFileUtils();
	WebDriverUtils webDriverUtils = new WebDriverUtils();
	ExcelUtils excelUtils = new ExcelUtils();

	@Test
	public void createContactsTest() throws IOException {
		WebDriver driver = new ChromeDriver();
		webDriverUtils.maximize(driver);

		webDriverUtils.impliciteWaits(driver);

		// fetching data from property file to launch url
		driver.get(pUtil.getDataFrmPropertyFile1("url"));

		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl = "http://localhost:8888/index.php?action=Login&module=Users";

		Assert.assertEquals(actualUrl, expectedUrl);
		;

		// fetching data from property file to launch username
		String userName = pUtil.getDataFrmPropertyFile1("username");

		// fetching data from property file to launch password
		String pass = pUtil.getDataFrmPropertyFile1("password");

		// find element called username
		driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(userName);

		// find element called password
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys(pass);

		// to click on submit button
		driver.findElement(By.id("submitButton")).submit();

		driver.findElement(By.linkText("Contacts")).click();

	}
}
