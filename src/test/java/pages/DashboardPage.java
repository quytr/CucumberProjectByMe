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


    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminTab;

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationsTab;

    @FindBy(xpath = "//*[@class=\"current\"]/ul/li[4]/ul/li[5]")
    public WebElement membership;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}
