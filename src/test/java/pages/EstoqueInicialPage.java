package pages;

import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.Random;

public class EstoqueInicialPage extends BasePage{

    public void alternarTelaEstoqueInicial() {
        alternarFocoJanela();
    }

    public void setElementoCusto(String elementoCusto) {
        inserirCodigo("estec2", elementoCusto);
    }

    public void setCentroCusto(String centroCusto) {
        inserirCodigo("estcc2", centroCusto);
    }

    public void clicarBotaoConfirmarEstoqueInicial() {
        clicarBotaoId("btnSave");
    }

    public void validarAlertaSalvoComSucesso() {
        Assert.assertEquals("Salvo com sucesso.", alertaObterTextoEAceita());
    }

    public void setProduto(String codigoProduto) {
        inserirCodigo("estitproduto2", codigoProduto);
    }

    public void setElementoCustoItem(String elementoCusto) {
        inserirCodigo("estitec2", elementoCusto);
    }

    public void setCentroCustoItem(String centroCusto) {
        inserirCodigo("estitcc2", centroCusto);
    }

    public void setQuantidadeProduto(String qtde) {
        inserirQuantidade("estitqtde", qtde);
    }

    public void clicarBotaAdicionarItem() {
        clicarBotaoId("btnAdicItem");
    }

    public void setCustoUnitario() {
        inserirValor("estitcustoun", geraCustoUnitario());
    }
}
