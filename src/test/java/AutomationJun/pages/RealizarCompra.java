package AutomationJun.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class RealizarCompra extends PageObject{
	
	public void muestraCompra() {
		
	    $(By.xpath("//*[@id=\"product_5_19_0_472558\"]/td[2]/p/a")).click();
		$(By.xpath("//*[@id=\"order_step\"]/li[1]/span"));
		$(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();		
		
		
		
	}
	
	public void muestraDatos() {
		
		$(By.xpath("//*[@id=\"order_step\"]/li[3]/span"));
		$(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		          		
	}
	
	public void elegirOpcionEnvio() {
		
		$(By.xpath("//*[@id=\"order_step\"]/li[4]/span"));
		$(By.xpath("//*[@id=\"form\"]/div/p[2]/a")).click();
		$(By.xpath("//*[@id=\"order\"]/div[4]/div/div/a")).click();
		$(By.xpath("//*[@id=\"cgv\"]")).click();
		$(By.xpath("//*[@id=\"form\"]/p/button/span/text()")).click();		
		
	}	
	
	public void pagarCompra() {
		
		$(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).click();
		$(By.xpath("//*[@id=\"cart_navigation\"]/button/span/text()")).click();
	}
	

}
