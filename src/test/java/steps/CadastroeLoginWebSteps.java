package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import suporte.Asserts;
import suporte.Generator;
import suporte.TirarScreenshot;

import java.util.concurrent.TimeUnit;

public class CadastroeLoginWebSteps {

    private WebDriver driver;
    private AdicionarProdutoAoCarrinhoPages produto;
    private CampoBuscaPages digitar;
    private NovoUsuarioPages novoUsuario;
    private EnvioPages envio;
    private PagamentoPages pagar;
    private Asserts checagemOk;

    @Rule
    public TestName test = new TestName();

    @Before
    public void inicio() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe/");
        digitar = new CampoBuscaPages(driver);
        produto = new AdicionarProdutoAoCarrinhoPages(driver);
        novoUsuario = new NovoUsuarioPages(driver);
        envio = new EnvioPages(driver);
        pagar = new PagamentoPages(driver);
        checagemOk = new Asserts(driver);

    }

    @Dado("que o cliente acesse o site")
    public void que_o_cliente_acesse_o_site() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        String url = "http://automationpractice.com/";
        driver.get(url);
        System.out.println(driver.getTitle());
        Assert.assertEquals("My Store", driver.getTitle());
        this.inicio();
        this.tiraFoto();
    }

    @Dado("que o cliente realize a busca do produto {string}")
    public void que_o_cliente_realize_a_busca_do_produto(String string) throws InterruptedException {
        digitar.digitarCampoBusca("Blouse");
        this.tiraFoto();
        digitar.submit();
        digitar.clicarList();

    }

    @E("adicionar ao carrinho")
    public void adicionar_ao_carrinho() {
        produto.adicionarCarrinho();
        this.tiraFoto();
    }

    @Quando("seguir para o checkout")
    public void seguir_para_o_checkout() {
        produto.fazerCheckout();
        this.tiraFoto();
    }

    @Entao("validar produto adicionado com sucesso")
    public void validar_produto_adicionado_com_sucesso() {
        checagemOk.checarCampoDescricaoResumo();
        produto.fazerCheckoutResumo();
        this.tiraFoto();
    }

    @E("que o cliente insira o {string}")
    public void que_o_cliente_insira_o(String email) {
        novoUsuario.novaConta("claustre40634@uorak.com");
        this.tiraFoto();
    }
    @Entao("validar mensagem de erro")
    public void validar_mensagem_de_erro() {
        checagemOk.mensagemDeErro();
        this.tiraFoto();
    }
    @Entao("validar mensagem Bem vindo a sua conta")
    public void validar_mensagem_minha_conta() {
        checagemOk.mensagemBemVindiASuaConta();
        this.tiraFoto();
    }
    @Dado("que o cliente insira o {string} já cadastrado e {string}")
    public void que_o_cliente_insira_o_já_cadastrado_e(String email, String senha) {
        novoUsuario.preencherEmailCadastradoeSenha("hipolito1805@uorak.com", "123456");
        this.tiraFoto();

    }

    @Dado("que o cliente insira o {string} não cadastrado e {string}")
    public void que_o_cliente_insira_o_não_cadastrado_e(String string, String string2) {
        novoUsuario.preencherEmailNaoCadastradoeSenha("genaro2568@uorak.com", "123456");
        this.tiraFoto();
    }

    @Entao("validar mensagem erro de autenticação")
    public void validar_mensagem_erro_de_autenticação() {
        checagemOk.mensagemDeErroAutenticacao();
        tiraFoto();

    }
    @Dado("que o cliente insira o <Email>")
    public void que_o_cliente_insira_o_email() {
        //novoUsuario.preencherEmail();
        this.tiraFoto();
    }

    @Dado("que acesso {string}")
    public void que_acesso(String string) {
        novoUsuario.acessarSignin();
    }

    @Quando("preencher todos os campos obrigatorios")
    public void preencher_todos_os_campos_obrigatorios() {
        checagemOk.checarSuasInformacoesPessoais();
        novoUsuario.informacoesPessoais("Maria", "Silva", "123456", "Rua do Teste", "Da Qualidade", "35022",
                "123456789");
        novoUsuario.registroConta();

        this.tiraFoto();
    }

    @Entao("registro realizado com sucesso")
    public void registro_realizado_com_sucesso() {
        this.tiraFoto();
    }

    @Dado("que o endereco esteja correto")
    public void que_o_endereco_esteja_correto() {
        checagemOk.checarpageEndereco();
        envio.fazerCheckoutEndereco();
        this.tiraFoto();

    }

    @E("prossiga para o envio")
    public void prossiga_para_o_envio() {

        envio.termoServicocheck();
        envio.fazerCheckoutFrete();
        this.tiraFoto();

    }

    @Entao("confirme a forma de pagamento")
    public void confirme_a_forma_de_pagamento() {
        checagemOk.checarPagePagamento();
        pagar.formaPagamento();
        pagar.confirmarPerdido();
        this.tiraFoto();
        this.fecharNavegador();

    }

    @After
    public void fecharNavegador() {

        this.driver.quit();
    }

    public void tiraFoto() {
        String screenshotArquivo = "./Prints/" + Generator.dataHoraParaArquivo()
                + test.getMethodName() + ".png";
        TirarScreenshot.tirar(driver, screenshotArquivo);
    }

}


