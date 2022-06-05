package pages;

import baseobjects.EnvioObjects;
import org.openqa.selenium.WebDriver;

public class EnvioPages {

	private EnvioObjects envio;

	public EnvioPages(WebDriver driver) {
		this.envio = new EnvioObjects(driver);
	}

	public void termoServicocheck() {
		this.envio.termoServicocheck().click();
	}

	public void fazerCheckoutFrete() {
		this.envio.fazerCheckoutFrete().click();
	}

	public void fazerCheckoutEndereco() {

		this.envio.fazerCheckoutEndereco().click();
	}

}
