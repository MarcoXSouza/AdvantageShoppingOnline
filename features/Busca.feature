Feature: Busca pela home page 

@Busca_de_produto
Scenario: Busca com Sucesso na Home Page 
	Given Estou na pagina inicial do advantagedemo 
	When Eu escolher 
	And clicar em algum produto 
	Then O produto devera ser adicionado ao carrinho 
	And A mensagem de adcionado ao carrinho aparecera