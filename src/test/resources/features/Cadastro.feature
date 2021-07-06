# language: pt
@Cadastro
Funcionalidade: Cadastro de novo usuario

  @CadastroSucesso
  Esquema do Cenario: Cadastro com sucesso
    Dado clicar em novo registro
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>" "<sobrenome>" "<telefone>" "<estado>" "<endereco>" "<cidade>" "<cep>" "<pais>"
    Entao o usuario sera cadastrado no site "<nome>"

    Exemplos: 
      | nome        | email   	        | senha  | sobrenome | telefone      | estado | endereco       | cidade | cep       | pais   |
      | Abigail 		| abigail@email.com | aBc123 | Jorge     | (11)123445678 | SP     | Rua dos pombos | Osasco | 06246-040 | Brazil |

  @CadastroFalha
  Esquema do Cenario: Cadastro com falha
    Dado clicar em novo registro
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>" "<sobrenome>" "<telefone>" "<estado>" "<endereco>" "<cidade>" "<cep>" "<pais>"
    Entao mensagem de usuario ja cadastrado

    Exemplos: 
      | nome  | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       | pais   |
      | iudbf | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 | Brazil |
