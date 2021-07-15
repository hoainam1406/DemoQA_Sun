package Pages;

import UI.Ui;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/login")
public class RegisterPage extends PageObject {
    Ui ui;
    public String getFistname(){
        return ui.firstname.getTextValue();
    }
    public String getLastname(){
        return ui.lastname.getTextValue();
    }
    public String getPassword(){
        return ui.pass.getTextValue();
    }
    public String getName(){
        return ui.name.getTextValue();
    }
    public void newUser(){
        ui.newuser.click();
    }
    public  String getErrorRecaptcha(){
        return  ui.errorRecaptcha.getTextValue();}
    public void Register(){
        evaluateJavascript("document.querySelector('#register').click()");

    }

}
