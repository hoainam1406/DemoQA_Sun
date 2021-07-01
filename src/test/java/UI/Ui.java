package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Ui extends PageObject {
    @FindBy(xpath = "//input[@id='userName']")
    public WebElementFacade userName;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElementFacade email;
    @FindBy(css = "textarea#currentAddress.form-control")
    public WebElementFacade currentAddress;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    public WebElementFacade permanentAddress;
    @FindBy(id = "submit")
    public WebElementFacade submit;
    @FindBy(css = "input#userEmail.field-error")
    public WebElementFacade userEmail;
}
