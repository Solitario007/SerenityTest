package AutomationJun.pages;

import net.thucydides.core.annotations.Step;

public class AdicionarAlCarro {
	
	 AdicionarCompra adicionar;
	
	@Step("Este paso digitara la cantidad")
	public void digitarCantidad() {
		
		adicionar.ingresarCantidad();
	}
	
	@Step("Este paso elegira la talla")
	public void elegirTalla() {
		
		adicionar.seleccionarTalla();
	}
	
	@Step("Este paso elegira el color")
	public void elegirColor() {
		
		adicionar.seleccionarColor();
	}
	
	@Step("Este paso agregara la compra")
	public void clickAgregarCompra() {
		
		adicionar.clickAddCompra();
		
	}

}
