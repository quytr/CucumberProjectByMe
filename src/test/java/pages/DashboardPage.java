package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeMsg;

    @FindBy(xpath = "//div[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}
