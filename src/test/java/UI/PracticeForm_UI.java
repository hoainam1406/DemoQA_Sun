package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PracticeForm_UI extends PageObject {
    @FindBy(xpath = "//button[@id='submit']")
    public WebElementFacade button;
    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElementFacade message;
    @FindBy(xpath ="//textarea[@id='currentAddress']" )
    public WebElementFacade last;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElementFacade firstname;
}
