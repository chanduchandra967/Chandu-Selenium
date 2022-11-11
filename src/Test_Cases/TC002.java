package Test_Cases;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.chandu.frames.General_Login;
public class TC002 {
	@Test
public void chandu() {
	//public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		General_Login obj = new General_Login(); 
		obj.openApplication();
		obj.login();
		obj.logout();
		
		
	}

}
