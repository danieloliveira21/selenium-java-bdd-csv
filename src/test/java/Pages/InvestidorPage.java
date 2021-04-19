package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestidorPage {

    public InvestidorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "investidor")
    private WebElement sessaoInvestidor;

    @FindBy(id = "investidor4")
    private WebElement itemFundosDeInvestimentos;

    @FindBy(xpath = "//table[@class='MuiTable-root']//tbody//tr[1]")
    private WebElement primeiroFundo;

    @FindBy(xpath = "//li[contains(text(),'Documentos')]")
    private WebElement abaDocumentos;

    @FindBy(xpath = "//li[contains(text(),'Dashboard')]")
    private WebElement abaDashboard;

    @FindBy(id = "Demonstração Financeira")
    private WebElement demostracaoFinanceiro;

    @FindBy(xpath = "//div[@id='doc-Demonstração Financeira']//a[2]//p")
    private WebElement arquivoDoCardDemostracaoFinanceira;

    @FindBy(xpath = "//div[@class='fundo-detalhe-header']//button")
    private WebElement botaoCota;

    @FindBy(xpath = "//input[@placeholder='Data início']")
    private WebElement dataInicial;

    @FindBy(xpath = "//input[@placeholder='Data final']")
    private WebElement dataFinal;

    @FindBy(xpath = "//div[@class='date-pickers']/../button")
    private WebElement botaoAtualizar;

    @FindBy(xpath = "//div[@id='tabela-pu-pdf']//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit']")
    private WebElement botaoExport;

    @FindBy(xpath = "//li[.='Export as CSV']")
    private WebElement exportCSV;

    public WebElement getExportCSV() {
        return exportCSV;
    }
    public WebElement getBotaoExport() {
        return botaoExport;
    }
    public WebElement getBotaoAtualizar() {
        return botaoAtualizar;
    }
    public WebElement getDataInicial() {
        return dataInicial;
    }
    public WebElement getDataFinal() {
        return dataFinal;
    }
    public WebElement getBotaoCota() {
        return botaoCota;
    }
    public WebElement getDemostracaoFinanceiro() {
        return demostracaoFinanceiro;
    }
    public WebElement getArquivoDoCardDemostracaoFinanceira() {
        return arquivoDoCardDemostracaoFinanceira;
    }
    public WebElement getSessaoInvestidor() {
        return sessaoInvestidor;
    }
    public WebElement getItemFundosDeInvestimentos() {
        return itemFundosDeInvestimentos;
    }
    public WebElement getPrimeiroFundo() {
        return primeiroFundo;
    }
    public WebElement getAbaDocumentos() {
        return abaDocumentos;
    }
    public WebElement getAbaDashboard() {
        return abaDashboard;
    }
}
