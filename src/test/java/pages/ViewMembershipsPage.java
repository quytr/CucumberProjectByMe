package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ViewMembershipsPage extends CommonMethods {

    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addMembershipBtn;

    @FindBy(id = "delMemsBtn")
    public WebElement deleteMembershipBtn;

    @FindBy(id = "btnAddAttachment")
    public WebElement addAttachmentsBtn;

    @FindBy(xpath = "//*[@id=\"membership_membership\"]")
    public WebElement membershipDD;

    @FindBy(xpath = "//*[@id=\"membership_subscriptionPaidBy\"]")
    public WebElement subsctiptionPaidByDD;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement subscriptionAmountBox;

    @FindBy(id = "membership_currency")
    public WebElement currencyDD;

    @FindBy(id = "membership_subscriptionCommenceDate")
    public WebElement subscriptionCommenceDate;

    @FindBy(id = "membership_subscriptionRenewalDate")
    public WebElement subscriptionRenewalDate;

    @FindBy(id = "btnSaveMembership")
    public WebElement saveMembershipBtn;

    public ViewMembershipsPage() {
        PageFactory.initElements(driver, this);

    }
}
