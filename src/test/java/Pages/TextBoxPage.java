package Pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import UI.Ui;
@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {
    Ui ui;
    public String getUserName() {

        return ui.txtUserName.getTextValue();
    }

    public String getEmail() {

        return ui.txtEmail.getTextValue();
    }
    public String getCurrentAddress() {

        return ui.txtCurrentAddress.getValue();
    }
    public String getPermanentAddress() {

        return ui.txtPermanentAddress.getValue();
    }
    public void  clickSubmit() {
        evaluateJavascript("document.querySelector('#submit').click()");
    }
}
