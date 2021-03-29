package AutomationJun.pages;

import net.thucydides.core.annotations.Step;

public class BuscarRopa {

	BuscarVestido buscar;
	
	@Step("Este paso buscara prendas")
	public void buscarPrenda() {
		
		buscar.filtrarBusqueda();
		
	}
	
	@Step("Este paso hara busquedas")
	public void hacerBusqueda() {
		
		buscar.realizarBusqueda();
	}
	
	public void elegirProducto() {
		
		buscar.seleccionarProducto();
	}
	
	
}
