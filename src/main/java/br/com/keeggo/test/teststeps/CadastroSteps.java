package br.com.keeggo.test.teststeps;

import br.com.keeggo.core.utils.TestContext;
import br.com.keeggo.test.Page.CadastroPage;
import br.com.keeggo.test.Page.LoginPage;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class CadastroSteps {
	private CadastroPage cadastro;
	private LoginPage login;
	private TestContext testContext;

	public CadastroSteps(TestContext context) {
		testContext = context;
		cadastro = testContext.getPageObjectFactory().getCadastroPage();
		login = testContext.getPageObjectFactory().getLoginPage();
	}

	@Quando("usuario preenche cadastro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
	public void usuario_preenche_cadastro(String nome, String email, String senha) {
		cadastro.cadastrarUsuario(nome, email, senha);
		
	}

	@Entao("^o usuario sera cadastrado no site \"([^\"]*)\"")
	public void o_usuario_sera_cadastrado_no_site(String nome) {
		login.getValidarLoginComSucesso(nome);
	}

	@Entao("^mensagem de usuario ja cadastrado")
	public void mensagem_de_usuario_ja_cadastrado() {
	
	}

}