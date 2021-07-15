package Serenity;
import Pages.LoginPage;
import UI.Ui;
public class LoginSerenity {
    Ui ui;
    LoginPage loginPage;
    public void openHomePage() {
        loginPage.open();
    }
    public String getValue(){
        return loginPage.getValue();
    }
    public String getText(){
        return loginPage.getText();
    }
    public void ClickLogin(){
        loginPage.ClickLogin();
    }
    public String colorName(){
        String colorName= ui.userLogin.getCssValue("border-bottom-color");
        return colorName;
    }

    public String colorPassword(){
        String colorPass= ui.passWord.getCssValue("border-bottom-color");
        return colorPass;
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }
    public void deleteBook(){
       loginPage.deleteBook();
    }
    public void clickOk(){
        loginPage.clickOk();
    }
}
