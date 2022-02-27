@FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
	
	
	//Initilization
	
	SignUpPOM(WebDriver dri)
	{
		PageFactory.initElements(dri, this);
	}
	
	
	//Usage
	
	public void enterFirstName(String name) {
		userName.sendKeys(name);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enterEmail(String email1) {
		email.sendKeys(email1);
	}
	
	public void selectGender() {
		gender.click();
	}
	
	public void selectMonth(String value) {
		Select s1 = new Select(month);
		s1.selectByVisibleText(value);
		
	}
	



}
