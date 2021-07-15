package Pages;

import UI.Ui;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/radio-button")
public class RadioPage extends PageObject {
        Ui ui;
    public String getSelectedRadio(){
        return ui.SelectedRadio.getTextValue();
    }
    public void SelectedYes(){
        ui.rdoYes.click();
    }

}
