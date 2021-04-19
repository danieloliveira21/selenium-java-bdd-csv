package steps;

import Funcionalidades.InvestidorFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

import java.io.IOException;

public class InvestidorStep {

    private InvestidorFuncionalidade investidorFuncionalidade = new  InvestidorFuncionalidade();

    @Dado("que estou logado no site Vortx")
    public void queEstouLogadoNoSiteVortx() {
        investidorFuncionalidade.acessarSite();
    }

    @E("clico na sessão {string} no menu superior do site")
    public void clicoNaSessãoNoMenuSuperiorDoSite(String sessao) {
        investidorFuncionalidade.clicarNaSessao(sessao);
    }

    @E("seleciono a opção {string} da sessão {string}")
    public void selecionoAOpçãoDaSessão(String opcao, String sessao) throws InterruptedException {
        investidorFuncionalidade.selecionarAOpcao(opcao,sessao);
    }

    @E("seleciono o primeiro fundo da tela de {string}")
    public void selecionoOPrimeiroFundoDaTelaDe(String fundo) {
        investidorFuncionalidade.selecionarPrimeiroFundo(fundo);
    }

    @E("visualizo a tela {string}")
    public void visualizoATela(String tela) {
        investidorFuncionalidade.visualizarAtela(tela);
    }

    @Quando("visualizo as informaçoes na tela e salvo em um arquivo CSV")
    public void visualizoAsInformaçoesNaTelaESalvoEmUmArquivoCSV() throws IOException {
        investidorFuncionalidade.visualizarInformacoesEsalvar();
    }

    @E("clico na aba {string}")
    public void clicoNaAba(String aba) {
        investidorFuncionalidade.clicarNaAba(aba);
    }

    @E("clico no card {string}")
    public void clicoNoCard(String card) {
        investidorFuncionalidade.clicarNoCard(card);
    }

    @E("realizo o download")
    public void realizoODownload() throws InterruptedException {
        investidorFuncionalidade.realizarDownload();
    }

    @E("clico no botao {string}")
    public void clicoNoBotao(String botao) {
        investidorFuncionalidade.clicarNoBotao(botao);
    }


    @E("insiro o valor {string} no campo {string}")
    public void insiroOValorNoCampo(String valor, String campo) {
        investidorFuncionalidade.inserirDataNoCampo(valor,campo);
    }
}
