package Steps;

import Serenity.PracticeForm_Serenity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class PracticeFormSteps extends PageObject {
    @Steps
    PracticeForm_Serenity practiceForm_serenity;
    @Given("^Open the Registration Form page$")
    public void openTheRegistrationFormPage() {
        practiceForm_serenity.OpenHomePage();
    }
    @When("^Click the submit button$")
    public void clickTheSubmitButton() {
        practiceForm_serenity.ClickSubmit();
    }
    @Then("^The \"([^\"]*)\" \"([^\"]*)\" should not show$")
    public void theShouldNotShow(String arg0, String arg1) throws Throwable {
        practiceForm_serenity.enter();
//        Assert.assertEquals(serenity.getMessage(),arg0);
        //        throw new PendingException();
    }
}
