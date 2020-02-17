package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseTest;

public class Orcamento extends BaseTest {

    int qtdeItens = 10; //Quantidade de itens do orçamento

    //valores da aba cadastro
    String valorFrete           = "458,97";
    String valorSeguro          = "56,57";
    String valorDespesas        = "158,12";

   // String qtdeItemOrcamento    = "5,55";
    //String valorUnitario        = "22,75";

    @BeforeMethod
    public void setup() {
        Login.open();
        Login.logar("robohom", "robo123");
    }

    @Test
    public void cadastrarOrcamento() {
        Menu.acessaTelaOrcamento();
        Orcamento.alternarTelaOrcamento();
        Orcamento.setCodigoCliente("1325");
        Orcamento.clicarAbaValoresAdicionais();
        Orcamento.setFrete(valorFrete);
        Orcamento.setSeguro(valorSeguro);
        Orcamento.setDespesas(valorDespesas);
        Orcamento.clicarBotaoConfirmaOrcamento();

        int ContadorCodigoProtudo = 0;
        for (int i = 0; i < qtdeItens; i++) {
            Orcamento.setProduto("+" + (ContadorCodigoProtudo = ContadorCodigoProtudo + 1));
            Orcamento.setQuantidadeProdutoRandom();
            Orcamento.setValorUnitarioProduto();
            Orcamento.clicarBotaoAdicionarItemOrcamento();
            Orcamento.esperaFixa(300);
        }
    }
}
