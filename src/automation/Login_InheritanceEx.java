package automation;

import commonMethods.BaseMethods;

public class Login_InheritanceEx extends BaseMethods{

	public static void main(String[] args) {
		
		Login_InheritanceEx login = new Login_InheritanceEx();
		
		login.openBrowser();
		login.launchERP();
		login.loginERP();
	}
}
