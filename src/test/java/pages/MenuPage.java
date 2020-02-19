package pages;

public class MenuPage extends BasePage{

    public void acessaTelaPedidoDevenda() {
        buscaTelasSistemaClicar("iconeNavFerramentaPesquisa");
        escrever("inputCaixaPesquisa", "Pedido de venda - Consulta");
        clicarNoResultadoDaPesquisa("preresultadoPesquisa");
    }

    public void acessaTelaOrcamento() {
        buscaTelasSistemaClicar("iconeNavFerramentaPesquisa");
        escrever("inputCaixaPesquisa", "Orçamento de venda");
        clicarNoResultadoDaPesquisa("preresultadoPesquisa");
    }

    public void acessarTelaEstoqueInicial() {
        buscaTelasSistemaClicar("iconeNavFerramentaPesquisa");
        escrever("inputCaixaPesquisa", "MT034");
        clicarNoResultadoDaPesquisa("preresultadoPesquisa");
    }

    public void acessarTelaTabelaPreco() {
        buscaTelasSistemaClicar("iconeNavFerramentaPesquisa");
        escrever("inputCaixaPesquisa", "ss108");
        clicarNoResultadoDaPesquisa("preresultadoPesquisa");
    }
}
