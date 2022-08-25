package baseclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.xml.sax.Locator;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testNg.chromeDriver;

public class Testing  {
	RemoteWebDriver driver;
	@org.testng.annotations.Parameters({"username","password","browser"})
	@Test
	public  void windowsHandling(String username, String pass, String browser) {

		switch (browser) {
		case "chrome":
			driver= new ChromeDriver();
			break; 
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}
}