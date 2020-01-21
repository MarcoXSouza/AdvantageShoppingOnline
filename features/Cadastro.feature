Feature: Cadastro de novo usuario

@Cadastro_de_novo_usuario
Scenario: Cadastro com sucesso
	Given Estou na pagina inicial do advantagedemo 
	When clicar em novo registro
	And digita o nome "Marcos"
	And digita o email "email@teste.com"
	And digita o senha "123Asdfg"
	And confirma a senha "123Asdfg"
	And digita o primeiro nome "Marcos"
	And digita o ultimo nome "Xavier"
	And digita o telefone "11999992222"
	And seleciona o pais "Fiji"
	And digita o nome da cidade "Lautoka"
	And digita o endereco "Rua das lamentacoes 211"
	And digita o UF do estado "LT"
	And digita o CEP "02039884"
	And clica em aceitar os termos
	And clica em registrar
	Then O usuario sera cadastrado no site 
	And O site retornara para homepage