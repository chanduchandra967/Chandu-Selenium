package com.chandu.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hrms.chandu.utility.Log;

import org.openqa.selenium.chrome.ChromeDriver;

   public class General_Login  extends Global{
	   public void openApplication() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("Applicaton opened");
			Log.info("open application");
		}
		
	        public void login() {
	        driver.findElement(By.name("txtUserName")).sendKeys(name);
	        driver.findElement(By.name("txtPassword")).sendKeys(password);
	        driver.findElement(By.name(btn_login)).click();
	}
	       public void logout() {
		     driver.findElement(By.linkText(link_logout)).click();
		    System.out.println("Logout completed");
		    driver.close();
	}
			
}
