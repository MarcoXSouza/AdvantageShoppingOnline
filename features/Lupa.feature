# language: pt
@Lupa
Funcionalidade: Pesquisa pela lupa

  Contexto: Home page
    Dado que cliquei na lupa

  @Lupa_Sucesso
  Esquema do Cenario: Busca com Sucesso na Home Page
    E pesquisar o produto "<produto>"
    Quando escolher o produto 
    Entao adicionar o produto carrinho
    
    Exemplos:
    |produto|
    |tablet|

  @Lupa_Falha
  Esquema do Cenario: Busca item inexistente no site
    E pesquisar o produto
    Quando escolher o produto 
    Entao a mensagem de item nao encontrado aparecera
