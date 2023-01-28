package pagePackage;

import org.openqa.selenium.chrome.ChromeDriver;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class HomePage {
		@FindBy(xpath = "//a[.='Logout']")private WebElement logOut;
		@FindBy(id = "SubmitTTButton")private WebElement saveLeaveTimeButton;
		@FindBy(xpath = "//div[.='Users']")private WebElement users;
		@FindBy(name = "usersSelector.selectedUser")private WebElement enterTimeTrack;
		@FindBy(xpath = "//a[.='Insert existing tasks']")private WebElement insertExistingTask;
		@FindBy(xpath = "//a[.='Create new tasks']")private WebElement createNewTask;

		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// utilization
		public void HomePagelogOut() {
			logOut.click();
		}

		public WebElement getLogOut() {
			return logOut;
		}

		public WebElement getSaveLeaveTimeButton() {
			return saveLeaveTimeButton;
		}

		public WebElement getUsers() {
			return users;
		}

		public WebElement getEnterTimeTrack() {
			return enterTimeTrack;
		}

		public WebElement getInsertExistingTask() {
			return insertExistingTask;
		}

		public WebElement getCreateNewTask() {
			return createNewTask;
		}
		public void logOut() {
			logOut.click();
		}

		public void ClickonUsers() {
			users.click();
		}

		public void clickOnSaveLeaveTime()
		{
			saveLeaveTimeButton.click();
		}
		
		public void selectUser(int index)
		{
			Select sel = new Select(enterTimeTrack);
			
			sel.selectByIndex(index);
		}
	}







