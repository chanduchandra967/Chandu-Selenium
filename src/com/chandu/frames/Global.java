package com.chandu.frames;
import org.openqa.selenium.WebDriver;

public class Global {
// Standard rule:to provide test data&Objects for whole application 
	public WebDriver driver;
	//**************TestData 
	public String url="http://183.82.103.245/nareshit/login.php";
	public String name ="nareshit";
	public String password="nareshit";
	// ********Objects/Elements
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login ="Submit";
	public String link_logout="Logout";
			
	}


