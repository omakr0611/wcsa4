package pagePackage;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		
		// To avoid staleElementException
		
		@FindBy(name="username")private WebElement usernameTB;
		@FindBy(name="pwd")private WebElement passwordTB;
		@FindBy(id="loginButton")private WebElement loginButton;
		@FindBy(id="keepLoggedInCheckBox")private WebElement checkBox;
		@FindBy(xpath="//a[.='Actimind Inc.']")private WebElement actiMindLink;
		@FindBy(id="licenseLink")private WebElement licenseLink;
		
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// For Utilization
		public WebElement getUsernameTB() {
			return usernameTB;
		}
		public WebElement getPasswordTB() {
			return passwordTB;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		public WebElement getCheckBox() {
			return checkBox;
		}
		public WebElement getActiMindLink() {
			return actiMindLink;
		}
		public WebElement getLicenseLink() {
			return licenseLink;
		}
		
		// operation
		
		public void ActiTimeValidLoginPage(String ValidUsername, String ValidPassword) throws InterruptedException
		{
			usernameTB.sendKeys(ValidUsername);
			Thread.sleep(2000);
			passwordTB.sendKeys(ValidPassword);
			Thread.sleep(2000);
			loginButton.click();
		}
		public void ActiTimeInValidLoginPage(String InValidUsername,String InValidPassword) throws InterruptedException
		
			{
				usernameTB.sendKeys(InValidUsername);
				Thread.sleep(2000);
				passwordTB.sendKeys(InValidPassword);
				Thread.sleep(2000);
				loginButton.click();
		}
		
		
		
		
		

	}



