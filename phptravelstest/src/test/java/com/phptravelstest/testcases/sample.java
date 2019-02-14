package com.phptravelstest.testcases;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITest;

import java.util.ArrayList;

public class sample 
{

    
    

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");	

	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost/phptravels/hotels/");
	
	driver.manage().window().maximize();
	
	WebElement a=driver.findElement(By.linkText("Rendezvous Hotels"));
	System.out.println(a.getText());
	
	
	
	
	 /*String value1=driver.findElement(By.xpath("//h4[@class='RTL go-text-right mt0 list_title']//following::b[1]")).getText();
	 
	 System.out.println(value1);*/
	
	
	
	/*List<WebElement> Links=driver.findElements(By.cssSelector("h4.RTL.go-text-right.mt0.list_title"));
	ArrayList<String> abc=new ArrayList<String>();
	
	for(int i=0;i<Links.size();i++)
	{
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0,600)");
	    abc.add(Links.get(i).getText());
	    System.out.println(Links.get(i).getText());
	}*/
	
	
	/*driver.findElement(By.xpath("//input[@id='2' and @name='stars']/following::ins[1]")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	driver.findElement(By.id("searchform")).click();
	

	
	
	List<WebElement> Links=driver.findElements(By.cssSelector("h4.RTL.go-text-right.mt0.list_title"));
	
        ArrayList<String> abc=new ArrayList<String>();
	
	for(int i=0;i<Links.size();i++)
	{
	    JavascriptExecutor ab=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,600)");
	    abc.add(Links.get(i).getText());
	    String p=Links.get(i).getText();
	    System.out.println(p);
	   
	 
	    
	    JavascriptExecutor hh=(JavascriptExecutor)driver;
	    hh.executeScript("window.scrollBy(0,-600)");
	    String value1=driver.findElement(By.xpath("//h4[@class='RTL go-text-right mt0 list_title']//following::b[1]")).getText();
	    //System.out.println("value of value1 is"+value1);
	    
	    String value2=driver.findElement(By.xpath("//h4[@class='RTL go-text-right mt0 list_title']//following::b[3]")).getText();
	    //System.out.println("value of value1 is"+value2);
	    
	    String value3=driver.findElement(By.xpath("//h4[@class='RTL go-text-right mt0 list_title']//following::b[5]")).getText();
	    //System.out.println("value of value1 is"+value3);
	   

	    if(p.equals(value1)|| p.equals(value2)|| p.equals(value3))
	    {
		System.out.println("correct");
	    }
	    
	    
	    else
	    {
		System.out.println("incorrect");
	    }
	    //String value1=driver.findElement(By.xpath("//h4[@class='RTL go-text-right mt0 list_title']//following::b[1]")).getText();
	
	
	}*/
	/*driver.findElement(By.xpath("//input[@id='2' and @name='stars']/following::ins[1]")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	driver.findElement(By.id("searchform")).click();
	

	
	
	List<WebElement> Links=driver.findElements(By.cssSelector("h4.RTL.go-text-right.mt0.list_title"));
	
        ArrayList<String> abc=new ArrayList<String>();
	
	for(int i=0;i<Links.size();i++)
	{
	    JavascriptExecutor ab=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,600)");
	    abc.add(Links.get(i).getText());
	    String p=Links.get(i).getText();
	    System.out.println(p);
	}*/
    }
}
	   
	 
	    
	    /*JavascriptExecutor hh=(JavascriptExecutor)driver;
	    hh.executeScript("window.scrollBy(0,-600)");
	    String value1=driver.findElement(By.xpath("//h4[@class='RTL go-text-right mt0 list_title']//following::b[1]")).getText();
	    System.out.println("value of value1 is"+value1);
	    
	
	
	
    }

}
	
    
	
	
           */
           
           

           
           
           
	
	
	
    


