package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import Serenity.TextBoxSerenity;

public class TextBoxStepdefs {
    @Steps
    TextBoxSerenity textBoxSerenity;
    @Given("^Open home page$")
    public void openHomePage() {
        textBoxSerenity.open_Home_Page();
    }
    @And("^Input data in textfield$")
    public void inputDataInTextfield() {
        textBoxSerenity.inputData();
    }
    @And("^Click to submit$")
    public void clickToSubmit() {
        textBoxSerenity.clickSubmit();
    }
    @Then("^The website display data in textbox correct with \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void theWebsiteDisplayDataInTextboxCorrectWithAndAndAnd(String userName, String email, String currentAddress, String permanentAddress) throws Throwable {
        Assert.assertEquals(textBoxSerenity.getUserName(),userName);
        Assert.assertEquals(textBoxSerenity.getEmail(),email);
        Assert.assertEquals(textBoxSerenity.getCurrentAddress(),currentAddress);
        Assert.assertEquals(textBoxSerenity.getPermanentAddress(),permanentAddress);
    }

    @And("^Invalid data in textfield$")
    public void invalidDataInTextfield() {

    }

    @Then("^The website display data blank in textbox correct with \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void theWebsiteDisplayDataBlankInTextboxCorrectWithAndAndAnd(String userName, String email, String currentAddress, String permanentAddress) throws Throwable {
        Assert.assertEquals(textBoxSerenity.getUserName(),userName);
        Assert.assertEquals(textBoxSerenity.getEmail(),email);
        Assert.assertEquals(textBoxSerenity.getCurrentAddress(),currentAddress);
        Assert.assertEquals(textBoxSerenity.getPermanentAddress(),permanentAddress);
    }

    @And("^Enter all data but email textfield incorrect format$")
    public void enterAllDataButEmailTextfieldIncorrectFormat() {
        textBoxSerenity.emailError();
    }

    @Then("^The website display data with \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void theWebsiteDisplayDataWithAndAndAnd(String userName, String email, String currentAddress, String permanentAddress) throws Throwable {
        Assert.assertEquals(textBoxSerenity.getUserName(),userName);
        Assert.assertEquals(textBoxSerenity.getEmail(),email);
        Assert.assertEquals(textBoxSerenity.getCurrentAddress(),currentAddress);
        Assert.assertEquals(textBoxSerenity.getPermanentAddress(),permanentAddress);

    }

    @And("^Entering all data but FullName field is blank$")
    public void enteringAllDataButFullNameFieldIsBlank() {
        textBoxSerenity.fullNameBlank();
    }
}
