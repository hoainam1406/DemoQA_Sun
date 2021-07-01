
package Serenity;

        import net.thucydides.core.steps.ScenarioSteps;
        import Pages.WebtablePage;

public class WebTableSerenity extends ScenarioSteps {
    WebtablePage webtablePage;

    public void open_Home_Page(){
        webtablePage.open();
    }
    public String getFirstName() {
        return webtablePage.getFirstName();
    }
    public String getLastName() {
        return webtablePage.getLastName();
    }
    public String getFirstNameNew() {
        return webtablePage.getFirstNameNew();
    }
    public String getLastNameNew() {
        return webtablePage.getLastNameNew();
    }
    public String getAgeNew() {
        return webtablePage.getAgeNew();
    }
    public String getEmailNew() {
        return webtablePage.getEmailNew();
    }
    public String getSalaryNew() {
        return webtablePage.getSalaryNew();
    }
    public String getDepartmentNew() {
        return webtablePage.getDepartmentNew();
    }
    public void click_Add_Button(){
        webtablePage.click_add_button();
    }
    public String getFormName() {
        return webtablePage.getFormName();
    }
    public void click_Submit_Button(){
        webtablePage.click_submit_button();
    }
    public void enterData(){
        webtablePage.enter_data();
    }

}
