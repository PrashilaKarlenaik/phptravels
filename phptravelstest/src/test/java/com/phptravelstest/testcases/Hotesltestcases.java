package com.phptravelstest.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravelstest.base.Basetest;
import com.phptravelstest.pages.Dubabc;
//import com.phptravelstest.pages.Hotelspage;
import com.phptravelstest.pages.Hotelspage;

public class Hotesltestcases extends Hotelspage
{
    //Hotelspage hotel=new Hotelspage();
    //
Hotelspage hotel;

    public Hotesltestcases() throws IOException {
	super();
	// TODO Auto-generated constructor stub
	
    }
    
    @BeforeMethod
    public void setup() throws IOException
    {
	System.out.println("driver2="+driver);
	Inintialise("hotels/");
	hotel=new Hotelspage();
	System.out.println("driver3="+driver);
	System.out.println("current Webpage URL is="+driver.getCurrentUrl());
	
    }
 
    
   /* @Test(priority=1)
    public void validatehotelsListingsTestcase () throws IOException
    {
        hotelsListings();
    }*/
    
    
  /*  @Test(priority=2,alwaysRun=true)
    public void starGrade() throws IOException
    {
        hotel=new Hotelspage();
	hotel.starGrade();
    }
    */
   /* 
   @Test(priority=2)
    public void ResortfilterTestcase() throws IOException
    {
        hotel=new Hotelspage();
	hotel.resort();
     }*/
    
  /*@Test(priority=3,alwaysRun=true)
    public void hotelfilterTestcase() throws IOException, InterruptedException
    {
        hotel=new Hotelspage();
	hotel.hotel();
     }*/
    
   /*@Test(priority=3)
    public void modifyButtontestcase() throws IOException
    {
	 hotel=new Hotelspage();
	 Assert.assertTrue(hotel.modifyButton());
    }
    */
   /* @Test(priority=4)
    public void searchLocationtestcase() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 Assert.assertEquals("Mumbai, India",hotel.searchLocation());
	
    }*/
    
    
    
    /*@Test(priority=4)
    public void checkInDatapicker() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 Assert.assertTrue(hotel.checkInCalender());
	
    }*/
    
   /* @Test(priority=5,timeOut=1000)
    public void checkOutDatapicker() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 Assert.assertTrue(hotel.checkOutCalender());
	
    }*/
    
   /*@Test(priority=6,timeOut=1000)
    public void checkIndateselection() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 Assert.assertTrue(hotel.seleccheckInDate());
	
    }
    */
    /*@Test(priority=7)
    public void checkoutdateselection() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 Assert.assertTrue(hotel.seleccheckoutDate());
		 
    }*/
    
   /* @Test(priority=1)
    public void Adults() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 hotel.Adults();
	
    }*/
    
    
   /*@Test(priority=1)
    public void child() throws IOException, InterruptedException
    {
	 hotel=new Hotelspage();
	 hotel.child();
	
    }*/
    
   /* @Test(priority=1)
    public void rendezvousHotelDetailButton() throws IOException
    {
	hotel=new Hotelspage();
	Assert.assertTrue(hotel.rendezvousHotelDetailButton());
    }*/
    
    
    /*@Test(priority=1)
    
    public void sharethis() throws IOException
    {
	hotel=new Hotelspage();
	Assert.assertTrue(hotel.sharethis());
    }*/
    
    /*@Test(priority=1)
    public void wishlistAlert() throws IOException, InterruptedException
    {
	hotel=new Hotelspage();
	hotel.addtowishlist();
	
    }*/
    
    /*@Test
    public void twitter() throws IOException
    {
	
	hotel=new Hotelspage();
	 Assert.assertEquals("Share a link on Twitter",hotel.twittersharingoption());
	
    }*/
    
    /*@Test
    public void backnavigationTestCase() throws IOException
    {
	hotel=new Hotelspage();
	hotel.navigateBack();
    }*/
    
  @Test
    public void roomcountselectionTestcase() throws IOException
    {
      //hotel=new Hotelspage();
	hotel.roomcountselection();
	
    }
    
    @AfterMethod
    public void teardown() throws IOException
    {
	//Basetest a=new Basetest();
	super.screenShot("abc");
	driver.close();
    }
    
    
    
    
    
    
   

    
    
    
    
}
  
  