package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sauceloginobjects {

	@FindBy(xpath="//input[@id='user-name']")
	public WebElement username;
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement loginbutton;
	@FindBy(xpath="//*[@data-test='error']")
	public WebElement errorMessage;
	
}
