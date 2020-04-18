# language: pt
@Cadastro
Funcionalidade: Cadastro de novo usuario

  Contexto: 
    Dado clicar em novo registro

  @CadastroSucesso
  Esquema do Cenario: Cadastro com sucesso
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>" "<sobrenome>" "<telefone>" "<estado>" "<endereco>" "<cidade>" "<cep>" "<pais>"
    Entao o usuario sera cadastrado no site "<nome>"

    Exemplos: 
      | nome        | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       | pais   |
      | california5 | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 | Brazil |

  @CadastroFalha
  Esquema do Cenario: Cadastro com falha
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>" "<sobrenome>" "<telefone>" "<estado>" "<endereco>" "<cidade>" "<cep>" "<pais>"
    Entao mensagem de usuario ja cadastrado

    Exemplos: 
      | nome  | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       | pais   |
      | iudbf | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 | Brazil |
