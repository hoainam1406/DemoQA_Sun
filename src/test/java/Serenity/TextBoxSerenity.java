package Serenity;
import Pages.TextBoxPage;
public class TextBoxSerenity {
    TextBoxPage textBoxPage;
    public void open_Home_Page() {
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
    public void inputData(){
        textBoxPage.inputData();
    }
    public void emailError(){
        textBoxPage.emailError();
    }
    public void clickSubmit() {
        textBoxPage.clickSubmit();
    }
    public void fullNameBlank() {
        textBoxPage.fullNameBlank();
    }

}
