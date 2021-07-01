package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticePage extends PageObject{


    @FindBy(xpath = "//button[@id='submit']")
    WebElementFacade button;

    public void ClickSubmitButton(){
        evaluateJavascript("document.querySelector('#submit').click()");
    }
    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    WebElementFacade message;
    @FindBy(xpath ="//textarea[@id='currentAddress']" )
    WebElementFacade last;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElementFacade firstname;
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    public void Scroll() {
//        js.executeScript("scrollBy(0,500)");
        js.executeScript("arguments[0].scrollIntoView(true);", last);
//        js.executeScript("document.body.style.zoom='90%';");}
//        js.executeScript("document.body.style.zoom = '1.5'");
    }
    public void enterfirstname(){
        firstname.sendKeys("Hoài Nam");
    }
    public String getMessage(){
        return message.getText();
    }

}

