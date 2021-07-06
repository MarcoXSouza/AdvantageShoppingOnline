# language: pt
@Login
Funcionalidade: Testa login de usuarios

	@Logar_via_facebook
	Cenario: Logar via facebook
		Dado que ao clicar em user
		Quando clicar em logar via facebook
		Entao validar erro

	@Logar_com_usuario_valido
	Esquema do Cenario: Logar com usuario valido
		Dado que ao clicar em user
		Quando fazer o login com usuario valido "<usuario>" "<senha>"
		Entao validar login efetuado com sucesso "<usuario>"

		Exemplos:
			|usuario |senha |
			|terty   |258As |
			
	@Logar_com_usuario_invalido
	Esquema do Cenario: Logar com usuario invalido
		Dado que ao clicar em user
		Quando fazer login com usuario invalido "<usuario>" "<senha>"
		Entao validar usuario invalido
		
		Exemplos:
			|usuario |senha |
			|çamurai |rrres |