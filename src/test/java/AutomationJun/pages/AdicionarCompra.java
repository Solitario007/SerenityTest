package AutomationJun.pages;

import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class AdicionarCompra extends PageObject{

	
	public void ingresarCantidad() {
		
		$(By.id("quantity_wanted")).typeAndEnter("1");
		
	}
	
	public void seleccionarTalla() {
		
		$(By.xpath("//*[@id=\"group_1\"]/option[1]")).click();		
		
	}
	
	public void seleccionarColor() {
	
		$(By.xpath("//*[@id=\"color_to_pick_list\"]/li[1]")).click();
		$(By.xpath("//*[@id=\"color_11\"]")).click();
		
	}

	public void clickAddCompra() {
		
		//$(By.name("Submit")).click();
		//$(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		$(By.cssSelector("#add_to_cart > button > span")).click();

		
	}


}
