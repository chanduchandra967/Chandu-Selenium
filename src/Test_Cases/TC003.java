package Test_Cases;

import com.chandu.EditEmployed.Edit_General;

public class TC003 {

	public static void main(String[] args) {
		Edit_General obj=new Edit_General();
		obj.openApplication();
		obj.loginApplication();
		obj.enterintoframes();
		obj.clickonanyemployee();
		obj.exitframe();
		obj.closeApplication();
		obj.logout();
	}

}
