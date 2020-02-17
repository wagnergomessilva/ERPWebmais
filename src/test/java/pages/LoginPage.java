package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("");
        return this;
    }

    public LoginPage logar(String usuario, String senha) {
        $("#UserName").setValue(usuario);
        $("#Password").setValue(senha);
        $("#botaoLogin").click();
        return this;
    }
}
