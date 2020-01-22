Feature: Pesquisa pela lupa

@Pesquisa_pela_Lupa
Scenario: Busca com Sucesso na Home Page 
	Given Estou no site advantagedemo na pagina inicial 
	When clicar na lupa 
	And digitar o produto desejado
	And escolher o produto
	Then O produto devera ser adicionado no carrinho 
	And A mensagem de adcionado ao carrinho com sucesso aparecera