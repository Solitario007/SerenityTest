package testcasesJU;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AutomationJun.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class InicioSesionPlataforma {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomePage home;
	
	@Test
	public void iniciarSesionUsuario() {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");		
		
		//se llaman a cada uno de los metodos contenidos en la clase AutomationPractice
//		home.verificarTitulo();
		home.ingresarCredenciales();
//		home.verificarSeccion();
		
		
	}
	

}
