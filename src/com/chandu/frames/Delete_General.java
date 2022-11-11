package com.chandu.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.chandu.utility.Log;

public class Delete_General extends Global  {
	
	public void openApplication () {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	     driver.navigate().to(url);
	     System.out.println("openApplication");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application close");
		Log.info("open application");
	
	}
	public void verifyTile (){
		
		if (driver.getTitle().equals("applicationtiltel")) {
			System.out.println("Tiltle is matched");
		}
		else
		{
			System.out.println("Title is Matched");
		}
		System.out.println("Title is not matched");
	}
		
		 public void login (){
	   driver.findElement(By.name(txt_loginname)).sendKeys("nareshit");
	   driver.findElement(By.name(txt_password)).sendKeys("nareshit");
	   driver.findElement(By.name(btn_login)).click();
	   System.out.println("login completed");
	     }
        public void entryIntoFrame() {
	     driver.switchTo().frame("rightMenu");
	     Select sc=new Select(driver.findElement(By.name("loc_code")));
	     sc.selectByValue("0");
	     driver.findElement(By.name("loc_name")).click();
	     driver.findElement(By.xpath("//input[@name='loc_name']")).sendKeys("0008");
	     driver.findElement(By.name("chkLocID[]")).click();
	     driver.findElement(By.xpath("//input[@value='Delete']")).click();
	     System.out.println("Enterintoframeiscompleted");
        }
        public void existIntoFrame()
        {
        	driver.switchTo().defaultContent();
        	System.out.println("exist into frames are completed");
        }
        	
        
         public void  logout () {
        	 driver.findElement(By.linkText(link_logout)).click();
        	 System.out.println("logout completed");
}
		
	 
	
			
		}
	    
	     

