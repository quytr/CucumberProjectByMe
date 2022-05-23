package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeeInfoPage extends CommonMethods {

    @FindBy(xpath = "//table[@class='table hover']/tbody/tr")
    public List<WebElement> rowData;

    public EmployeeInfoPage(){
        PageFactory.initElements(driver, this);
    }
}
