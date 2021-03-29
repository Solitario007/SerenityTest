package AutomationJun.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class AutomationPractice extends PageObject{
	
	
	public void verificarTitulo() {
		
		//devuelve una cadena de  titulo
		String titulo = getDriver().getTitle();
		//Muestra el título a traves de una aserción
		Assert.assertTrue(titulo.contains("YourLogo"));
	}
	
	
	public void ingresarUsuarioPassword() {		
		
		
		//getDriver().findElement(org.openqa.selenium.By.id("")); otra forma de hacerlo
		//getDriver().findElement(org.openqa.selenium.By.xpath("")); por xpath
		
		$(By.id("email")).type("daniel@mail.com.co");
		$(By.id("passwd")).typeAndEnter("paola10");
		
	}
	
	public void verificarLogin() {
		
		
		String current_url = getDriver().getCurrentUrl();
		//A traves de la aserción diré si contiene sección es decir que el inicio de sesión está verificado
		Assert.assertTrue(current_url.contains("women"));
		
		
		
	}

}
