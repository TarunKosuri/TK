package page;


	




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver ldriver;
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"form-group--1\"]") 
	WebElement textemail;
	
	@FindBy(id="form-group--3") 
	WebElement textpassword;
	
	@FindBy(xpath="//a/span[contains(text(),'Log in')]")
	WebElement login;
	
	
	public void setusername(String uname)
	{
		textemail.clear();
		textemail.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		textpassword.clear();
		textpassword.sendKeys(pwd);
	}
	public void clicklog()
	{
		login.click();
	}

}	

