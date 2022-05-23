package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeesPage extends CommonMethods {

   @FindBy(id="firstName")
   public WebElement firstNameField;

   @FindBy(id="middleName")
   public WebElement middleNameField;

   @FindBy(id="lastName")
   public WebElement lastNameField;

   @FindBy(id="employeeId")
   public WebElement empIDField;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    @FindBy(id="chkLogin")
    public WebElement createLoginCheckbox;

    @FindBy(id="user_name")
    public WebElement usernameField;

    @FindBy(id="user_password")
    public WebElement passwordField;

    @FindBy(id="re_password")
    public WebElement rePasswordField;

    @FindBy(id="status")
    public WebElement statusDD;

    public AddEmployeesPage(){
        PageFactory.initElements(driver,this);
    }
}
