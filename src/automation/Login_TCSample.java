package automation;

import commonMethods.BaseMethods;

public class Login_TCSample {

	public static void main(String[] args) {
		
		BaseMethods base = new BaseMethods();
		base.openBrowser();
		base.launchERP();
		base.loginERP();
	
	}
}
