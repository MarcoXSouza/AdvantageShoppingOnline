# language: pt
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Busca pela home page 


  @tag1
 Scenario: Busca com Sucesso na Home Page 
	Given Estou na pagina inicial do advantagedemoa 
	When Eu escolher 
	And clicar em algum produto 
	Then O produto devera ser adicionado no carrinho 
	And A mensagem de adcionado ao carrinho com sucesso aparecera
