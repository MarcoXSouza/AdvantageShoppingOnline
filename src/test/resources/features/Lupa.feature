# language: pt
@Lupa
Funcionalidade: Pesquisa pela lupa

  Contexto: Home page
    Dado que cliquei na lupa

  @LupaSucesso
  Esquema do Cenario: Busca com Sucesso na Home Page
    Quando pesquisar o produto "<produto>"
    Entao escolher produto

    Exemplos: 
      | produto                    |
      | HP ELITEPAD 1000 G2 TABLET |

  @LupaFalha
  Esquema do Cenario: Busca item inexistente no site
    Quando pesquisar o produto inexistente "<produto>"
    Entao a mensagem de item nao encontrado aparecera

    Exemplos: 
      | produto |
      | chinelo |
