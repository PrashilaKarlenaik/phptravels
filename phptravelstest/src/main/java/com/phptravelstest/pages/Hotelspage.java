package com.phptravelstest.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import com.phptravelstest.base.Basetest;
//import com.phptravelstest.utils.alerts;

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
	//Inintialise("hotels/");
	PageFactory.initElements(driver, this);
	System.out.println("driver1"+driver);
	
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
    
    public void starGrade1()
    {
	    JavascriptExecutor vv=(JavascriptExecutor)driver;
	    vv.executeScript("window.scrollBy(0,100)");
	    star1.click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1500)");
	    searchButton.click();
	    String abc=noResults.getText();
	    String PQR="No Results!!";
	    if(abc.equals(PQR))
	    {
		System.out.println("Match found");
	    }
	    
	    else
	    {
		System.out.println("unmatched");
	    }
    }
    
    public void starGrade2()
    {
	JavascriptExecutor vv=(JavascriptExecutor)driver;
	vv.executeScript("window.scrollBy(0,100)");
        star2.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	searchButton.click();
        ArrayList<String> abc=new ArrayList<String>();
	for(int i=0;i<Links.size();i++)
	{
	    JavascriptExecutor ab=(JavascriptExecutor)driver;
	    ab.executeScript("window.scrollBy(0,600)");
	    abc.add(Links.get(i).getText());
	    String p=Links.get(i).getText();
	    System.out.println(p);
	    JavascriptExecutor hh=(JavascriptExecutor)driver;
	    hh.executeScript("window.scrollBy(0,-600)");
	    String value1=rendezvousHotel.getText();
	    String value2=roserayhaanrotanaHotel.getText();
	    String value3=madinahMoevenpi.getText();
            if(p.equals(value1)|| p.equals(value2)|| p.equals(value3))
	    {
		System.out.println("correct");
	    }
	    else
	    {
		System.out.println("incorrect");
	    }
	}
      }
    
    public void starGrade3()
    {
	JavascriptExecutor vv=(JavascriptExecutor)driver;
	vv.executeScript("window.scrollBy(0,100)");
       star3.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	searchButton.click();
	ArrayList<String> abc=new ArrayList<String>();
	for(int i=0;i<Links.size();i++)
	{
	    JavascriptExecutor ab=(JavascriptExecutor)driver;
	    ab.executeScript("window.scrollBy(0,600)");
	    abc.add(Links.get(i).getText());
	    String p=Links.get(i).getText();
	    System.out.println(p);
	    JavascriptExecutor hh=(JavascriptExecutor)driver;
	    hh.executeScript("window.scrollBy(0,-600)");
	    String value1=HyattRegencyPerth.getText();
	    String value2=MalmaisonManchester.getText();
	    if(p.equals(value1)|| p.equals(value2))
	    {
		System.out.println("correct");
	    }
	    else
	    {
		System.out.println("incorrect");
	    }
	}
    }
    
    public void starGrade4()
    {
	JavascriptExecutor vv=(JavascriptExecutor)driver;
	vv.executeScript("window.scrollBy(0,100)");
	star4.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	searchButton.click();
	ArrayList<String> abc=new ArrayList<String>();
	for(int i=0;i<Links.size();i++)
	{
	    JavascriptExecutor ab=(JavascriptExecutor)driver;
	    ab.executeScript("window.scrollBy(0,600)");
	    abc.add(Links.get(i).getText());
	    String p=Links.get(i).getText();
	    System.out.println(p);
	    JavascriptExecutor hh=(JavascriptExecutor)driver;
	    hh.executeScript("window.scrollBy(0,-600)");
	    String value1=SwissotelLePlazaBasel.getText();
	    String value2=OasisBeachTower.getText();
	    String value3=GrandPlazaApartments.getText();
	    String value4=AlzerHotelIstanbul.getText();
	    if(p.equals(value1)|| p.equals(value2) || p.equals(value3)||p.equals(value4))
	    {
		System.out.println("correct");
	    }
	    else
	    {
		System.out.println("incorrect");
	    }
	}
    }
    
    public void starGrade5()
    {
	        JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		star4.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		searchButton.click();
		ArrayList<String> abc=new ArrayList<String>();
		for(int i=0;i<Links.size();i++)
		{
		    JavascriptExecutor ab=(JavascriptExecutor)driver;
		    ab.executeScript("window.scrollBy(0,600)");
		    abc.add(Links.get(i).getText());
		    String p=Links.get(i).getText();
		    System.out.println(p);
		    JavascriptExecutor hh=(JavascriptExecutor)driver;
		    hh.executeScript("window.scrollBy(0,-600)");
		    String value1=IslamabadMarriottHotel.getText();
		    String value2=JumeirahBeachHotel.getText();
		    String value3=TriaHotelIstanbul.getText();
		    if(p.equals(value1)|| p.equals(value2) || p.equals(value3))
		    {
			System.out.println("correct");
		    }
		    else
		    {
			System.out.println("incorrect");
		    }
		}
	
    }
    
    public void starGrade()
    {
	int starGrade;
	starGrade=3;
	switch(starGrade)
	{
	
	case 1:
	{
	    starGrade1();
	}
	
	case 2:
	{
	    starGrade2();
	}
	
	
	case 3:
	{	
	    starGrade3();

	}
		
	case 4:
	{
	    starGrade4();
	}
		
	case 5:
	{
	    starGrade5();
	}
		    
    }
}
       
    public void Apartments()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		Apartment.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=noResults.getText();
		    String PQR="No Results!!";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
		
            
        }
        
    public void hotel() throws InterruptedException
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
        	vv.executeScript("window.scrollBy(0,100)");
        	Hotel.click();
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("window.scrollBy(0,1500)");
        	searchButton.click();
        	
                ArrayList<String> abc=new ArrayList<String>();
        	for(int i=0;i<Links.size();i++)
        	{
        	    JavascriptExecutor ab=(JavascriptExecutor)driver;
        	    ab.executeScript("window.scrollBy(0,1000)");
        	    
        	    abc.add(Links.get(i).getText());
        	    String p=Links.get(i).getText();
        	    System.out.println(p);
        	    JavascriptExecutor abz=(JavascriptExecutor)driver;
        	    abz.executeScript("window.scrollBy(0,-600)");
        	    
        	    Thread.sleep(30);
        	    
                    String value1=rendezvousHotel.getText();
                    String value2=SwissotelLePlazaBasel.getText();
                    String value3=HyattRegencyPerth.getText();
                    String value4=IslamabadMarriottHotel.getText();
                    String value5=roserayhaanrotanaHotel.getText();
                    String value6=MalmaisonManchester.getText();
                    
                    if(p.equals(value1)||p.equals(value2)|| p.equals(value3)||p.equals(value4)||p.equals(value5)||p.equals(value6))
        	    {
        		System.out.println("correct");
        	    }
        	    else
        	    {
        		System.out.println("incorrect");
        	    }
                    
        	}
                    Thread.sleep(1000);
                    
        	    nextpage.click();
        	    
        	    ArrayList<String> mno=new ArrayList<String>();
            	    for(int j=0;j<Links.size();j++)
            	{
            	    JavascriptExecutor am=(JavascriptExecutor)driver;
            	    am.executeScript("window.scrollBy(0,600)");
            	    abc.add(Links.get(j).getText());
            	    String pq=Links.get(j).getText();
            	    System.out.println(pq);
        	    
        	    String value1=OasisBeachTower.getText();
        	    String value2=madinahMoevenpi.getText();
        	    String value3=TriaHotelIstanbul.getText();
        	    String value4=AlzerHotelIstanbul.getText();
                    if(pq.equals(value1)||pq.equals(value2)||pq.equals(value3)||pq.equals(value4))
        	    {
        		System.out.println("correct");
        	    }
        	    else
        	    {
        		System.out.println("incorrect");
        	    }
        	}
        	
		
            
        }
        
    public void guestHouse()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
    	vv.executeScript("window.scrollBy(0,100)");
    	guestHouse.click();
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,1500)");
    	searchButton.click();
            ArrayList<String> abc=new ArrayList<String>();
    	for(int i=0;i<Links.size();i++)
    	{
    	    JavascriptExecutor ab=(JavascriptExecutor)driver;
    	    ab.executeScript("window.scrollBy(0,600)");
    	    abc.add(Links.get(i).getText());
    	    String p=Links.get(i).getText();
    	    System.out.println(p);
    	    JavascriptExecutor hh=(JavascriptExecutor)driver;
    	    hh.executeScript("window.scrollBy(0,-600)");
    	    String value1=guestHouse.getText();
    	    
                if(p.equals(value1))
    	    {
    		System.out.println("correct");
    	    }
    	    else
    	    {
    		System.out.println("incorrect");
    	    }
    	}
        }
        
    public void Motel()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		Motel.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=noResults.getText();
		    String PQR="No Results!!";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
            
        }
        
    public void residence()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		Residence.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=noResults.getText();
		    String PQR="No Results!!";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
        }
        
    public void resort()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		Resort.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=JumeirahBeachHotel.getText();
		    String PQR="Jumeirah Beach Hotel";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
        }
        
    public void timeShare()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		TimeShare.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=noResults.getText();
		    String PQR="No Results!!";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
        }
        
    public void extendedStay()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		ExtendedStay.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=noResults.getText();
		    String PQR="No Results!!";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
        }
        
    public void villa()
        {
            JavascriptExecutor vv=(JavascriptExecutor)driver;
		vv.executeScript("window.scrollBy(0,100)");
		Villa.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1500)");
		    searchButton.click();
		    String abc=noResults.getText();
		    String PQR="No Results!!";
		    if(abc.equals(PQR))
		    {
			System.out.println("Match found");
		    }
		    else
		    {
			System.out.println("unmatched");
		    }
        }
        
    public boolean modifyButton()
    {
	return modifyButton.isEnabled();
    }
    
    public String searchLocation() throws InterruptedException
    {
	WebElement element1=modifyButton;
	//waitElementclickable(element1);
	
	modifyButton.click();
	locationField.click();
	locationField.sendKeys("Mumbai");
	//--It will wait until element get visible on page
	/*WebElement element=locationSearchResult;
	waitVisibilityofElement(element);*/
	locationSearchResult.click();
	return selectedLocation.getText();
     }
    
    public boolean checkInCalender()
    {
	modifyButton.click();
	checkIN.click();
	return checkInDatepicker.isDisplayed();
	
	
    }
    
    public boolean checkOutCalender()
    {
	modifyButton.click();
	checkOut.click();
	return checkOutDatepicker.isDisplayed();
	
	
    }
    
    public boolean seleccheckInDate()
    {
	modifyButton.click();
	checkIN.click();
	return Date.isEnabled();
    }
    
    public boolean seleccheckoutDate()
    {
	modifyButton.click();
	checkOut.click();
	return Date.isEnabled();
    }
    
    public void Adults()
    {
	modifyButton.click();
	adultsField.click();
	adultsFielddropdownvalue.click();
	
    }
    
    
    public void child()
    {
	modifyButton.click();
	childField.click();
	childFieldvalue.click();
	
    }
    
    public boolean rendezvousHotelDetailButton()
    {
	return rendezvousHotelDetailButton.isEnabled();
    }
    
    public boolean sharethis()
    {
	rendezvousHotelDetailButton.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)");
	
	sharethis.click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement element = wait.until(ExpectedConditions.visibilityOf(sharethisLogo));
	
	return sharethisLogo.isDisplayed();
	
    }
	
    public void addtowishlist() throws InterruptedException
    {
	wishlist.click();
	    Thread.sleep(5000);
	    alert();//calling method from base class
 }
    
    public String twittersharingoption()
    {
	rendezvousHotelDetailButton.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)");
	  twitter.click();
	 return windowhandle();
	  
	  
    }
    
    
    public  Homepage backnavigation() throws IOException
    {
	
	navigateBack();
	return new Homepage();
    }
    
    
    public void roomcountselection()
    {
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(rendezvousHotelDetailButton));
	
	rendezvousHotelDetailButton.click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,700)");
		
	
	WebDriverWait waita=new WebDriverWait(driver,20);
	WebElement elementa = waita.until(ExpectedConditions.visibilityOf(roomscount));
	
	//roomscount.click();
	select(roomscount,2); 
    }
    
    
    
    
    
     }




        
        
	
	
    
    
    
    

