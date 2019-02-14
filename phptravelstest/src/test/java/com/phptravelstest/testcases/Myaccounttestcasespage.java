package com.phptravelstest.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravelstest.base.Basetest;
import com.phptravelstest.pages.Loginpage;
import com.phptravelstest.pages.MyAccount;

public class Myaccounttestcasespage extends Basetest
{
    Loginpage loginpage;
    MyAccount acc;
    public Myaccounttestcasespage() throws IOException
    {
	super();
    }
    
    @BeforeTest
    public void setup() throws IOException
    {
	Inintialise();
	loginpage = new Loginpage();//before testing myaccount page,user should get logged in into site,hence loginpage class obj is called
	loginpage.validateusername(prop.getProperty("username"),prop.getProperty("password"));//validateusername method is called from loginpage class to get logged in into site
	
    }
    
    @Test(priority=1)
    
   	public void MyaccountTitleTestCase()
   	{
   	    String title=acc.validatemyaccounttitle();
   	    Assert.assertEquals(title, "My Account");
   	    
   	}
    
    @Test
    public void verifylogoTestcase () throws IOException
    {
    
   
    }
    
    

}
