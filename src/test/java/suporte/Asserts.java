package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Asserts {
    private WebDriver driver;

    public Asserts(WebDriver driver) {

        this.driver = driver;
    }

    private boolean pageContains() {
        return this.driver.findElement(By.xpath("//*[@id=\"product_2_7_0_0\"]/td[2]")).isDisplayed();
    }

    private boolean pageInformacoesPessoais() {
        return this.driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3")).isDisplayed();

    }

    private boolean pageEndereco() {
        return this.driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[3]/span")).isDisplayed();
    }

    public boolean pagePagamento() {
        return this.driver.findElement(By.xpath("//*[@id=\"step_end\"]/span")).isDisplayed();
    }

    public boolean mensagemDeErro(){
        return this.driver.findElement(By.xpath("//li[contains(text(),'An account using this email address has already be')]")).isDisplayed();
    }

    public boolean mensagemDeErroAutenticacao(){
        return this.driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).isDisplayed();
    }
    public boolean mensagemBemVindiASuaConta (){
        return this.driver.findElement(By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]")).isDisplayed();
    }

    public void checarCampoDescricaoResumo() {

        if (this.pageContains()) {
            System.out.println("PAGINA DE RESUMO OK");
        } else {
            System.out.println("PAGINA N�O ENCONTRADA");
        }
    }

    public void checarSuasInformacoesPessoais() {

        if (this.pageInformacoesPessoais()) {
            System.out.println("PAGINA SUAS INFORMA��ES PESSOAIS OK");
        } else {
            System.out.println("PAGINA N�O ENCONTRADA");
        }
    }

    public void checarpageEndereco() {

        if (this.pageEndereco()) {
            System.out.println("PAGINA ENDERE�O OK");
        } else {
            System.out.println("PAGINA N�O ENCONTRADA");
        }
    }

    public void checarPagePagamento() {

        if (this.pagePagamento()) {
            System.out.println("PAGINA PAGAMENTO OK");
        } else {
            System.out.println("PAGINA N�O ENCONTRADA");
        }
    }


}
