@Pesquisa_pela_Lupa 
Feature: Pesquisa pela lupa 
Background: Home page
	Given Estou no site advantagedemo na pagina inicial 
	When clicar na lupa 

@Pesquisa_pela_Lupa_com_sucesso 
Scenario: Busca com Sucesso na Home Page 
	And digitar o produto desejado 
	And escolher o produto 
	Then O produto devera ser adicionado no carrinho 
	And A mensagem de adcionado ao carrinho com sucesso aparecera 
	
@Falha_Ao_Pesquisar_Pela_Lupa 
Scenario: Busca item inexistente no site 
	And digitar o item que deseja 
	Then A mensagem de item nao encontrado aparecera