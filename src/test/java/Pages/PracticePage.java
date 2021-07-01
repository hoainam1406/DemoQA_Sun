package Pages;

import UI.PracticeForm_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticePage extends PageObject{
    PracticeForm_UI practiceForm_ui;
    public void ClickSubmitButton(){
        evaluateJavascript("document.querySelector('#submit').click()");
    }
    public void enterfirstname(){
        practiceForm_ui.firstname.sendKeys("Hoài Nam");
    }
    public String getMessage(){
        return practiceForm_ui.message.getText();
    }


}

