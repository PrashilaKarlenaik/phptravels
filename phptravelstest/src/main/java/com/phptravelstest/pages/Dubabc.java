package com.phptravelstest.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelstest.base.Basetest;

public interface Dubabc
{
    public class Hotelspage extends Basetest
    {
   @FindBy(css="h4.RTL.go-text-right.mt0.list_title")
   WebElement hotel;				//---Declare webElements as private bcoz,the internal varibales are hide(Encapsulation)
   
   @FindBy(css="h4.RTL.go-text-right.mt0.list_title")
   List<WebElement> Links;
   
   @FindBy(xpath="//a[@class='loader' and @href='http://localhost/phptravels/hotels/']")
   WebElement hotels;
   
   @FindBy(xpath="//div[@class='col-md-4 col-xs-6 col-sm-4 go-left']//following::button[1]")
   WebElement rendezvousHotelDetailButton;
   
   @FindBy(xpath="//div[@class='wishlist wishlistcheck hotelswishtext40']")
   WebElement wishlist;
  
   @FindBy(xpath="//li[@class='active']//following::a[1]")
  WebElement nextpage;
   
   @FindBy(id="searchform")
  WebElement searchButton;
   
   @FindBy(xpath="//h1[@class='text-center']")
   WebElement noResults;
   
   @FindBy(xpath="//a[@class='btn btn-success btn-xs btn-block']")
  WebElement modifyButton;
   
   @FindBy(xpath="//a[@class='select2-choice select2-default']")
   WebElement locationField;
   
   @FindBy(xpath="//span[@class='select2-match']")
   WebElement locationSearchResult;
   
   @FindBy(xpath="//a[@class='select2-choice']")
   WebElement selectedLocation;
   
   @FindBy(xpath="//input[@placeholder='Check in']")
   WebElement checkIN;
   
   @FindBy(xpath="//div[@class='datepicker dropdown-menu'][1]")
 WebElement checkInDatepicker;
   
   @FindBy(xpath="//div[@class='datepicker dropdown-menu'][2]")
   WebElement checkOutDatepicker;
   
   @FindBy(xpath="//input[@placeholder='Check out']")
   WebElement checkOut;
   
   @FindBy(xpath="//div[@class='datepicker dropdown-menu']//following::tr[3]")
   WebElement Date;
   
   @FindBy(xpath="//select[@id='adults']")
   WebElement adultsField;
   
   @FindBy(xpath="//select[@id='adults']//following::option[1]")
 WebElement adultsFielddropdownvalue;
   
   
   @FindBy(xpath="//select[@id='adults']//following::option[1]")
   WebElement adultselectvalue;
   
   @FindBy(xpath="//select[@id='child']")
   WebElement childField;
   
   @FindBy(xpath="//select[@id='child']//following::option[1]")
  WebElement childFieldvalue;

   @FindBy(name="roomscount")
   WebElement roomscount;
   //--Star Grade
   
   @FindBy(xpath="//input[@id='1' and @name='stars']/following::ins[1]")
   WebElement star1;
   
   @FindBy(xpath="//input[@id='2' and @name='stars']/following::ins[1]")
  WebElement star2;
   
   @FindBy(xpath="//input[@id='3' and @name='stars']/following::ins[1]")
  WebElement star3;
   
   @FindBy(xpath="//input[@id='4' and @name='stars']/following::ins[1]")
   WebElement star4;
   
   @FindBy(xpath="//input[@id='5' and @name='stars']/following::ins[1]")
   WebElement star5;
   
   //--Property Types
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Apartment']/following::ins[1]")
 WebElement Apartment;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Hotel']/following::ins[1]")
    WebElement Hotel;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Guest House']/following::ins[1]")
   WebElement guestHouse;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Motel']/following::ins[1]")
  WebElement Motel;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Residence']/following::ins[1]")
    WebElement Residence;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Resort']/following::ins[1]")
  WebElement Resort;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Time Share']/following::ins[1]")
 WebElement TimeShare;
   
   @FindBy(xpath="//input[@type='checkbox' and @id='Extended Stay']/following::ins[1]")
    WebElement ExtendedStay;
  
   @FindBy(xpath="//input[@type='checkbox' and @id='Villa']/following::ins[1]")
   WebElement Villa;
   
 //--Hotel List
   
   @FindBy(linkText="Rendezvous Hotels")
    WebElement rendezvousHotel;
   
   @FindBy(linkText="Rose Rayhaan Rotana")
    WebElement roserayhaanrotanaHotel;
   
   @FindBy(linkText="Madinah Moevenpick Hotel")
    WebElement madinahMoevenpi;
   
   @FindBy(linkText="Hyatt Regency Perth")
   WebElement HyattRegencyPerth;
   
   @FindBy(linkText="Malmaison Manchester")
   WebElement MalmaisonManchester;
   
   @FindBy(linkText="Swissotel Le Plaza Basel")
   WebElement SwissotelLePlazaBasel ;
   
   @FindBy(linkText="Oasis Beach Tower")
 WebElement OasisBeachTower;
   
   @FindBy(linkText="Grand Plaza Apartments")
   WebElement GrandPlazaApartments;
   
   @FindBy(linkText="Alzer Hotel Istanbul")
   WebElement AlzerHotelIstanbul;
   
   @FindBy(linkText="Islamabad Marriott Hotel")
   WebElement IslamabadMarriottHotel;
   
   @FindBy(linkText="Jumeirah Beach Hotel")
   WebElement JumeirahBeachHotel;
   
   @FindBy(linkText="Tria Hotel Istanbul…")
   WebElement TriaHotelIstanbul;
   
   //--Share
   
   @FindBy(xpath="//div[@data-network='sharethis']")
   WebElement sharethis;
   
   @FindBy(xpath="//div[@class='st-logo']")
   WebElement sharethisLogo;
   
   @FindBy(xpath="//div[@data-network='twitter']")
   WebElement twitter;
   
   
   
   public Hotelspage () throws IOException
   {
	
	PageFactory.initElements(driver, this);
   }
   
   public String validatepagetitle()
   {
       return driver.getTitle();
   }
   
   public void hotelsListings()
   {
	//--Storing all elements in Links variableand iterate them
	List<WebElement> Links=driver.findElements(By.cssSelector("h4.RTL.go-text-right.mt0.list_title"));
	ArrayList<String> abc=new ArrayList<String>();
	for(int i=0;i<Links.size();i++)
	{
	//--Scroll the page till the mentioned pixel
	    
	  scroll(0,600) ;
	
       abc.add(Links.get(i).getText());
       System.out.println(Links.get(i).getText());
	}
   }
   
    }

}
