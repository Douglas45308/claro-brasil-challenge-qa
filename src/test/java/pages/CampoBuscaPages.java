package pages;

import baseojects.CampoBuscaObjects;
import org.openqa.selenium.WebDriver;

public class CampoBuscaPages {

	private CampoBuscaObjects campoBusca;
	

	public CampoBuscaPages(WebDriver driver) {

		this.campoBusca = new CampoBuscaObjects(driver);
	}

	public void digitarCampoBusca(String produto) {

		this.campoBusca.digitarCampoBusca().sendKeys(produto);

	}

	public void submit() {
		this.campoBusca.submit().click();

	}

	public void clicarList() {
		this.campoBusca.clicarList().click();
	}

}
