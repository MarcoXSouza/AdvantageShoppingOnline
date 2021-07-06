# language: pt
@Lupa
Funcionalidade: Pesquisa pela lupa

  @LupaSucesso
  Esquema do Cenario: Busca com Sucesso na Home Page
    Dado que cliquei na lupa
    Quando pesquisar o produto "<produto>"
    Entao escolher produto

    Exemplos: 
      | produto                    |
      | HP ELITEPAD 1000 G2 TABLET |

  @LupaFalha
  Esquema do Cenario: Busca item inexistente no site
    Dado que cliquei na lupa
    Quando pesquisar o produto inexistente "<produto>"
    Entao a mensagem de item nao encontrado aparecera

    Exemplos: 
      | produto |
      | chinelo |
