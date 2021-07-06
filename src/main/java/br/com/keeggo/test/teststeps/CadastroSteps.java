package br.com.keeggo.test.teststeps;

import br.com.keeggo.core.utils.TestContext;
import br.com.keeggo.test.Page.CadastroPage;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CadastroSteps {
	private CadastroPage cadastro;
	private TestContext testContext;

	public CadastroSteps(TestContext context) {
		testContext = context;
		cadastro = testContext.getPageObjectFactory().getCadastroPage();
	}

	@Quando("usuario preenche cadastro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
	public void usuario_preenche_cadastro(String nome, String email, String senha) {
		cadastro.cadastrarUsuario(nome, email, senha);
		
	}
	
	@E("aceitar termos de cadastro")
	public void aceitar_termos_de_cadastro() {
		cadastro.getAceitaTermosECadastra();
		
	}

	@Entao("valido cadastro invalido")
	public void mensagem_de_usuario_ja_cadastrado() {
		cadastro.getValidarCadastroInvalido();
	}

}