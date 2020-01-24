# language: pt

@Pesquisa_pela_Lupa 
Funcionalidade: Pesquisa pela lupa 

Contexto: Home page
	Dado estou no site advantagedemo na pagina inicial 
	Quando clicar na lupa 

@Pesquisa_pela_Lupa_com_sucesso 
Cenario: Busca com Sucesso na Home Page 
	E digitar o produto desejado 
	E escolher o produto 
	Entao o produto devera ser adicionado no carrinho 
	E a mensagem de adcionado ao carrinho com sucesso aparecera 
	
@Falha_Ao_Pesquisar_Pela_Lupa 
Cenario: Busca item inexistente no site 
	E digitar o item que deseja 
	Entao a mensagem de item nao encontrado aparecera