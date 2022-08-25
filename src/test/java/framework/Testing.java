package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		List<WebElement> framecount = driver.findElements(By.tagName("frames"));
		int size = framecount.size();
		System.out.println(size);
		WebElement frame = driver.findElement(By.xpath("//frame[@name= 'login_page']"));
		driver.switchTo().frame(frame);
		WebElement findElement = driver.findElement(By.name("fldLoginUserId"));
		findElement.sendKeys("gilliganesh", Keys.ENTER);

	}

}

