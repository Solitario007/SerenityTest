package testcasesJU;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AutomationJun.pages.AdicionarAlCarro;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class AdicionarCompraAlCarro {
	
	@Managed	
	WebDriver driver;
	
	@Steps
	AdicionarAlCarro adicionar;
	
	@Test
	public void agregarCompra() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php?id_product=5&controller=product&search_query=Printed+Summer+Dress&results=3");
//		http://automationpractice.com/index.php?id_product=5&controller=product&search_query=Printed+Summer+Dress&results=3#/size-s/color-black
		adicionar.digitarCantidad();
		adicionar.elegirTalla();
		adicionar.elegirColor();
		adicionar.clickAgregarCompra();
		
		Thread.sleep(5000);
	
		
	}

}
