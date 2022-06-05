package baseobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CampoBuscaObjects {

	private WebDriver driver;
	

	public CampoBuscaObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement digitarCampoBusca() {

		 return this.driver.findElement(By.id("search_query_top"));
		

	}

	public WebElement submit() {
		return this.driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		  
	}

	
	public WebElement clicarList() {
		
		return this.driver.findElement(By.cssSelector("#list"));
	}
	
}
	