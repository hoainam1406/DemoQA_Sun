package Steps;

import Object.TextBoxPageObject;
import Pages.TextBoxPage;
import Serenity.TextBoxSerenity;
import UI.Ui;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import java.util.List;
public class TextBoxStepdefs {
    @Steps
    TextBoxSerenity textBoxSerenity;
    Ui ui;
    @Given("^Open home page$")
    public void openHomePage() {
        textBoxSerenity.openHomePage();
    }
    @And("^Valid data to all textfield$")
    public void validDataToAllTextfield(List<TextBoxPageObject>  usercredentials) {
        for (TextBoxPageObject textbox : usercredentials) {
            ui.txtUserName.sendKeys(textbox.getUserName());
            ui.txtEmail.sendKeys(textbox.getEmail());
            ui.txtCurrentAddress.sendKeys(textbox.getCurrentAddress());
            ui.txtPermanentAddress.sendKeys(textbox.getPermanentAddress());

        }
    }
    @Then("^The website display data in textbox correct$")
    public void theWebsiteDisplayDataInTextboxCorrect(List<TextBoxPageObject>  usercredentials) {
        for (TextBoxPageObject textbox : usercredentials) {
            Assert.assertEquals(textBoxSerenity.getUserName(),textbox.getUserName());
            Assert.assertEquals(textBoxSerenity.getEmail(),textbox.getEmail());
            Assert.assertEquals(textBoxSerenity.getCurrentAddress(),textbox.getCurrentAddress());
            Assert.assertEquals(textBoxSerenity.getPermanentAddress(),textbox.getPermanentAddress());
        }
    }
    @And("^Click to submit$")
    public void clickToSubmit() {
        textBoxSerenity.clickSubmit();
    }
    @Then("^The website display input with color red$")
    public void theWebsiteDisplayInputWithColorRed() {
        Assert.assertEquals(textBoxSerenity.expectedColorWhenTrue(),textBoxSerenity.colorCode());
    }


}
