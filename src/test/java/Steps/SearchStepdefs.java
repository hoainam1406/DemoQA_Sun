package Steps;

import Serenity.SearchSerenity;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SearchStepdefs {
    @Steps
    SearchSerenity searchSerenity;
    @Given("^Open home page books$")
    public void openHomePageBooks() {
        searchSerenity.openHomePage();
    }


    @And("^Click to search$")
    public void clickToSearch() {
        searchSerenity.Search();
    }

    @Then("^The website display data search\"([^\"]*)\"$")
    public void theWebsiteDisplayDataSearch(String text) throws Throwable {
        Assert.assertEquals(searchSerenity.getSearch(),text);


    }

    @And("^Valid data need find$")
    public void validDataNeedFind() {
        searchSerenity.Data();
    }

    @And("^Click Link to GitPocketGuide$")
    public void clickLinkToGitPocketGuide() {
        searchSerenity.Link();
    }

    @Then("^The website display data book store search\"([^\"]*)\"$")
    public void theWebsiteDisplayDataBookStoreSearch(String text) throws Throwable {
        Assert.assertEquals(searchSerenity.getISBN(),text);

    }
}
