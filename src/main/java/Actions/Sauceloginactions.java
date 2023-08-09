package Actions;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.support.PageFactory;

import Objects.Sauceloginobjects;

public class Sauceloginactions {
	
	Sauceloginobjects sauceOb;
	public Sauceloginactions(WebDriver driver) {
		sauceOb = PageFactory.initElements(driver, Sauceloginobjects.class);
	}
	public void enterUsername(String s) {
		sauceOb.username.sendKeys(s);
	}
	public void enterpassword(String s) {
		sauceOb.password.sendKeys(s);
	}
	public void clickLoginBtn() {
		sauceOb.loginbutton.click();
	}

	
}
