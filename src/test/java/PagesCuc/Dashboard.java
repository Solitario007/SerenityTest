package PagesCuc;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
//  llamada de métodos a la página OrangeHRMDashboard
	
	WomenDashboard dashboard;
	
	@Step
	public void verifyAdmin() {
		
		dashboard.loginVerified();
	}
 
}
