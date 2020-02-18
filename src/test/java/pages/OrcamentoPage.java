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

    public void setQuantidadeProdutoRandom() {
        inserirQuantidade("ociquantidade", geraQuantidadeItem());
    }

    public void setValorUnitarioProdutoRandom() {
        inserirValor("ociprecunit", geraValorUnitarioItem());
    }

    public void setvalorUnitario(String valor) {
        inserirValor("ociprecunit", valor);
    }

    public void setRedPrecoVenda(String valor) {
        inserirValor("ociredpvariavel", valor);
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
