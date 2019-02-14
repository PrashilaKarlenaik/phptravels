package com.phptravelstest.testcases;

//import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravelstest.base.Basetest;

import com.phptravelstest.pages.Loginpage;
import com.phptravelstest.pages.MyAccount;
import com.phptravelstest.pages.Signuppage;
//import com.phptravelstest.pages.Signuppage;

public class loginpagetestcases extends Basetest
{
   Loginpage loginpage;//contructor kuthe call zhala ethe?
    
    MyAccount myacct;
    Myaccounttestcasespage myacctestcase;
    Signuppage signuppage;
   
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
   
    public loginpagetestcases() throws IOException //1st
    {
	
    //super(); //2nd Go to basetest constructor
    
    }

    @BeforeMethod//3th
    public void setup() throws IOException
    {
	Inintialise("/login");//4th call the inintialise method of class basetest
	//loginpage = new Loginpage();
	String abc;
	abc="abc";
	System.out.print(abc);
    }
    
    
    /*@Test(priority=1)
    
	public void loginpageTitleTestCase() throws IOException
	
	{
	  System.out.println('1');
		loginpage = new Loginpage();

	    String title=loginpage.validatePagetitle();
	    System.out.println('2');
	    Assert.assertEquals(title, "Login");
	    System.out.println('3');
	}*/
        
   /*@Test(enabled=false)    
        public void loginTestcase() throws IOException
        
        {
	MyAccount myacct= new MyAccount();
        String title;
        boolean statususername=loginpage.verifyifusernamefieldEnabled();
        boolean statuspassword=loginpage.verifyifpasswordfieldEnabled();
        if(statususername==true && statuspassword==true)
        {
            loginpage.validateusername(prop.getProperty("username"),prop.getProperty("password"));
        }
        else
        {
            System.out.println("Textboxs are not enabled to enter username & name");
        }
	
        WebDriverWait wait = new WebDriverWait(driver, 80);
        @SuppressWarnings("unused")
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='RTL']")));
        title=myacct.validatemyaccounttitle();//if i call Myaccounttestcasepage class method it throws null pointer exception
        System.out.println(title);
        System.out.println('3');
        }*/
  /* 
    @Test(enabled=false) 
    
	public void signupbuttonredirectionTestcase() throws IOException
        {
	//scroll page
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	loginpage = new Loginpage();
	 loginpage.verifysignupbuttonredirection();
	}*/
    
    /*@Test
    
	public void forgetpwdbuttonTestCase() throws IOException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 loginpage = new Loginpage();
	 String popuptitle=loginpage.verifforgetpwdbuttonredirection();
	 System.out.println(popuptitle);*/
	 
	
    /*@Test
        public void EnterEmailIdTestCase() throws IOException
        {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 loginpage = new Loginpage();
	 loginpage.forgetpwd();
	 
	
        }*/


/*@Test
public void disableUsernameField() throws IOException
{
    loginpage = new Loginpage();
     
    loginpage.disabledusernamefield();  

}*/
    
    
    	/*//--Not integrated with POM
    	@DataProvider
    	//--Method will fetch data from Excel
    	public Iterator<Object[]> getExcelData()
    	{
    	//--as return type ass arrayobject    
    	ArrayList<Object[]>abc=getDataFromExcel();
    	//--iterate the arrayList in sequence
    	return abc.iterator();
    	}
	 
	@Test(dataProvider="getExcelData")//--Make a connection between Dataprovide & this method
	
	//--1.No of paramters=No of col in Excel
	//--2.sequence of parameter=sequence of column in Excel
	public void LoginTest(String username,String password)
	{
	    WebElement abc=driver.findElement(By.xpath("//input[@name='username']"));
		abc.click();
		abc.clear();
		abc.sendKeys(username);
	    
		WebElement ccc=driver.findElement(By.xpath("//input[@name='password']"));
		ccc.click();
		ccc.clear();
		ccc.sendKeys(password);	
		
		WebElement dd=driver.findElement(By.xpath("//button[@type='submit']"));
		dd.click();}*/
    
   /* @Test
    public void LoginusingEnterKeys() throws IOException
    {
	loginpage = new Loginpage();
	loginpage.loginUsingEnterKey();
    }*/
    
    @Test
    public void refreshTestcase() throws IOException
    {
	loginpage = new Loginpage();
	loginpage.refresh();
	

    }
    
	
	 
	
	
    
    
    
    
   
   
    
    
   /*@AfterMethod
    public void tearDown()
    {
	driver.quit();
    }*/
}
    
    
    
    
    

