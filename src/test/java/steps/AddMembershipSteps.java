package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class AddMembershipSteps extends CommonMethods {

    @When("user clicks on Admin option")
    public void user_clicks_on_admin_option() {
        click(dashboard.adminTab);
    }

    @When("user navigates to Membership page")
    public void user_navigates_to_membership_page() {

        Actions action = new Actions(driver);
        action.moveToElement(dashboard.adminTab).build().perform();
        action.moveToElement(dashboard.qualificationsTab).build().perform();
        click(dashboard.membership);

    }

    @When("user enters any memberships in Name field")
    public void user_enters_any_memberships_in_name_field() {

        click(adminMembershipPage.addBtn);
        sendText(adminMembershipPage.nameField, "Avenger");
    }

    @Then("memberships name is added successfully")
    public void memberships_name_is_added_successfully() {
        click(adminMembershipPage.saveBtn);
    }
}
