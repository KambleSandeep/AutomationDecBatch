package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//Declaration
	
	@FindBy(xpath="//input[@name='email']")private WebElement utd;
	
	@FindBy(xpath="//input[@id='pass']")private WebElement pwd;
	
	@FindBy(xpath="//button[@name='login']")private WebElement btn;
	
	//intilazation
	
	Loginpage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	
	}
	//usage
	public void SetUserid(String userid) {
		utd.sendKeys(userid);
	}
	
public void SetPassword(String pass) {
	pwd.sendKeys(pass);
}
public void clickloginbtn() {
	btn.click();

	
}}

