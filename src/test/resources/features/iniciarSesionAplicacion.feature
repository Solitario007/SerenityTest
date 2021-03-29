Feature: Iniciar sesion en AutomationPractice

	Scenario: Iniciar sesion con credentiales validas
	Given el usuario este en home page
	When ingresar nombre de usuario daniel@mail.com.co
	And ingresar password paola10 
	Then el usuario puede iniciar sesion