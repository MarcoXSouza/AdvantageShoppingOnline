package br.com.keeggo.test.teststeps;

import br.com.keeggo.core.utils.TestContext;
import br.com.keeggo.test.Page.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	private LoginPage login;
	private TestContext testContext;
	
	public LoginSteps(TestContext context) {
		testContext = context;
		login = testContext.getPageObjectFactory().getLoginPage();
	}
	
	@Dado("clicar em novo registro")
	public void clicar_em_novo_registro() {
		login.getClicarCriarNovaConta();
	}
	
	@Dado("que ao clicar em user")
	public void que_ao_clicar_em_user() {
	    login.getClicarBtnCadastro();
	}

	@Quando("clicar em logar via facebook")
	public void clicar_em_logar_via_facebook() {
	    login.getClicaBtnFacebook();
	}

	@Entao("validar erro")
	public void validar_erro() {
		login.getValidaErroFacebook();
	}

	@Quando("fazer o login com usuario valido \"([^\"]*)\" \"([^\"]*)\"")
	public void fazer_o_login_com_usuario_valido(String usuario, String senha) {
	    login.getFazerLogin(usuario, senha);
	}

	@Entao("validar login efetuado com sucesso \"([^\"]*)\"")
	public void validar_login_efetuado_com_sucesso(String usuario) {
	    login.getValidarLoginComSucesso(usuario);
	}

	@Quando("fazer login com usuario invalido \"([^\"]*)\" \"([^\"]*)\"")
	public void fazer_login_com_usuario_invalido(String usuario, String senha) {
		login.getFazerLogin(usuario, senha);
	}

	@Entao("validar usuario invalido")
	public void validar_usuario_invalido() throws InterruptedException {
	    login.getValidarUsuarioInvalido();
	    
	}

}
