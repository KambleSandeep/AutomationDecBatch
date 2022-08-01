package com.test.sign.up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")private WebElement username;
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement gender;
	
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;
	
	
	//intiolization
	
	SignUpPOM(WebDriver dri){
		driver=dri;
		PageFactory.initElements(dri, this);
	}

	
public void enterFirstName(String name ) {
	username.sendKeys(name);
}
public void enterlastname(String name1)	{
	lastname.sendKeys(name1);
}
public void enterEmailId(String email1) {
	email.sendKeys(email1);
	
}
public void selectGender() {
	gender.click();
}
	public void selectmonth(String value) {
		Select s1 = new Select(month);
		s1.selectByVisibleText(value);
		
	}
	public void mouseAction() {
		Actions act = new Actions(driver);
	}
	
	
}
