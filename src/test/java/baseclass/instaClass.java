package baseclass;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class instaClass extends baseclasstest {
	public static void main(String[] args) {
		getDriver();
		launchurl("https://adactinhotelapp.com/Register.php");
		pom p = new pom();
		WebElement username = p.getUsername();
		sendText(username, "Ganesh");
		p.getPassword().sendKeys("raina@123");
		p.getRepassword().sendKeys("raina@123");
		p.getEmailaddress().sendKeys("ganesh@123.com");
		p.getFullname().sendKeys("muthu ganesh");
		
		
	}
	
	
	
	
	
	
}
