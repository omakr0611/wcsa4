package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeTestValidLogin extends BaseTest {
	@Test
	public void validtest() throws InterruptedException, IOException {
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.ActiTimeValidLoginPage(flib.readPropertyData(PROP_PATH, "Username"),
				flib.readPropertyData(PROP_PATH, "Password"));

	}
}
