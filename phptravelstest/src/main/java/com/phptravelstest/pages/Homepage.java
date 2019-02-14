package com.phptravelstest.pages;

//import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.phptravelstest.base.Basetest;

public class Homepage extends Basetest
{
    
    @FindBy(id="li_myaccount")
    List<WebElement> myaccount;
    
    @FindBy(xpath="//a[@href='http://localhost/phptravels/register']")
    List<WebElement> signup;
    
    @FindBy(xpath="//a[@class='loader' and @href='http://localhost/phptravels/tours/']")
    WebElement hotels;
    
    @FindBy(xpath="//a[@a='http://localhost/phptravels/' and @class='navbar-brand go-right loader']")
    WebElement img;
    
    
    
    
    public Homepage() throws IOException
    {
	PageFactory.initElements(driver, this);
    }
    
    public Signuppage myaccount() throws IOException
    {
	List<WebElement> Myacct =myaccount;
	Myacct.get(1).click();
        
        List<WebElement> sngup =signup;
        sngup.get(1).click();
        
        return new Signuppage();
    }
    
    public void title()
    {
	String HomepageTitle=driver.getTitle();
    }
    
    
    
    
    
    
   
   
   
   	
 

}
