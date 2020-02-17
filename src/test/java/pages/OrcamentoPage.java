package pages;

public class OrcamentoPage extends BasePage{

    public void alternarTelaOrcamento(){
        alternarFocoJanela();
    }

    public void setCodigoCliente(String codigoCliente) {
        inserirCodigo("cliente2", codigoCliente);
    }

    public void clicarBotaoConfirmaOrcamento() {
        clicarBotaoId("btnSaveAba1");
    }

    public void clicarAbaItensDeVenda() {
        clicarAba("#itens");
    }

    public void setProduto(String codigoProduto) {
        inserirCodigoProduto(codigoProduto);
    }

    public void setQuantidadeProduto(String qtde) {
        inserirQuantidade("ociquantidade", qtde);
    }

    public void setValorUnitarioProduto(String valorUnitario) {
        inserirValor("ociprecunit", valorUnitario);
    }

    public void clicarBotaoAdicionarItemOrcamento() {
        clicarBotaoId("btnSaveItem");
    }

    public void clicarAbaValoresAdicionais() {
        clicarAba("itemaba2");
    }

    public void setFrete(String valorFrete) {
        inserirValor("ocfretead", valorFrete);
    }

    public void setSeguro(String valorSeguro) {
        inserirValor("ocseguro", valorSeguro);
    }

    public void setDespesas(String valorDespesas){
        inserirValor("ocacessoria", valorDespesas);
    }
}
