package pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected static LoginPage Login;
    protected static MenuPage Menu;
    protected static PedidoVendaPage Pedido;
    protected static OrcamentoPage Orcamento;
    protected static EstoqueInicialPage EstoqueInicial;
    protected static TabelaPrecoPage TabelaPreco;

    @BeforeMethod
    public void start() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        //Configuration.browser = "firefox";
        Configuration.baseUrl = "https://test.webmaissistemas.com.br/csp/geizy/system/www/index.csp?lf=1";


        Login = new LoginPage();
        Menu = new MenuPage();
        Pedido = new PedidoVendaPage();
        Orcamento = new OrcamentoPage();
        EstoqueInicial = new EstoqueInicialPage();
        TabelaPreco =  new TabelaPrecoPage();
    }
}
