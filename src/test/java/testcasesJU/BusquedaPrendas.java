package testcasesJU;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AutomationJun.pages.BuscarVestido;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class BusquedaPrendas {
	
	@Managed	
	WebDriver driver;
	
	@Steps
	BuscarVestido buscar;
	
	
	@Test
	public void buscarPrendas() {
		
		driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=printed&submit_search=");		
		buscar.filtrarBusqueda();
		buscar.realizarBusqueda();
		buscar.seleccionarProducto();		
		
	}

}
