package Pages;
import UI.Ui;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://demoqa.com/login")
public class LoginPage extends PageObject {
    Ui ui;
    public String getValue(){
        return ui.value.getTextValue();
    }
    public String getText(){
        return ui.text.getTextValue();
    }
    public void ClickLogin(){
        ui.btnLogin.click();
    }
    public void deleteBook(){
        ui.btnDelete.click();
    }
    public void clickOk(){
        ui.btnOK.click();

    }



}
