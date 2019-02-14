package com.phptravelstest.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelstest.base.Basetest;

public class MyAccount extends Basetest
{
    

    @FindBy(xpath="//h3[@class='RTL']")
    WebElement getusername;
    
    @FindBy(xpath="//img[@class='logo']")
    WebElement myaccountpagelogo;
    
   /* @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/flight/')]")
    WebElement FlightLinkRedirection;*/
    
    @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/hotels/')]")
    WebElement HotelsLinkRedirection;
    
    @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/tours/')]")
    WebElement ToursLinkRedirection;
    
    @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/car/')]")
    WebElement CarLinkRedirection;
    
    @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/visa/')]")
    WebElement VisaLinkRedirection;
    
    @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/offers/')]")
    WebElement OffersLinkRedirection;
    
    @FindBy(xpath="//a[contains(@href,'http://localhost/phptravels/blog/')]")
    WebElement BlogLinkRedirection;
    
    public MyAccount() throws IOException 
    {
	PageFactory.initElements(driver, this);
    }
    
    public String validatemyaccounttitle()
    {
	return driver.getTitle();
    }
    
    public boolean myaccountpagelogo()
    {
	return myaccountpagelogo.isDisplayed();
    }
    
    public Hotelspage  validateHotelsLinkRedirection() throws IOException
    {
	HotelsLinkRedirection.click();
	return new Hotelspage();
    }
    
    public Tourspage  validateToursLinkRedirection()
    {
	ToursLinkRedirection.click();
	return new Tourspage();
    }
    
    public Carspage  validateCarsLinkRedirection()
    {
	CarLinkRedirection.click();
	return new Carspage();
    }
    
    public Visapage  validateVisaLinkRedirection()
    {
	VisaLinkRedirection.click();
	return new Visapage();
    }
    
    public Offerspage  validateOffersLinkRedirection()
    {
	OffersLinkRedirection.click();
	return new Offerspage();
    }
    
   
    
 
    
    
}
