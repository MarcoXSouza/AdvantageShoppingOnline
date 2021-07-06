# language: pt
@Cadastro
Funcionalidade: Cadastro de novo usuario

  @Cadastro_com_sucesso
  Esquema do Cenario: Cadastrar usuario com sucesso
    Dado clicar em novo registro
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>"
		E aceitar termos de cadastro
		Entao validar login efetuado com sucesso "<usuario>"
		
    Exemplos: 
      | nome    | email   	       | senha  |
      | Jones	  | testes@email.com | aBc123 |

  @Cadastro_invalido
  Esquema do Cenario: Cadastro usuario invalido
    Dado clicar em novo registro
    Quando usuario preenche cadastro "<nome>" "<email>" "<senha>" 
    Entao valido cadastro invalido

    Exemplos: 
      | nome | email   | senha |
      | marc | marcos@ | a123  |