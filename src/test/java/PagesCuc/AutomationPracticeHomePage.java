package PagesCuc;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class AutomationPracticeHomePage extends PageObject {
	
	// en esta página se ingresa los localizadores del panel de control del login
	public void enterUname() {
		
		$(By.id("email")).type("daniel@mail.com.co");
		
	}
		
	public void enterPassword() {
		
		$(By.id("passwd")).type("paola10");
	}
	
	
	public void clickLogin() {
		
		$(By.id("SubmitLogin")).click();
	}	
	

}
