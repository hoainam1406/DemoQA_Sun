package Steps;
import Object.LoginPageObject;
import Pages.LoginPage;
import Serenity.LoginSerenity;
import UI.Ui;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import java.util.List;

public class LoginStepdefs {
    @Steps
    LoginSerenity loginSerenity;
     Ui ui;
    @Given("^Open home page login$")
    public void openHomePage() {
        loginSerenity.openHomePage();
    }

    @And("^Click to login$")
    public void clickToLogin() {
        loginSerenity.ClickLogin();
    }

    @Then("^The website display book store login correct with \"([^\"]*)\"$")
    public void theWebsiteDisplayBookStoreLoginCorrectWithAnd(String value) throws Throwable {
        Assert.assertEquals(loginSerenity.getValue(), value);
    }
    @Then("^The website display book store login incorrect with \"([^\"]*)\"$")
    public void theWebsiteDisplayBookStoreLoginIncorrectWith(String text) throws Throwable {
        Assert.assertEquals(loginSerenity.getText(), text);
    }

    @And("^User enters Credentials to LogIn$")
    public void userEntersCredentialsToLogIn(List<LoginPageObject>  usercredentials) throws Throwable {
        for (LoginPageObject credentials : usercredentials) {
            ui.userLogin.sendKeys(credentials.getUserLogin());
            ui.passWord.sendKeys(credentials.getPassWord());
        }
        }

    @Then("^Message displayed User Register Successfully\\.$")
    public void messageDisplayedUserRegisterSuccessfully() {
        System.out.println("User Register Successfully");
    }

    @When("^User LogOut from the Application$")
    public void userLogOutFromTheApplication() {
       ui.btnLogOut.click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void messageDisplayedLogOutSuccessfully() {
        System.out.println("LogOut Successfully");
    }

    @Then("^The website display warning textfield with boder red$")
    public void theWebsiteDisplayWarningTextfieldWithBoderRed() {
        Assert.assertEquals(loginSerenity.expectedColorWhenTrue(),loginSerenity.colorName());
        Assert.assertEquals(loginSerenity.expectedColorWhenTrue(),loginSerenity.colorPassword());
    }

    @Then("^The website display warning password textfield with boder red$")
    public void theWebsiteDisplayWarningPasswordTextfieldWithBoderRed() {
        Assert.assertEquals(loginSerenity.expectedColorWhenTrue(),loginSerenity.colorPassword());
    }

    @And("^Click to btnDelete$")
    public void clickToBtnDelete() {
        loginSerenity.deleteBook();
    }

    @And("^Click to OK to delete this book$")
    public void clickToOKToDeleteThisBook() {
        loginSerenity.clickOk();
    }

    @Then("^The display message deleted$")
    public void theDisplayMessageDeleted() {
        System.out.println("Book deleted");
    }
}

