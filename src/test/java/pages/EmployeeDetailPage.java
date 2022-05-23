package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeDetailPage extends CommonMethods {

    @FindBy(id="personal_txtEmployeeId")
    public WebElement employeeID;

    public EmployeeDetailPage(){
        PageFactory.initElements(driver,this);
    }
}

