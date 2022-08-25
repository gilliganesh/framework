package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Launch {
//	@Parameters({"username","password"})
//	@Test
//	public  void main(String username, String pass) throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(pass);
//		
//		
//		
//	}
	
	@DataProvider(name ="login")
	public Object[][] getData() {
		return new Object[][] {
			{"ganesh@123","pass13"},
			{"vjidsa@13","pass@123"}
		};

	}
	@Test(dataProvider="login")
	public void login(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
}
