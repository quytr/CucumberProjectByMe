package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployee;

    @FindBy(id="empsearch_id")
    public WebElement empIDSearchField;

    @FindBy(id="searchBtn")
    public WebElement searchBtn;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[2]")
    public WebElement empIDNumber;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver,this);
    }
}
