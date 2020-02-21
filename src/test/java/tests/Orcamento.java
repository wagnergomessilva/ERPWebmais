package tests;

import org.testng.annotations.*;
import pages.BaseTest;

//https://www.devmedia.com.br/api-selenide-desenvolvimento-de-testes-funcionais-em-java/33680

public class Orcamento extends BaseTest {

    int qtdeItens = 500; //Quantidade de itens do orçamento

    //valores da aba cadastro
    String valorFrete           = "458,97";
    String valorSeguro          = "56,57";
    String valorDespesas        = "158,12";

    //valores da aba itens de venda
    String qtdeItemOrcamento    = "5,57";
    String valorUnitario        = "23,79";
    String redPrecoVenda        = "0,00";
    String descUnitarioPerc     = "15,00";


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
            Orcamento.setProdutoOrcamento("+" + (ContadorCodigoProtudo = ContadorCodigoProtudo + 1), ""+i);
            Orcamento.setRedPrecoVenda(redPrecoVenda);
            Orcamento.setQuantidadeProduto(qtdeItemOrcamento);
            //Orcamento.setQuantidadeProdutoRandom();
            //Orcamento.setValorUnitarioProdutoRandom();
            Orcamento.setvalorUnitario(valorUnitario);
            Orcamento.selecionaComboDescontoEmPercentual();
            Orcamento.setDescontoUnitarioPerc(descUnitarioPerc);
            Orcamento.clicarBotaoAdicionarItemOrcamento();
        }

    }

}
