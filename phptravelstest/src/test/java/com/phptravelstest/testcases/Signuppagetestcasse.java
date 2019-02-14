package com.phptravelstest.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravelstest.base.Basetest;
import com.phptravelstest.pages.Homepage;
import com.phptravelstest.pages.Signuppage;

public class Signuppagetestcasse extends Basetest
{
    Homepage hmepg;
    Signuppage signup;

    public Signuppagetestcasse() throws IOException {
	super();
	// TODO Auto-generated constructor stub
    }
    
    
    
    @BeforeMethod//3th
    public void setup() throws IOException
    {
	Inintialise("/register");
	Homepage hmepg=new Homepage();//ky kelay ethe mhity? nhi
	hmepg.myaccount();//created obj pf hmpage o v can click on myaccount from homepage.
	signup=new Signuppage();
     }
    
    
    @Test(priority=1)
    public void signuptitlepagetestcase() throws IOException
    {
	
	String title = signup.validatepagetitle();//he string mdhe ny na janar? tham
	System.out.println(title);
	String expectedtitle="Register";
	Assert.assertEquals(title,expectedtitle);
	System.out.println("Title of page is Register");
    }
    
   @Test(priority=2)
    public void validateerrormsg() throws IOException
    {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,600)");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 signup=new Signuppage();
         String errormsgs=signup.validateerrormsg();
	 System.out.println(errormsgs);
	 assertTrue(errormsgs.contains("The Email field is required."));
	 assertTrue(errormsgs.contains("The Password field is required."));
	 assertTrue(errormsgs.contains("The Password field is required."));
         assertTrue(errormsgs.contains("The First name field is required."));
         assertTrue(errormsgs.contains("The Last Name field is required."));
        

    }
   
    @Test(priority=3)
    public void firstnamefieldtestcase()
    {
	signup.validatefirstnamefield();
	System.out.println("User is able to enter first name");
    }
    
    
    
    @Test(priority=4)
    public void Lastnamefieldtestcase()
    {
	signup.validatelastnamefield();
	System.out.println("User is able to enter Last name");
    }
    
  @Test(priority=5)
    public void Mobilenofieldtestcase()
    {
	signup.validateMobileNofield();
	System.out.println("User is able to enter Mobile no");
    }
    
    @Test(priority=6)
    public void EmailIdfieldtestcase()
    {
	signup.validatEamilidfield();
	System.out.println("User is able to enter Email ID");
    }
    
    @Test(priority=7)
    public void Passwordfieldtestcase()
    {
	signup.validatpasswordfield();
	System.out.println("User is able to enter password");
    }
    
    @Test(priority=8)
    public void confirmfieldtestcase()
    {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,600)");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	signup.validateconfirmpasswordfield();
	System.out.println("User is able to enter confrim password");
    }
    
    /*@Test
    public void verifyuserlogintestcase()
    {
	signup.validatefirstnamefield();
	signup.validatelastnamefield();
	signup.validateMobileNofield();
	signup.validatEamilidfield();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signup.validateconfirmpasswordfield();
	signup.validatpasswordfield();
	signup.validateconfirmpasswordfield();
	
	
	
    }
    */
    @AfterMethod
    public void teardown()
    {
	driver.close();
    }
    
    
    
    
    
    
    
    

}
