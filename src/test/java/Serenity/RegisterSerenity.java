package Serenity;

import Pages.RegisterPage;
import UI.Ui;

public class RegisterSerenity {
    Ui ui;
    RegisterPage registerPage;
    public String getFistname(){
        return registerPage.getFistname();
    }
    public String getLastname(){
        return registerPage.getLastname();
    }
    public String getPassword(){
        return registerPage.getPassword();
    }
    public  String getErrorRecaptcha(){
        return  registerPage.getErrorRecaptcha();
    }
    public String getName(){
        return registerPage.getName();
    }
    public void Register(){
        registerPage.Register();
    }
    public String warningFirstName(){
        String colorFirstName= ui.firstname.getCssValue("border-bottom-color");
        return colorFirstName;
    }
    public void newUser(){
       registerPage.newUser();
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }
}
