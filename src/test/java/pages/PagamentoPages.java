package pages;

import baseojects.PagamentoObjects;
import org.openqa.selenium.WebDriver;

public class PagamentoPages {

	private PagamentoObjects pagamento;

	public PagamentoPages(WebDriver driver) {

		this.pagamento = new PagamentoObjects(driver);
	}

	public void formaPagamento() {
		this.pagamento.formaPagamento().click();
	}

	public void confirmarPerdido() {
		this.pagamento.confirmarPerdido().click();
	}
}
