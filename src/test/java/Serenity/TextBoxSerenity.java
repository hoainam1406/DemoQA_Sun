package Serenity;
import Pages.TextBoxPage;
import UI.Ui;

public class TextBoxSerenity {
    TextBoxPage textBoxPage;
    Ui ui;
    public void openHomePage() {
        textBoxPage.open();
    }
    public String getUserName() {

        return textBoxPage.getUserName();
    }
    public String getEmail() {

        return textBoxPage.getEmail();
    }
    public String getCurrentAddress() {

        return textBoxPage.getCurrentAddress();
    }
    public String getPermanentAddress() {

        return textBoxPage.getPermanentAddress();
    }
    public String colorCode(){
        String colorCode= ui.txtEmail.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(255, 0, 0, 1)";
        return expectedColorCodeInRGB;
    }
    public void clickSubmit() {
        textBoxPage.clickSubmit();
    }

}
