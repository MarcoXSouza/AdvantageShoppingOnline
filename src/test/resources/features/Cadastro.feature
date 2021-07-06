# language: pt
@Cadastro
Funcionalidade: Cadastro de novo usuario

  @Cadastro_usuario_com_sucesso
  Esquema do Cenario: Cadastrar usuario com sucesso
    Dado clicar em novo registro
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>"
    Entao o usuario sera cadastrado no site "<nome>"

    Exemplos: 
      | nome    | email   	        | senha  |
      | Jones	| abigail@email.com | aBc123 |

  @Cadastro_usuario_invalido
  Esquema do Cenario: Cadastro usuario invalido
    Dado clicar em novo registro
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>" 
    Entao mensagem de usuario ja cadastrado

    Exemplos: 
      | nome  | email   | senha  |
      | iudbf | marcos@ | aBc123 |