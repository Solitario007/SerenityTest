package PagesCuc;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
//	llamada de métodos a la página OrangeHRMHomePage
	AutomationPracticeHomePage homePage;
	
	
	@Step
	public void openApplication() {

//	este método abre el navegador
		homePage.open();
	}
	 
	@Step
	public void enterUsername() {
		
//		método para ingresar el usuario
		homePage.enterUname();
	}
	
	@Step
	public void enterPassword() {
		
//		método para ingresar password	
		homePage.enterPassword();
	}


	@Step
	public void clickOnLoginButton() {
		
//		método para oprimir el boton de inicio de sesión
		homePage.clickLogin();
	
	
}
	
	

}
