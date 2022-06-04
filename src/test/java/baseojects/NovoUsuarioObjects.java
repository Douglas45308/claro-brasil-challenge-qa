package baseojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NovoUsuarioObjects {

	private WebDriver driver;

	public NovoUsuarioObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement campoEnderecoEmail() {
		return this.driver.findElement(By.id("email_create"));
	}
	public WebElement campoEmailExistente() {
		return this.driver.findElement(By.xpath("//input[@id='email']"));
	}
	public WebElement campoSenha() {
	  return this.driver.findElement(By.id("passwd"));
	}
	public WebElement acessar() {
		return this.driver.findElement(By.id("SubmitLogin"));
	}
	public WebElement criarConta() {
		return this.driver.findElement(By.id("SubmitCreate"));
	}

	public WebElement sigIn(){
		return this.driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
	}

	public WebElement title() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("id_gender")));
		return element;
	}

	public WebElement firstName() {
		return this.driver.findElement(By.id("customer_firstname"));
	}

	public WebElement lastName() {
		return this.driver.findElement(By.id("customer_lastname"));
	}

	public WebElement password() {
		return this.driver.findElement(By.id("passwd"));
	}

	public WebElement days() {
		return this.driver.findElement(By.id("days"));
	}

	public WebElement month() {
		return this.driver.findElement(By.id("months"));
	}

	public WebElement year() {
		return this.driver.findElement(By.id("years"));
	}

	public WebElement address() {
		return this.driver.findElement(By.id("address1"));
	}

	public WebElement city() {
		return this.driver.findElement(By.id("city"));
	}

	public WebElement state() {
		return this.driver.findElement(By.id("id_state"));
	}

	public WebElement postCode() {
		return this.driver.findElement(By.id("postcode"));
	}

	public WebElement country() {
		return this.driver.findElement(By.id("id_country"));
	}

	public WebElement mobilePhone() {
		return this.driver.findElement(By.id("phone_mobile"));
	}

	public WebElement registroConta() {
		return this.driver.findElement(By.id("submitAccount"));
	}



}
