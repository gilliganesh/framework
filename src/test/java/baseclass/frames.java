package baseclass;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class frames extends baseclasstest {
	@Test
	private void tc01() {
		getDriver();
		launchurl("https://netbanking.hdfcbank.com/netbanking/");
		frames(0);
		locators("name", "fldLoginUserId").sendKeys("ganesh1609",Keys.ENTER);

	}







}
