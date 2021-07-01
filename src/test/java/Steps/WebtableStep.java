package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import Serenity.WebTableSerenity;

public class WebtableStep {
    @Steps
    WebTableSerenity webtableSerenity;
    @Given("^Open home page$")
    public void openHomePage() {
        webtableSerenity.open_Home_Page();
    }

    @Then("^The website display Member in Grid correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayMemberinGridCorrectWithAnd(String firstName,String lastName) throws Throwable {
        Assert.assertEquals(webtableSerenity.getFirstName(),firstName);
        Assert.assertEquals(webtableSerenity.getLastName(),lastName);
    }
    @When("^Click on add button$")
    public void clickOnAddButton() {
        webtableSerenity.click_Add_Button();
    }

    @Then("^The website display Form correct with \"([^\"]*)\"$")
    public void theWebsiteDisplayFormCorrectWith(String formName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(webtableSerenity.getFormName(),formName);

    }

    @And("^Enter data to all textfield$")
    public void enterDataToAllTextfield() {
        webtableSerenity.enterData();
    }

    @And("^Click submit button$")
    public void clickSubmitButton() {
        webtableSerenity.click_Submit_Button();
    }

    @Then("^The website display Member in Grid correct with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayMemberInGridCorrectWithAndAndAndAndAnd(String fnamenew, String lnamenew, String agenew, String emailnew, String salarynew, String departmentnew) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(webtableSerenity.getFirstNameNew(),fnamenew);
        Assert.assertEquals(webtableSerenity.getLastNameNew(),lnamenew);
        Assert.assertEquals(webtableSerenity.getAgeNew(),agenew);
        Assert.assertEquals(webtableSerenity.getEmailNew(),emailnew);
        Assert.assertEquals(webtableSerenity.getSalaryNew(),salarynew);
        Assert.assertEquals(webtableSerenity.getDepartmentNew(),departmentnew);
    }
}
