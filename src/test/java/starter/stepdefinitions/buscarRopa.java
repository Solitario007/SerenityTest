package starter.stepdefinitions;

import PagesCuc.BuscarRopaTemporada;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class buscarRopa {
	
	@Steps	
	BuscarRopaTemporada buscarRopa;
	
	@Given("el usuario esta en home page")
	public void el_usuario_esta_en_home_page() {
		//metodo para abrir el navegador
	    buscarRopa.open();
	}

	@When("en el cuadro de busqueda ingresar la prenda a encontrar Printed Summer Dress")
	public void n_el_cuadro_de_busqueda_ingresar_la_prenda_a_encontrar_Printed_Summer_Dress() {
	    buscarRopa.filtrarBusqueda();
	}

	@When("click en la lupa")
	public void click_en_la_lupa() {
		
		buscarRopa.realizarBusqueda();
	    
	}

	@Then("Seleccionar producto Printed Summer Dress")
	public void seleccionar_producto_Printed_Summer_Dress() {
		
		buscarRopa.seleccionarProducto();
	    
	}

}
