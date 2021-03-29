package AutomationJun.pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class RealizarCompraPrenda {
	
	@Managed
	WebDriver driver;
	
	@Steps
	RealizarCompra comprar;
	
	@Test
	public void comprarPrenda() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php?controller=order");
		comprar.muestraCompra();
		comprar.muestraDatos();
		comprar.elegirOpcionEnvio();
		comprar.pagarCompra();
		
		Thread.sleep(5000);
		
	}

}
