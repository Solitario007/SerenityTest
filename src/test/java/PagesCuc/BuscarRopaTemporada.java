package PagesCuc;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class BuscarRopaTemporada extends PageObject{
	
	WebDriver driver;
    @Test
   public void filtrarBusqueda() {		
	//driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=printed&submit_search=");		
	$(By.id("search_query_top")).type("Printed Summer Dress");
	          
}

   public void realizarBusqueda() {
  // driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=printed&submit_search=");		
   $(By.name("submit_search")).click();	
}

   public void seleccionarProducto() {
   //driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=printed&submit_search=");
  // driver.get("http://automationpractice.com/index.php?id_product=5&controller=product&search_query=Printed+Summer+Dress&results=3");
   $(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
               
   

}


}
