package com.phptravelstest.pages;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelstest.base.Basetest;

public class Signuppage extends Basetest
{
    @FindBy(name="firstname")
    WebElement firstname;
    
    
    @FindBy(xpath="//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
    WebElement submitbutton;
    
    @FindBy(xpath="//div[@class='alert alert-danger']")
    WebElement errormsg;
    
    @FindBy(name="lastname")
    WebElement lastname;
    /*@FindBy(xpath="//input[@class='form-control' and @name='lastname']")
    WebElement lastname;*/
    
    @FindBy(name="phone")
    WebElement phone;
    
    @FindBy(name="email")
    WebElement email;
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(name="confirmpassword")
    WebElement confirmpassword;
    
    
public Signuppage () throws IOException
{
	PageFactory.initElements(driver, this);
}

public String validatepagetitle()
{
    return driver.getTitle();
}

public String  validateerrormsg()
{
   submitbutton.click();
   return errormsg.getText();
}


public void validatefirstnamefield()
{
    //--this will clear the value.
    firstname.clear();
    firstname.click();
    firstname.isEnabled();
    firstname.sendKeys("Prashila");
}


public void validatelastnamefield()
{
    lastname.clear();
    lastname.click();
    lastname.isEnabled();
    lastname.sendKeys("Karlenaik");
}



public void validateMobileNofield()
{
    phone.clear();
    phone.click();
    phone.isEnabled();
    phone.sendKeys("9821262059");
}



public void validatEamilidfield()
{
    email.clear();
    email.click();
    email.isEnabled();
    email.sendKeys("abc.pqr@gmail.com");
}



public void validatpasswordfield()
{
    password.clear();
    password.click();
    password.isEnabled();
    password.sendKeys("qwerty_123");
}



public void validateconfirmpasswordfield()
{
    confirmpassword.clear();
    confirmpassword.click();
    confirmpassword.isEnabled();
    confirmpassword.sendKeys("qwerty_123");
}

/*public void validateuserlogin()
{
    firstname.click();
    firstname.sendKeys("Prashila");
    lastname.click();
    lastname.sendKeys("Karlenaik");
    phone.click();
    phone.sendKeys("9821262059");
    email.click();
    email.sendKeys("abc.pqr@gmail.com");
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,600)");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    password.click();
    password.sendKeys("qwerty_123");
    confirmpassword.click();
    confirmpassword.sendKeys("qwerty_123");
    submitbutton.click();
    return new 
	
    
}*/















}