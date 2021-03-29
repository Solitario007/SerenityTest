package AutomationJun.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	AutomationPractice home;
	
	@Step("Este paso verificara el titulo")
	public void verificarTitulo() {
		
		home.verificarTitulo();
		
	}
	
	
	@Step("Este paso permitira iniciar sesion en la plataforma")
	public void ingresarCredenciales() { 
		
		home.ingresarUsuarioPassword();
		
	}
	
	
	@Step("Este paso verificara la seccion")
	public void verificarSeccion() {
		
		home.verificarLogin();
		
	}

}
