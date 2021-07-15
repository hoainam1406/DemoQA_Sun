package Steps;

import Serenity.RadioBtnSerenity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RadioBtnStepdefs {
    @Steps
    RadioBtnSerenity radioBtnSerenity;
    @Given("^Open home page radio button$")
    public void openHomePageRadioButton() {
        radioBtnSerenity.openHomePage();
    }
    @And("^Click to label yes$")
    public void clickToLabelYes() {
        radioBtnSerenity.SelectedYess();
    }

    @Then("^The website display you have selected \"([^\"]*)\"$")
    public void theWebsiteDisplayYouHaveSelected(String text) throws Throwable {
        Assert.assertEquals(radioBtnSerenity.getSelectedRadio(),text);
    }


}
