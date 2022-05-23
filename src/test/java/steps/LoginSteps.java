package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {

        sendText(login.usernameBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordBox, ConfigReader.getPropertyValue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        click(login.loginBtn);
    }
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {

        Assert.assertTrue(dashboard.welcomeMsg.isDisplayed());
    }

}
