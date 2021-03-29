package AutomationJun.pages;

import org.openqa.selenium.By;


import net.serenitybdd.core.pages.PageObject;

public class BuscarVestido extends PageObject {  


   public void filtrarBusqueda() {		

		$(By.id("search_query_top")).type("Printed Summer Dress");

	}

   public void realizarBusqueda() {
	   
	   $(By.name("submit_search")).click();	
   }
   
   public void seleccionarProducto() {
	   
	   $(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
	   
	
   }


}
