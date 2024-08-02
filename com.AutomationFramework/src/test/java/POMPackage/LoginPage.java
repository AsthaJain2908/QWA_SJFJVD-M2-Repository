package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { // POM Class
	
	// Constructor
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);	
	}

	// First Create Private Variables than call constructor
	@FindBy(name = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement loggedInCheckBox;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	
	// Getter Methods
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoggedInCheckBox() {
		return loggedInCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	// Method to insert input and perform click option with valid credentials
	public void loginIntoActiTime(String username, String password)
	{
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loggedInCheckBox.click();
		loginButton.click();
	}
	
	// Method to insert input and perform click option with invalid credentials
	public void invalidLoginIntoActiTime(String username, String password)
	{
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
		usernameTextfield.clear();
	}
}
