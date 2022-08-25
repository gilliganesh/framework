package baseclass;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclasstest {
	public static WebDriver driver;
	public static  WebElement findElement;
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));


	}
	public static WebElement locators(String attributeName, String attributeValue) {
		if (attributeName.equals("id")) {
			WebElement findElement2 = driver.findElement(By.id(attributeValue));
			return findElement2;

		} else if (attributeName.equals("name")) {
			WebElement findElement2 = driver.findElement(By.name(attributeValue));
			return findElement2;
		}else if (attributeName.equals("xpath")) {
			WebElement findElement2 = driver.findElement(By.xpath(attributeValue));
			return  findElement2;
		}{

		}
		return findElement;
	}
	public static void launchurl(String url) {
		driver.get(url);
	}
	public static WebElement idValue(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public static WebElement nameValue(String name) {
		WebElement textuser = driver.findElement(By.name(name));
		return textuser;
	}
	public static WebElement xpathValue(String xpath) {
		WebElement textpass = driver.findElement(By.xpath(xpath));
		return textpass;

	}
	public static void sendText(WebElement findElement, String value) {
		findElement.sendKeys(value);
	}
	public static void clickButton(WebElement findElement) {
		findElement.click();
	}
	public static WebDriver frames(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}
	public static String parentWindow() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}
	public static WebDriver childWindow(int index) {
		Set<String> allwindow = driver.getWindowHandles();
		List<String> list = new LinkedList<String>();
		list.addAll(allwindow);
		String newwindow = list.get(index);
		WebDriver window = driver.switchTo().window(newwindow);
		return window;
	}
	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void selectIndex(WebElement findElement, int index) {
		Select s = new Select(findElement);
		s.selectByIndex(index);
	}

	public static File screenShot() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots");
	
		return f;
	}
}















