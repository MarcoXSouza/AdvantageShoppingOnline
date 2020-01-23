# language: pt
@Falha_Ao_Pesquisar_Pela_Lupa
Feature: Falha ao pesquisar pela lupa

Background:
	Given Estou no inicio do site advantagedemo na pagina inicial 

Scenario: Busca item inexistente no site 
	When clicar na barra de pesquisa 
	And digitar o item que deseja
	Then A mensagem de item nao encontrado aparecera