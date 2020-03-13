package br.com.rsinet.hub_BDD.teststeps;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.TestContext;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class CadastroSteps {
	private CadastroPage cadastro;
	private HomePage home;
	private TestContext testContext;

	public CadastroSteps(TestContext context) {
		testContext = context;
		cadastro = testContext.getPageObjectFactory().getCadastroPage();
		home = testContext.getPageObjectFactory().getHomePage();
	}

	@Dado("^clicar em novo registro$")
	public void clicar_em_novo_registro() {
		home.getLinkCadastro();
		home.getCriarConta();
	}

	@Quando("^usuario preenche cadastro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" "
			+ "\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void usuario_preenche_cadastro(String nome, String email, String senha, String sobrenome, String telefone,
			String estado, String endereco, String cidade, String cep, String pais) {
		cadastro.getName(nome);
		cadastro.getEmailReg(email);
		cadastro.getPassword(senha);
		cadastro.getConfirmPassword(senha);
		cadastro.getFirstName(nome);
		cadastro.getLastName(sobrenome);
		cadastro.getPhone(telefone);
		cadastro.getCountry(pais);
		cadastro.getCity(cidade);
		cadastro.getAddress(endereco);
		cadastro.getState(estado);
		cadastro.getZip(cep);
		cadastro.getAceitarTermos();
		cadastro.getBtnRegistrar();

	}

	@Entao("^o usuario sera cadastrado no site$")
	public void o_usuario_sera_cadastrado_no_site() {
//		Assert.assertTrue(mensagem.equals("Use maximum 15 character"));
	}

	@Entao("^mensagem de usuario ja cadastrado$")
	public void mensagem_de_usuario_ja_cadastrado() {
//		Assert.assertTrue(usuarioLogado.equals("https://www.advantageonlineshopping.com/#/"));
		System.out.println(cadastro.usuarioJaExiste());
	}

}