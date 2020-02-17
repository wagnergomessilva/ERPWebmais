package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseTest;

public class EstoqueInicial extends BaseTest {

    int qtdeItens = 30;
    String qtdeEntradaItem = "100.000,00";

    @BeforeMethod
    public void setup() {
        Login.open();
        Login.logar("robohom", "robo123");
    }

    @Test
    public void lancarEstoqueInicial(){
        Menu.acessarTelaEstoqueInicial();
        EstoqueInicial.alternarTelaEstoqueInicial();
        EstoqueInicial.setElementoCusto("1");
        EstoqueInicial.setCentroCusto("1");
        EstoqueInicial.clicarBotaoConfirmarEstoqueInicial();
        EstoqueInicial.validarAlertaSalvoComSucesso();

        //adiciona itens no estoque inicial
        int ContadorCodigoProtudo = 1500;
        for (int i = 0; i < qtdeItens; i++) {
            EstoqueInicial.setProduto(""+(ContadorCodigoProtudo = ContadorCodigoProtudo + 1));
            EstoqueInicial.setElementoCustoItem("1");
            EstoqueInicial.setCentroCustoItem("1");
            EstoqueInicial.setQuantidadeProduto(qtdeEntradaItem);
            EstoqueInicial.setCustoUnitario();
            EstoqueInicial.clicarBotaAdicionarItem();
            EstoqueInicial.esperaFixa(300);
        }
    }
}
