package pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected static LoginPage Login;
    protected static MenuPage Menu;
    protected static PedidoVendaPage Pedido;
    protected static OrcamentoPage Orcamento;
    protected static EstoqueInicialPage EstoqueInicial;

    @BeforeMethod
    public void start() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://test.webmaissistemas.com.br/csp/wagner/system/www/index.csp?lf=1";

        Login = new LoginPage();
        Menu = new MenuPage();
        Pedido = new PedidoVendaPage();
        Orcamento = new OrcamentoPage();
        EstoqueInicial = new EstoqueInicialPage();
    }
}