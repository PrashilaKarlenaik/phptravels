package com.phptravelstest.base;


import java.io.File;
//--Imported Packages
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Basetest 
 {
     public Properties prop;
     public static WebDriver driver;
     
     public Basetest() throws IOException//3rd
    {
	prop=new Properties();
	//--Create open connection for specified file
	FileInputStream configFile=new FileInputStream("C:\\Users\\Prashila\\eclipse-workspace\\phptravelstest\\src\\main\\java\\com\\phptravelstest\\config\\config.properties");//Read file
	//--load file
	prop.load(configFile);
	
    } 
    
    
    public void Inintialise(String xyz)
    {
	//-- Timeout Issue in site,Hence concatenating the baseURLs with Landing pages
	String baseUrl=prop.getProperty("url");
	String mainUrl=baseUrl+xyz;
	System.out.println(mainUrl);
	//--get Browser from config file
	String abc=prop.getProperty("browser");
	if(abc.equals("chrome"))
	{
	  //--set chromedriver exe file path  
	  System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver_win32\\chromedriver.exe");
	  //--initialize chromedriver
	  driver = new ChromeDriver();
	}
	else
	{
	    //--initialize Firezfox driver
	    driver = new FirefoxDriver();
	    System.out.println("Default browser is given Firebox,for IE or any other browser change value in config file");
	}
	
	//--maximize the window
	driver.manage().window().maximize();
	//-- delete all cookies
	driver.manage().deleteAllCookies();
	//--wait for pageload
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	//--open URL in current browser window
	driver.get(mainUrl);

    }
    
    public void alert() throws InterruptedException
    {
	//--It switches to currently active alert
	Alert alert = driver.switchTo().alert();
	//--get text on alert
	System.out.println(alert.getText());
	//--accpet the alert
	alert.accept();
	
    }
    
    public String windowhandle()
    {
	for (String winHandle : driver.getWindowHandles()) 
	{
	    driver.switchTo().window(winHandle);// switch focus of WebDriver to the next found window handle (that's your newly opened window)
	   
	    
	}
	 return driver.getTitle();
    }
    
    public void navigateBack()
    {
	//--navigate back
	driver.navigate().back();
    }
    
    public void scroll(int mno,int pqr)
    {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+mno+","+pqr+")");
	}
    
    public void waitVisibilityoFElement(WebElement element)
    {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public void waitElementToBeClickable(WebElement element)
    {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public void waitAlertPresent()
    {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.alertIsPresent());
    }
    
    public void waitTitleoFPage()
    {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleIs("text"));
    }
    
    //--Method overloading
    public void select(WebElement element,int a)
    {
	Select drop = new Select(element);
	drop.selectByIndex(a);
    }
    
    
  //--Method overloading
    public void select(WebElement element,String text )
    {
	Select drop = new Select(element);
	drop.selectByVisibleText(text);
    }
    
    
    public void dselect(WebElement element,int a)
    {
	Select drop = new Select(element);
	drop.selectByIndex(a);
    }
    
    public void dselect(WebElement element,String text)
    {
	Select drop = new Select(element);
	drop.selectByVisibleText(text);
    }
    
    
    public void screenShot(String fileName) throws IOException
    {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	Files.copy(SrcFile,new File("C:/Users/Prashila/eclipse-workspace/phptravelstest/src/test/java/com/phptravelstest/testcases"
	+fileName+".jpg"));
    }
    
    public static ArrayList<Object[]> getDataFromExcel()
    {
	ArrayList<Object[]>myData=new ArrayList<Object[]>();
	{
	    //--Create excelreader object & pass Excel path as parameter
	    Xls_Reader reader= new Xls_Reader("C:/Users/Prashila/eclipse-workspace/phptravelstest/src/main/java/com/phptravelstest/testdata/prashilanew.xlsx");
	    
	    int zzz=reader.getRowCount("Login");
		
	    System.out.println(zzz);
	    for(int rowNum=2;rowNum<=zzz;rowNum++)
		{
		String username=reader.getCellData("Login","username", rowNum);
		String password=reader.getCellData("Login","password", rowNum);
		
		//--create object array & store all above values in object array
		Object ob[]= {username,password};
		
		//--add this object values into arrayList
		myData.add(ob);
		}
	    return myData;
	    
	    
		
	    
	}
    }
   
    
    
    
    
    
    
 }

