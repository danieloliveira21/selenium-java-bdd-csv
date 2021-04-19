package Funcionalidades;

import Pages.InvestidorPage;
import SalvarArquivo.Prop;
import SalvarArquivo.SalvarArquivo;
import commons.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class InvestidorFuncionalidade extends BaseTest {

    private CommonFuncionalidade commonFuncionalidade = new CommonFuncionalidade();
    private InvestidorPage investidorPage = new InvestidorPage(webDriver);

    public void acessarSite(){
        commonFuncionalidade.acessarSite("https://vortx.com.br/");
    }

    public void clicarNaSessao(String sessao){
        switch (sessao){
            case "Investidor":
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getSessaoInvestidor())).click();
                break;
        }
    }

    public void selecionarAOpcao(String opcao, String sessao) throws InterruptedException {
        switch (sessao){
            case "Investidor":
                if (opcao.compareTo("Fundos de Investimento") == 0){
                    wait.until(ExpectedConditions.visibilityOf(investidorPage.getItemFundosDeInvestimentos()));
                    wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getItemFundosDeInvestimentos())).click();
                }
            break;
            case "Export":
                 if (opcao.compareTo("Export as CSV") == 0){
                wait.until(ExpectedConditions.visibilityOf(investidorPage.getExportCSV()));
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getExportCSV())).click();
                Thread.sleep(3000);
            } break;
        }
    }

    public void selecionarPrimeiroFundo(String fundo){
        switch (fundo){
            case "Investidor":
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.visibilityOf(investidorPage.getPrimeiroFundo()));
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getPrimeiroFundo())).click();
                break;
        }
    }

    public void visualizarAtela(String tela) {
        switch (tela){
            case "Dashboard":
                Assert.assertTrue(investidorPage.getAbaDashboard().isDisplayed());
                break;
        }
    }

    public void visualizarInformacoesEsalvar() throws IOException {

        Properties prop = Prop.getProp();

        String filedate = prop.getProperty("caminho.arquivoSalvo");
        String delimit = prop.getProperty("delimitador.arquivo");

        String gestor;
        String administrador;
        String custodiante;
        String auditor;
        String distribuidor;
        String verificadora;
        String pl;
        String fundacao;
        String giin;
        String emailRI;
        String RI;

        // Coleta informaçoes de Gestor

        gestor = webDriver.findElement(By.xpath("//div[@class='fundo-detalhe-dashboard']//p[.='Gestor']")).getText();
        SalvarArquivo.escreverCSV(delimit, gestor, filedate);

        gestor = webDriver.findElement(By.xpath("//h4[.='XP VISTA ASSET MANAGEMENT LTDA.']")).getText();
        SalvarArquivo.escreverCSV(delimit, gestor, filedate);

        // Coleta informaçoes Administrador

        administrador = webDriver.findElement(By.xpath("//p[.='Administrador']")).getText();
        SalvarArquivo.escreverCSV(delimit, administrador, filedate);

        administrador = webDriver.findElement(By.xpath("//p[.='Administrador']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, administrador, filedate);

        // Coleta informaçoes Custodiante

        custodiante = webDriver.findElement(By.xpath("//p[.='Custodiante']")).getText();
        SalvarArquivo.escreverCSV(delimit, custodiante, filedate);

        custodiante = webDriver.findElement(By.xpath("//p[.='Custodiante']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, custodiante, filedate);

        // Coleta informaçoes Auditor

        auditor = webDriver.findElement(By.xpath("//p[.='Auditor']")).getText();
        SalvarArquivo.escreverCSV(delimit, auditor, filedate);

        auditor = webDriver.findElement(By.xpath("//p[.='Auditor']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, auditor, filedate);

        // Coleta informaçoes Distribuidor

        distribuidor = webDriver.findElement(By.xpath("//p[.='Distribuidor']")).getText();
        SalvarArquivo.escreverCSV(delimit, distribuidor, filedate);

        distribuidor = webDriver.findElement(By.xpath("//p[.='Distribuidor']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, distribuidor, filedate);

        // Coleta informaçoes Verificadora

        verificadora = webDriver.findElement(By.xpath("//p[.='Verificadora']")).getText();
        SalvarArquivo.escreverCSV(delimit, verificadora, filedate);

        verificadora = webDriver.findElement(By.xpath("//p[.='Verificadora']")).getText();
        SalvarArquivo.escreverCSV(delimit, verificadora, filedate);

        // Coleta informaçoes Patrimonio Liquido

        pl = webDriver.findElement(By.xpath("//p[.='Patrimônio Líquido']")).getText();
        SalvarArquivo.escreverCSV(delimit, pl, filedate);

        pl = webDriver.findElement(By.xpath("//p[.='Patrimônio Líquido']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, pl, filedate);

        // Data de fundação

        fundacao = webDriver.findElement(By.xpath("//p[.='Data de Fundação']")).getText();
        SalvarArquivo.escreverCSV(delimit, fundacao, filedate);

        fundacao = webDriver.findElement(By.xpath("//p[.='Data de Fundação']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, fundacao, filedate);

        // GIIN

        giin = webDriver.findElement(By.xpath("//p[.='GIIN']")).getText();
        SalvarArquivo.escreverCSV(delimit, giin, filedate);

        giin = webDriver.findElement(By.xpath("//p[.='GIIN']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, giin, filedate);

        // Coleta informaçoes Email RI

        emailRI = webDriver.findElement(By.xpath("//p[.='E-mail RI']")).getText();
        SalvarArquivo.escreverCSV(delimit, emailRI, filedate);

        emailRI = webDriver.findElement(By.xpath("//p[.='E-mail RI']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, emailRI, filedate);

        // Site RI

        RI = webDriver.findElement(By.xpath("//p[.='Site RI']")).getText();
        SalvarArquivo.escreverCSV(delimit, RI, filedate);

        RI = webDriver.findElement(By.xpath("//p[.='Site RI']/../h4")).getText();
        SalvarArquivo.escreverCSV(delimit, RI, filedate);

    }

    public void clicarNaAba(String aba){
        switch (aba){
            case "Documentos":
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.visibilityOf(investidorPage.getAbaDocumentos()));
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getAbaDocumentos())).click();
                break;
        }
    }

    public void clicarNoCard(String card) {
        switch (card){
            case "DEMONSTRAÇÃO FINANCEIRA":
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getDemostracaoFinanceiro())).click();
                break;
        }
    }

    public void realizarDownload() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getArquivoDoCardDemostracaoFinanceira())).click();
    }


    public void clicarNoBotao(String botao) {
        switch (botao){
            case "Cota":
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getBotaoCota())).click();
                break;
            case "Atualizar":
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getBotaoAtualizar())).click();
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                break;
            case "Export":
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getBotaoExport())).click();
                break;
        }
    }

    public void inserirDataNoCampo(String valor, String campo) {
        switch (campo){
            case "Data Inicio":
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getDataInicial())).sendKeys(valor);
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getDataInicial())).sendKeys(Keys.ENTER);
                break;
            case "Data Final":
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getDataFinal())).sendKeys(valor);
                wait.until(ExpectedConditions.elementToBeClickable(investidorPage.getDataInicial())).sendKeys(Keys.ENTER);
                break;
        }
    }

}
