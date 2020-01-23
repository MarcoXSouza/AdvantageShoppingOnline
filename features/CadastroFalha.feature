@Cadastro_Falha 
Feature: Cadastrando usuario repetido 

Background: 
	Given Estou na home do site advantagedemo
	
Scenario: Cadastro com falha
	When Clicar em criar novo Registro
	And Preencher os dados do novo Usuario
	And Aceitar os termos
	And Finalizar o cadastro
	Then Mensagem de usuario ja cadastrado