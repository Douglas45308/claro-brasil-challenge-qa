package pages;

import baseojects.Endereco;
import org.openqa.selenium.WebDriver;

public class EnderecoPages {

	private Endereco address;

	public EnderecoPages(WebDriver driver) {
		this.address = new Endereco(driver);

	}

	public void proceed() {
		this.address.proceed().click();

	}
}
