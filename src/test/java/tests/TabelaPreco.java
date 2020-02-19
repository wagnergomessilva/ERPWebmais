package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseTest;

public class TabelaPreco extends BaseTest {

    String descricaoTabela = "TABELA DE PREÇO AUTOMAÇÃO 01";
    int qtdeItens           = 1530; //Quantidade de itens inseridos na tabela de preço

    @BeforeMethod
    public void setup() {
        Login.open();
        Login.logar("robohom", "robo123");
    }

    @Test
    public void cadastrarTabelaDePreco() {
        Menu.acessarTelaTabelaPreco();
        TabelaPreco.alternarTelaTabelaPreco();
        TabelaPreco.setDescricaoTabelaPreco(descricaoTabela);
        TabelaPreco.marcarExibirPedidosExternos();
        TabelaPreco.marcarExibirPedidosInternos();
        TabelaPreco.clicarBotaoConfirmarTabela();
        TabelaPreco.validarAlertaSalvoComSucesso();

        //adicionando os itens na tabela de preço
        int ContadorCodigoProtudo = 0;
        for (int i = 0; i < qtdeItens; i++) {
            TabelaPreco.setProdutoTabela(""+(ContadorCodigoProtudo = ContadorCodigoProtudo + 1));
            TabelaPreco.setPrecoUnitMaxRandom();
            TabelaPreco.clicarBotaoConfirmarItemTabela();
            TabelaPreco.clicarBotaoPesquisarItemTabela();
        }
    }

}
