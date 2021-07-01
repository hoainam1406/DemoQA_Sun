package Pages;
import UI.WebTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/webtables")
public class WebtablePage extends PageObject{

    WebTable ui ;
    public String getFirstName(){
        return ui.firstName.getTextValue();
    }

    public String getLastName(){
        return ui.lastName.getTextValue();
    }
    public String getFirstNameNew(){
        return ui.firstNameNew.getTextValue();
    }
    public String getLastNameNew(){
        return ui.lastNameNew.getTextValue();
    }
    public String getAgeNew(){
        return ui.ageNew.getTextValue();
    }
    public String getEmailNew(){
        return ui.emailNew.getTextValue();
    }
    public String getSalaryNew(){
        return ui.salaryNew.getTextValue();
    }
    public String getDepartmentNew(){
        return ui.departmentNew.getTextValue();
    }
    public void click_add_button(){

        ui.add.click();
    }

    public String getFormName(){
        return ui.formName.getTextValue();
    }
    public void click_submit_button(){

        ui.submit.click();
    }
    public void enter_data(){
        ui.firstnameinput.sendKeys("Phuong");
        ui.lastnameinput.sendKeys("Hong");
        ui.emailinput.sendKeys("phuong123@gmail.com");
        ui.ageinput.sendKeys("18");
        ui.salaryinput.sendKeys("2000000");
        ui.departmentinput.sendKeys("Tester Team");
    }
}
