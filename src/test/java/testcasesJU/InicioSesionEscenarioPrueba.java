package testcasesJU;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

//Run para ejecutar la prueba de serenity
@RunWith(SerenityRunner.class)
public class InicioSesionEscenarioPrueba extends PageObject{
	
	//con esta anotacion administra el navegador se abre y se cierra
	@Managed
	WebDriver driver;
	
	
	//esta anotacion sirve para medir la velocidad de la prueba es decir que aca se  ejecuta una prueba unitaria
	@Test
	public void buscarGoogle() {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//WebElementFacade metodo que permite ser más visible y facil de fluir contiene caracteristicas de la API de WebDriver
		WebElementFacade username=$(By.id("email"));
		 //antes de llamar a un evento, este debe ser visible hasta la siguiente operacion
		username.shouldBeVisible();
		username.type("daniel@mail.com.co");
		$(By.id("passwd")).typeAndEnter("paola10");	
		
	}	

}
