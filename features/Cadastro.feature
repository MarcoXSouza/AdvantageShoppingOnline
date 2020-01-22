@Cadastro_de_novo_usuario 
Feature: Cadastro de novo usuario 

Background: 
	Given Estou na homepage do advantagedemo 
Scenario: Cadastro com sucesso 
	When clicar em novo registro 
	And Usuario preenche cadastro 
	And clica em aceitar os termos 
	And clica em registrar 
	Then O usuario sera cadastrado no site 
	
