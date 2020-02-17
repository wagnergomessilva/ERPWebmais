package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseTest;

public class PedidoDeVenda extends BaseTest {

    int qtdeItens           = 10; //Quantidade de itens do pedido de venda

    //valores da aba cadastro
    String valorFrete       = "125,00";
    String valorSeguro      = "35,00";
    String valorDespesas    = "55,00";
    String valorDescInc     = "12,50";
    String valorDescCon     = "5,55";

    //Valores da aba itens de venda
    String redPrecoVenda    = "0,00";
    //String qtdeItemPedido   = "13,59";
    //String valorUnitario    = "123,85";

    @BeforeMethod
    public void setup() {
        Login.open();
        Login.logar("robohom", "robo123");
    }

    @Test
    public void cadastrarPedidoDeVenda() {
        Menu.acessaTelaPedidoDevenda();
        Pedido.alternarTelaPedidoDeVenda();
        Pedido.clicarBotaoNovoPedido();
        Pedido.setCodigoCliente("1325");
        Pedido.clicarAbaValoresAdicionais();
        Pedido.setFrete(valorFrete);
        Pedido.setSeguro(valorSeguro);
        Pedido.setDespesas(valorDespesas);
        Pedido.setDescIncond(valorDescInc);
        Pedido.setDescCond(valorDescCon);
        Pedido.clicarBotaoConfirmarPedido();
        Pedido.validarAlertaSalvoComSucesso();

        //adicionando os itens
        Pedido.clicarAbaItensDeVenda();
        int ContadorCodigoProtudo = 0;
        for (int i = 0; i < qtdeItens; i++) {
            Pedido.setProduto("+"+(ContadorCodigoProtudo = ContadorCodigoProtudo + 1));
            Pedido.esperaFixa(300);
            Pedido.setRedPrecoVenda(redPrecoVenda);
            Pedido.setQuantidadeProdutoRandom();
            Pedido.esperaFixa(300);
            Pedido.setValorUnitarioProduto();
            Pedido.esperaFixa(300);
            Pedido.clicarBotaAdicionarItemPedido();
            Pedido.esperaFixa(300);
        }
    }
}
