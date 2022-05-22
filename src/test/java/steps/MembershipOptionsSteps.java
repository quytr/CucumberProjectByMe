package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class MembershipOptionsSteps extends CommonMethods {

    @When("user navigates to View Memberships page")
    public void user_navigates_to_view_memberships_page() {

        click(personal.membershipOption);
        click(viewMembershipsPage.addMembershipBtn);

    }


    @When("user verifies Membership dropdown and select values")
    public void user_verifies_membership_dropdown_and_select_values() {

        Select select = new Select(viewMembershipsPage.membershipDD);

        Assert.assertTrue(viewMembershipsPage.membershipDD.isDisplayed());

        select.selectByVisibleText("Debug Team");

    }

    @When("user verifies Subscription Paid By dropdown and select values")
    public void user_verifies_subscription_paid_by_dropdown_and_select_values() {

        Select select = new Select(viewMembershipsPage.subsctiptionPaidByDD);

        Assert.assertTrue(viewMembershipsPage.subsctiptionPaidByDD.isDisplayed());

        select.selectByIndex(0);

    }

    @When("user verifies Amount text box and enter values")
    public void user_verifies_amount_text_box_and_enter_values() {

        Assert.assertTrue(viewMembershipsPage.subscriptionAmountBox.isDisplayed());

        sendText(viewMembershipsPage.subscriptionAmountBox, "99.99");

    }

    @When("user verifies Currency dropdown and select values")
    public void user_verifies_currency_dropdown_and_select_values() {

        Select select = new Select(viewMembershipsPage.currencyDD);

        Assert.assertTrue(viewMembershipsPage.currencyDD.isDisplayed());

        select.selectByValue("USD");
    }

    @When("user verifies Subscription Commence Date and select values")
    public void user_verifies_subscription_commence_date_and_select_values() {

        click(viewMembershipsPage.subscriptionCommenceDate);

        Assert.assertTrue(viewMembershipsPage.subscriptionCommenceDate.isDisplayed());

        WebElement monthDD = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Jan");

        List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date : dates){
            if(date.getText().equals("1")){
                click(date);
                break;
            }
        }

    }

    @When("user verifies Subscription Renewal Date calendar and select values")
    public void user_verifies_subscription_renewal_date_calendar_and_select_values() {

        click(viewMembershipsPage.subscriptionRenewalDate);

        Assert.assertTrue(viewMembershipsPage.subscriptionRenewalDate.isDisplayed());

        WebElement monthDD = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
        Select select = new Select(monthDD);
        select.selectByIndex(11);

        WebElement yearDD = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
        Select select1 = new Select(yearDD);
        select1.selectByVisibleText("2024");

        List<WebElement> dates = driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
        for(WebElement date : dates){
            if(date.getText().equals("31")){
                click(date);
                break;
            }
        }

    }

    @Then("membership is added successfully")
    public void membership_is_added_successfully() {

        click(viewMembershipsPage.saveMembershipBtn);

    }
}
