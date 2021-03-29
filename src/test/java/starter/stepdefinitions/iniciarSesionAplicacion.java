package starter.stepdefinitions;

import PagesCuc.Dashboard;
import PagesCuc.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class iniciarSesionAplicacion {
	
	@Steps
	HomePage home;
	
	@Steps
	Dashboard dash;	
	
	@Given("el usuario este en home page")
	public void el_usuario_este_en_home_page() {
	    home.openApplication();
	} 

	@When("ingresar nombre de usuario daniel@mail.com.co")
	public void ingresar_nombre_de_usuario_daniel_mail_com_co() {
	    home.enterUsername();
	}

	@When("ingresar password paola{int}")
	public void ingresar_password(Integer int1) {
	    home.enterPassword();
	    home.clickOnLoginButton(); 
	}

	@Then("el usuario puede iniciar sesion")
	public void el_usuario_puede_iniciar_sesion() {
	   dash.verifyAdmin();
	}



}
