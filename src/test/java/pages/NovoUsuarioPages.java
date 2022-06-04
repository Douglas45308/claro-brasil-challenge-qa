package pages;

import baseojects.NovoUsuarioObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NovoUsuarioPages {

	private NovoUsuarioObjects usuario;

	public NovoUsuarioPages(WebDriver driver) {

		this.usuario = new NovoUsuarioObjects(driver);

	}

	public void novaConta(String email) {
		this.usuario.campoEnderecoEmail().sendKeys(email);
		this.usuario.criarConta().click();
	}

	public void preencherEmailCadastradoeSenha(String email, String senha){
		this.usuario.campoEmailExistente().sendKeys(email);
		this.usuario.campoSenha().sendKeys(senha);
		this.usuario.acessar().click();
	}

	public void preencherEmailNaoCadastradoeSenha(String email, String senha){
		this.usuario.campoEmailExistente().sendKeys(email);
		this.usuario.campoSenha().sendKeys(senha);
		this.usuario.acessar().click();
	}

	public void acessarSignin (){
        this.usuario.sigIn().click();
	}

	public void informacoesPessoais(String firstName, String lastName, String password, String address, String city,
			
		String postcode, String mobile) {
		this.usuario.title().click();
		this.usuario.firstName().sendKeys(firstName);
		this.usuario.lastName().sendKeys(lastName);
		this.usuario.password().sendKeys(password);
		this.usuario.days().sendKeys(Keys.ARROW_DOWN);
		this.usuario.days().sendKeys(Keys.ENTER);
		this.usuario.month().sendKeys(Keys.ARROW_DOWN);
		this.usuario.month().sendKeys(Keys.ENTER);
		this.usuario.year().sendKeys(Keys.ARROW_DOWN);
		this.usuario.year().sendKeys(Keys.ENTER);
		this.usuario.address().sendKeys(address);
		this.usuario.city().sendKeys(city);
		this.usuario.state().sendKeys(Keys.ARROW_DOWN);
		this.usuario.state().sendKeys(Keys.ENTER);
		this.usuario.postCode().sendKeys(postcode);
		this.usuario.country().sendKeys(Keys.ARROW_DOWN);
		this.usuario.country().sendKeys(Keys.ENTER);
		this.usuario.mobilePhone().sendKeys(mobile);
	}

	public void registroConta() {
		this.usuario.registroConta().click();
	}
}
