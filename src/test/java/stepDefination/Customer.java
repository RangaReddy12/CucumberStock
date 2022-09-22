package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.When;

public class Customer {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	    driver =FunctionLibrary.startBrowser();
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	    FunctionLibrary.openApplication(driver);
	}

	@When("^Wait For Username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Username_with_and(String LocatorName, String Locatorvalue) throws Throwable {
	    FunctionLibrary.waitForElement(driver, LocatorName, Locatorvalue, "10");
	}

	@When("^Enter Username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Username_with_and(String LocatorName, String Locatorvalue) throws Throwable {
	    FunctionLibrary.typeAction(driver, LocatorName, Locatorvalue, "admin");
	}
}
