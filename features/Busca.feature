# language: pt

@Busca_de_produto 
Funcionalidade: Busca pela home page 

Contexto: 
	Dado que estou na pagina inicial do advantagedemo 
	
@Busca_de_produto_com_sucesso
Cenario: Busca com Sucesso na Home Page 
	Quando eu escolher 
	E clicar em algum produto 
	Entao o produto devera ser adicionado ao carrinho 
	
@Falha_Na_Busca
Cenario: Falha ao comprar mais de dez itens 
	Quando eu escolher um item 
	E adicionar onze produtos no carrinho 
	E clicar em algum item 
	Entao a mensagem limite atingido aparecera

