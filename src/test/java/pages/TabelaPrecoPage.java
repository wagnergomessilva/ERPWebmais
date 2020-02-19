package pages;

import org.testng.Assert;

public class TabelaPrecoPage extends BasePage{

    public void alternarTelaTabelaPreco(){
        alternarFocoJanela();
    }

    public void setDescricaoTabelaPreco(String nomeTabela) {
        escrever("tbdesc", nomeTabela);
    }

    public void marcarExibirPedidosExternos() {
        clicarCkeckBoxID("tbpedexterno");
    }

    public void marcarExibirPedidosInternos() {
        clicarCkeckBoxID("tbpedinterno");
    }

    public void clicarBotaoConfirmarTabela() {
        clicarBotaoId("btSalvar");
    }

    public void clicarBotaoConfirmarItemTabela() {
        clicarBotaoId("btSalvar2");
    }

    public void clicarBotaoPesquisarItemTabela() {
        clicarBotaoId("btPesquisa");
    }

    public void validarAlertaSalvoComSucesso() {
        Assert.assertEquals("Salvo com sucesso.", alertaObterTextoEAceita());
    }

    public void setProdutoTabela(String codigoProduto){
        inserirCodigo("prcodproduto2", codigoProduto);
    }

    public void setPrecoUnitMaxRandom() {
        inserirValor("prprecounitario", geraValorUnitarioItem());
    }

}
