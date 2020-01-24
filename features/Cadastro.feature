@Cadastro_de_novo_usuario 
Feature: Cadastro de novo usuario 

Background: 
	Given Estou na homepage do advantagedemo 
	When clicar em novo registro 

@Cadastro_com_sucesso
Scenario: Cadastro com sucesso 
	And Usuario preenche cadastro 
	And clica em aceitar os termos 
	And clica em registrar 
	Then O usuario sera cadastrado no site 
	
@Cadastro_Falha 
Scenario: Cadastro com falha
	And Preencher os dados do novo Usuario
	And Aceitar os termos
	And Finalizar o cadastro
	Then Mensagem de usuario ja cadastrado