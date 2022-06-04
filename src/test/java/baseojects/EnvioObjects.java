package baseojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnvioObjects {

	private WebDriver driver;

	public EnvioObjects(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement termoServicocheck() {
		return this.driver.findElement(By.id("cgv"));
	}

	public WebElement fazerCheckoutFrete() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
	}

	public WebElement fazerCheckoutEndereco() {

		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	}
}
