package Pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import UI.Ui;
@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {
    Ui ui;
    public String getUserName() {
        return ui.userName.getTextValue();
    }

    public String getEmail() {
        return ui.email.getTextValue();
    }
    public String getCurrentAddress() {
        return ui.currentAddress.getValue();
    }
    public String getPermanentAddress() {
        return ui.permanentAddress.getValue();
    }
    public void inputData() {
        ui.userName.sendKeys("MyKieu");
        ui.email.sendKeys("kieu@gmail.com");
        ui.currentAddress.sendKeys("DaNang");
        ui.permanentAddress.sendKeys("QuangNam");
    }
    public void emailError(){
        ui.userName.sendKeys("MyKieu");
        ui. currentAddress.sendKeys("DaNang");
        ui.permanentAddress.sendKeys("QuangNam");
        ui.email.sendKeys("kieu");
        if(ui.userEmail.containsElements("@")) {
            System.out.println("Test not passed");
        }else {
            System.out.println("Test passed");
        }
    }
    public void fullNameBlank(){
        ui.email.sendKeys("kieu@gmail.com");
        ui.currentAddress.sendKeys("DaNang");
        ui.permanentAddress.sendKeys("QuangNam");

    }
    public void  clickSubmit() {
        evaluateJavascript("document.querySelector('#submit').click()");
    }
}
