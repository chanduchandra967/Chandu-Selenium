package Test_Cases;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.chandu.frames.General;
public class TC001 {
	@Test
public void chandu() {
	//public static void main(String[] args) {
	DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.openApplication();
		
		
	}

}
