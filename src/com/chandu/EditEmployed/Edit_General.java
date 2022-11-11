package com.chandu.EditEmployed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.chandu.frames.Global;
import org.openqa.selenium.By;
public class Edit_General extends Global {
	
public void openApplication() {
	System.setProperty("webdriver.chrome.driver",  
			"C:\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("openapplication");
	
}
public void close () {
	driver.close();
	System.out.println("Application close");
	
}
public void loginApplication() {
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login Application completed");
	
}
public void enterintoframes() {
	driver.switchTo().frame("rightMenu");
	System.out.println("enter in to frames completed");
	
}
public void exitframe() {
	driver.switchTo().defaultContent();
	System.out.println("exit frame completed");
	
}
public void logout() {
	driver.findElement(By.linkText("Logout")).click();
	
}

public void  clickonanyemployee() {
driver.findElement(By.xpath("Anyemploye")).click();
driver.findElement(By.id("editbutton")).click();
driver.findElement(By.name("txtEmpFirstName")).clear();
driver.findElement(By.name("txtEmpLastName")).clear();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("Chandu");
driver.findElement(By.name("txtEmpLastName")).sendKeys("Yadav");
System.out.println("enter employe completed");

}

public void closeApplication() {
	driver.quit();
	System.out.println("close Application completed");
	
	






	
	
	
	
	
	
	
}

}
