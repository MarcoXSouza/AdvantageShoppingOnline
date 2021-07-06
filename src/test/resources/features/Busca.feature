# language: pt
@Busca
Funcionalidade: Busca pela home page

  Contexto: escolher item
    Dado eu escolher uma categoria

  @BuscaSucesso
  Cenario: Busca com Sucesso na Home Page
    Quando clicar em algum produto
    Entao o produto devera ser adicionado ao carrinho

  @BuscaFalha
  Cenario: Falha ao comprar mais de dez itens
    Quando clicar em algum produto
    E adicionar onze produtos no carrinho
    Entao a mensagem limite atingido aparecera