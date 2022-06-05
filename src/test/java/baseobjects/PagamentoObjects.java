package baseobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagamentoObjects {
	
	private WebDriver driver;

	public PagamentoObjects( WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement formaPagamento() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("payment_module")));
		return element;
	}
	public WebElement confirmarPerdido() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")));
		return element;
	}
}
