package basic_Jenkins1;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.PropertyFileUtils;
import commonUtils.WebDriverUtils;

public class OrganisationsTest {

	@Test
	public void createOrganisationsTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		PropertyFileUtils ps = new PropertyFileUtils();
		WebDriverUtils ws = new WebDriverUtils();
		
		
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ws.maximize(driver);
		
		ws.impliciteWaits(driver);
		
		//fetching data from property file to launch url
		driver.get(ps.getDataFrmPropertyFile1("url"));
		
		//fetching data from property file to launch username
		String userName= ps.getDataFrmPropertyFile1("username");
		
		//fetching data from property file to launch password
		String pass=ps.getDataFrmPropertyFile1("password");
		
		//find element called username
		driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(userName);
		
		//find element called password
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys(pass);
		
		//to click on submit button
		driver.findElement(By.id("submitButton")).submit();
	}
	
}
