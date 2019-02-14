package com.phptravelstest.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.phptravelstest.base.*;

public class Loginpage extends Basetest 
{
    
    MyAccount myacct;
    //create pagefactory to store webelement of page
    @FindBy(name="username")//it will search webelement on a page matching with provide attribute
    WebElement usernameField;
    
    
    @FindBy(name="password")
    WebElement passwordField;
    
    @FindBy(id="remember-me")
    WebElement remember_me_checkbox;
    
    @FindBy(xpath="//button[contains(@class,'btn btn-action btn-lg btn-block loginbtn')]")
    WebElement loginbt;
    
    @FindBy(xpath="//a[contains(@class,'btn btn-default btn-block form-group')]")
    public WebElement signup;
    
    @FindBy(xpath="//a[@class='btn btn-default btn-block']")
    WebElement forgetpassword;
    
    @FindBy(xpath="//h4[@class='modal-title']")
    WebElement forgetpwpopup;
    
    @FindBy(id="resetemail")
    WebElement forgetpwdtextbox;
    
    @FindBy(xpath="//button[@class='btn btn-primary resetbtn']")
    WebElement ressetbutton;
    
    
    @FindBy(xpath="//img[contains(@class,'logo')]")
    WebElement logo;
    
    

    
   
    
    public Loginpage () throws IOException//ani ekde ala,initelement initialize krnar haa 
    {
	PageFactory.initElements(driver, this);
    }
    
    
    public String validatePagetitle()
    {	
	//--Return title of current page
	return driver.getTitle();
    }
    
    public boolean validatePagelogo()
    {	
	//--check if element is displayed or not
	return logo.isDisplayed();
    }
    
    public boolean validateUsernamefieldEnabled()
    {
	//--check if the element currently enabled or not
	return usernameField.isEnabled();
    }
    
    public boolean validateifPasswordfieldEnabled()
    {
	return passwordField.isEnabled();
    }
    
    public MyAccount validateUsername(String username,String password ) throws IOException
    {	
	//--Enter specified value in textbox
	usernameField.sendKeys(username);
	passwordField.sendKeys(password);
	remember_me_checkbox.click();
	//--click this element
	loginbt.click();
	return new MyAccount();//this method will return myaccount class
    }
    
    public Signuppage  validateSignupbuttonredirection() throws IOException
    {
	signup.click();
	return new Signuppage();
    }
    
    public String  validateForgetpwdbuttonredirection() throws IOException
    {
	forgetpassword.click();
	forgetpwpopup.isDisplayed();
	return forgetpwpopup.getText();
    }
    
    
    public void forgetpwd() throws IOException
    { 
	validateForgetpwdbuttonredirection();
	forgetpwdtextbox.click();
	driver.switchTo().activeElement();
	forgetpwdtextbox.sendKeys("prashilakarlenaik@gmail.com");
	ressetbutton.click();
    }
    
    
    public void disabledusernamefield()
    {
	//--Disbale field
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("arguments[0].disabled = true", usernameField);
    }
    
    //--click on Login button using Enter
    public void loginUsingEnterKey()
    {
	usernameField.click();
	usernameField.sendKeys("testing@gmail.com");
	passwordField.sendKeys("qwerty_123");
	remember_me_checkbox.click();
	loginbt.sendKeys(Keys.ENTER);
	
     }
    
    
    public void refresh()
    {
	//driver.navigate().refresh();
	//driver.get("http://192.168.1.102/phptravels/login");
	driver.getCurrentUrl();
	driver.n
	
	
	
    }
    
  
    
    
    
    
    
    
    
    
    
}
