package baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom extends baseclasstest {

	@FindBy(id="username")
	public WebElement username;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="re_password")
	public WebElement repassword;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRepassword() {
		return repassword;
	}
	public WebElement getFullname() {
		return fullname;
	}
	public WebElement getEmailaddress() {
		return emailaddress;
	}
	@FindBy(id="full_name")
	public WebElement fullname;
	@FindBy(id="email_add")
	public WebElement emailaddress;
	
	public pom() {
		PageFactory.initElements(driver, this);
	}
	
	
}


