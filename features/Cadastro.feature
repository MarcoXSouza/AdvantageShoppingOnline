# language: pt 

@Cadastro_de_novo_usuario 
Funcionalidade: Cadastro de novo usuario 

Contexto: 
	Dado estou na homepage do advantagedemo 
	Quando clicar em novo registro 

@Cadastro_com_sucesso
Cenario: Cadastro com sucesso 
	E usuario preenche cadastro 
	E clica em aceitar os termos 
	E clica em registrar 
	Entao o usuario sera cadastrado no site 
	
@Cadastro_Falha 
Cenario: Cadastro com falha
	E preencher os dados do novo Usuario
	E aceitar os termos
	E finalizar o cadastro
	Entao mensagem de usuario ja cadastrado