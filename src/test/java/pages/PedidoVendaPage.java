package pages;

import org.testng.Assert;

public class PedidoVendaPage extends BasePage{

    public void alternarTelaPedidoDeVenda() {
        alternarFocoJanela();
    }

    public void clicarBotaoNovoPedido() {
        clicarBotaoId("btn-novo-pedido");
    }

    public void setCodigoCliente(String codigoCliente) {
        inserirCodigo("pdcliente2", codigoCliente);
    }

    public void clicarBotaoConfirmarPedido() {
        clicarBotaoId("btSalvar");
    }

    public void validarAlertaSalvoComSucesso() {
        Assert.assertEquals("Salvo com sucesso!", alertaObterTextoEAceita());
    }

    public void clicarAbaItensDeVenda() {
        clicarAba("aba3");
    }

    public void setProduto(String codigoProduto) {
        inserirCodigoProduto(codigoProduto);
    }

    public void setQuantidadeProduto(String qtde) {
        inserirQuantidade("pdiquantidade", qtde);
    }

    public void setValorUnitarioProduto(String valorUnitario) {
        inserirValor("pdiprecouni", valorUnitario);
    }

    public void setFrete(String valorFrete) {
        inserirValor("pdvalorfrete", valorFrete);
    }

    public void setSeguro(String valorSeguro) {
        inserirValor("pdvalorseguro", valorSeguro);
    }

    public void setDespesas(String valorDespesas){
        inserirValor("pddespesaacess", valorDespesas);
    }

    public void setDescIncond(String valorDescIncond) {
        inserirValor("pdvalordesconto", valorDescIncond);
    }

    public void setDescCond(String valorDescCond) {
        inserirValor("pdvalordescontocond", valorDescCond);
    }

    public void setRedPrecoVenda (String redPrecoVenda){
        inserirValor("pdiredpvariavel", redPrecoVenda);
    }

    public void clicarBotaAdicionarItemPedido() {
        clicarBotaoId("btAdicionarItem");
    }

    public void clicarAbaValoresAdicionais() {
        clicarAba("itemaba2");
    }
}