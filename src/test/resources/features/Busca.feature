# language: pt
@Busca
Funcionalidade: Busca pela home page

  @BuscaSucesso
  Cenario: Busca com Sucesso na Home Page
    Dado eu escolher uma categoria
    Quando clicar em algum produto
    Entao o produto devera ser adicionado ao carrinho

  @BuscaFalha
  Cenario: Falha ao comprar mais de dez itens
    Dado eu escolher uma categoria
    Quando clicar em algum produto
    E adicionar onze produtos no carrinho
    Entao a mensagem limite atingido aparecera
