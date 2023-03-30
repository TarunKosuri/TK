package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.reg;

public class stepss 
{
	public WebDriver driver;
	public reg lp;
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    lp=new reg(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	   driver.get(url);
	}

	@When("Click on register")
	public void click_on_register() {
	    lp.clickRegister();
	}

	@When("User enters contact information")
	public void user_enters_contact_information() {
	    lp.setFirstname("Tarun");
	    lp.setLastName("k");
	    lp.phone("7330749009");
	    lp.setemail("tk@gmail.com");
	}

	@When("User enters mailing information")
	public void user_enters_mailing_information() {
		lp.setAddress("madhapur");
		lp.setstate("Telangana");
		lp.setpostalcode("500004");
		lp.setcity("Hyderabad");
	}

	@When("User enters user information")
	public void user_enters_user_information() {
	   lp.password("@123");
	   lp.setpass("@123");
	   lp.setusername("tk");
	}

	@When("User clicks on submit")
	public void user_clicks_on_submit() {
	   lp.clicksubmit();
	}

}
