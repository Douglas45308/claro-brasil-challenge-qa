package pages;

import baseojects.AdicionarProdutoAoCarrinhoObjects;
import org.openqa.selenium.WebDriver;

public class AdicionarProdutoAoCarrinhoPages {

	private AdicionarProdutoAoCarrinhoObjects produto;

	public AdicionarProdutoAoCarrinhoPages(WebDriver driver) {
		this.produto = new AdicionarProdutoAoCarrinhoObjects(driver);
	}

	public void adicionarCarrinho() {
		produto.adicionarCarrinho().click();
	}
	
	public void addProductToCart() {
		produto.addToCart().click();
	}

	public String total() {
		return produto.total().getText();
	}

	public void fazerCheckout() {
		produto.fazerCheckout().click();
	}

	public void fazerCheckoutResumo() {
		produto.fazerCheckoutResumo().click();
	}

	public String productName() {
		return produto.productNameCheck().getText();

	}

}
