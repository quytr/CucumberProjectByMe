package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminMembershipPage extends CommonMethods {

    @FindBy(id="btnAdd")
    public WebElement addBtn;

    @FindBy(id="membership_name")
    public WebElement nameField;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    public AdminMembershipPage(){
        PageFactory.initElements(driver, this);
    }



}
