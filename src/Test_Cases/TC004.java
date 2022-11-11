package Test_Cases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.chandu.frames.Delete_General;

public class TC004   {
	@Test
public void chandu() throws Exception{
	//public static void main(String[] args)  {
		DOMConfigurator.configure("log4j.xml");
	Delete_General obj= new  Delete_General();
	obj.openApplication();
	obj.verifyTile();
	obj.login();
	Thread.sleep(3000);
	obj.entryIntoFrame();
	Thread.sleep(3000);
	obj.existIntoFrame();
	obj.logout();
		
}
}