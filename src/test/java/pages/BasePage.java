package pages;

import static com.codeborne.selenide.Selectors.byText;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.text.DecimalFormat;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage {

    public void buscaTelasSistemaClicar(String id) {
        $("#" + id).click();
    }

    public void clicarNoResultadoDaPesquisa(String id) {
        $("#" + id).click();
    }

    public void clicarBotaoId(String id) {
        $("#" + id).click();
    }

    public void escrever(String id, String texto) {
        $("#" + id).setValue(texto);
    }

    public void inserirCodigo(String id, String texto) {
        $("#" + id).setValue(texto);
    }

    public void alternarFocoJanela() {
        switchTo().window((String) getWebDriver().getWindowHandles().toArray()[1]);
    }

    public String alertaObterTextoEAceita() {
        Alert alerta = getWebDriver().switchTo().alert();
        String valor = alerta.getText();
        alerta.accept();
        return valor;
    }

    public void clicarAba(String id) {
        $("#" + id).click();
    }

   public void inserirCodigoProduto( String codigoProduto){
        $(byText("Inicie com '+' para buscar pelo código")).click();
        $("input[type=search]").setValue(codigoProduto).sendKeys(Keys.TAB, Keys.TAB);
    }

    public void inserirQuantidade(String id_campo, String qtde){
        $("#" + id_campo).setValue(qtde).sendKeys(Keys.TAB);
    }

    public void inserirValor(String id_campo, String valor){
        $("#" + id_campo).setValue(valor).sendKeys(Keys.TAB);
    }

    public void esperaFixa(int tempoMilesegundos) {
        sleep(tempoMilesegundos);
    }

    public String geraCustoUnitario() {

        Random r = new Random();
        double  numero = r.nextFloat()*10;

        DecimalFormat df = new DecimalFormat("0.###");
        String numeroFormatado = df.format(numero);
        return numeroFormatado;
    }

    public String geraQuantidadeItem() {

        Random r = new Random();
        double  numero = 10 + r.nextFloat()*10;

        DecimalFormat df = new DecimalFormat("0.##");
        String numeroFormatado = df.format(numero);
        return numeroFormatado;
    }

    public String geraValorUnitarioItem() {

        Random r = new Random();
        double  numero = r.nextFloat()*1000;

        DecimalFormat df = new DecimalFormat("0.##");
        String numeroFormatado = df.format(numero);
        return numeroFormatado;
    }

}
