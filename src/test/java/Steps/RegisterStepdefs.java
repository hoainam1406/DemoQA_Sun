package Steps;

import Object.RegisterPageObject;
import Serenity.RegisterSerenity;
import UI.Ui;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class RegisterStepdefs {

    @Steps

    RegisterSerenity registerSerenity;
    Ui ui;
    @And("^Click to Button NewUser$")
    public void clickToButtonNewUser() {
       registerSerenity.newUser();

    }

    @And("^Enter data in Form$")
    public void enterDataInForm(List<RegisterPageObject> usercredentials) {
        for (RegisterPageObject register : usercredentials) {
            ui.firstname.sendKeys(register.getFistname());
            ui.lastname.sendKeys(register.getLastname());
            ui.name.sendKeys(register.getUsername());
            ui.passWord.sendKeys(register.getPassword());
        }
    }
    @And("^Click to Register$")
    public void clickToRegister() {
     registerSerenity.Register();
    }
    @Then("^The website display \"([^\"]*)\"$")
    public void theWebsiteDisplay(String text) throws Throwable {
        Assert.assertEquals(registerSerenity.getErrorRecaptcha(), text);
    }

    @Then("^The website display data in form register correct$")
    public void theWebsiteDisplayDataInFormRegisterCorrect(List<RegisterPageObject> usercredentials) {
        for (RegisterPageObject register : usercredentials) {
            Assert.assertEquals(registerSerenity.getFistname(),register.getFistname());
            Assert.assertEquals(registerSerenity.getLastname(),register.getLastname());
            Assert.assertEquals(registerSerenity.getName(),register.getUsername());
            Assert.assertEquals(registerSerenity.getPassword(),register.getPassword());
        }
    }

    @Then("^The website display warning firstName textfield with boder red$")
    public void theWebsiteDisplayWarningFirstNameTextfieldWithBoderRed() {
        Assert.assertEquals(registerSerenity.expectedColorWhenTrue(),registerSerenity.warningFirstName());
    }

}
