Feature: Cadastro de novo usuario

@Cadastro_de_novo_usuario
Scenario: Cadastro com sucesso
	Given Estou na homepage do advantagedemo 
	When clicar em novo registro
	And Usuario preenche cadastro
	And clica em aceitar os termos
	And clica em registrar
	Then O usuario sera cadastrado no site 
