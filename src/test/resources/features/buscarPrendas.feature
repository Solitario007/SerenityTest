Feature: buscar prendas en BuscarVestido

	Scenario: Filtar busqueda de prendas
	Given el usuario esta en home page
	When en el cuadro de busqueda ingresar la prenda a encontrar Printed Summer Dress
	And click en la lupa
	Then Seleccionar producto Printed Summer Dress
