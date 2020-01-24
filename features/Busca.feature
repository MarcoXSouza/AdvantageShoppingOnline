@Busca_de_produto 
Feature: Busca pela home page 

Background: 
	Given Que estou na pagina inicial do advantagedemo 
	
@Busca_de_produto_com_sucesso
Scenario: Busca com Sucesso na Home Page 
	When Eu escolher 
	And clicar em algum produto 
	Then O produto devera ser adicionado ao carrinho 
	And A mensagem de adcionado ao carrinho aparecera 
	
@Falha_Na_Busca
Scenario: Falha ao comprar mais de dez itens 
	When Eu escolher um item 
	And adicionar onze produtos no carrinho 
	And clicar em algum item 
	Then A mensagem limite atingido aparecera
	And fecha o navegador
