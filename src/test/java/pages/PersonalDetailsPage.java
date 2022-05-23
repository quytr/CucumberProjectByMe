package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PersonalDetailsPage extends CommonMethods {

    @FindBy(xpath = "//ul[@id='sidenav']/li[11]")
    public WebElement membershipOption;

    public PersonalDetailsPage() {
        PageFactory.initElements(driver, this);
    }


}
