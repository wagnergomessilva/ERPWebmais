package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseTest;

public class PedidoDeVenda extends BaseTest {

    int qtdeItens           = 500; //Quantidade de itens do pedido de venda

    //valores da aba cadastro
    String valorFrete       = "125,59";
    String valorSeguro      = "35,26";
    String valorDespesas    = "55,12";
    String valorDescInc     = "12,57";
    String valorDescCon     = "2,07";

    //valores da aba itens de venda
    String redPrecoVenda    = "0,00";
    String qtdeItemPedido   = "13,59";
    String valorUnitario    = "123,85";
    String acresUnitFrete   = "2,50";
    String descUnitReais    = "3,49";
    String descUnitPerc    = "12,50";

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
            Pedido.setProdutoPedido("+"+(ContadorCodigoProtudo = ContadorCodigoProtudo + 1), ""+i);
            Pedido.esperaFixa(300);
            Pedido.setRedPrecoVenda(redPrecoVenda);
            Pedido.setQuantidadeProduto(qtdeItemPedido);
            Pedido.esperaFixa(300);
            Pedido.setValorUnitarioProduto(valorUnitario);
            Pedido.setAcrescimoUnitarioFrete(acresUnitFrete);
            Pedido.setDescontoEmReais(descUnitReais);
            Pedido.setDescontoEmPercentual(descUnitPerc);
            Pedido.esperaFixa(300);
            Pedido.clicarBotaAdicionarItemPedido();
            Pedido.esperaFixa(300);
        }
    }
}
