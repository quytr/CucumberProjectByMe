package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class AddEmployeesSteps extends CommonMethods {

    @Then("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(employeeSearchPage.pimOption);
    }


    @Then("user click on add employee option")
    public void user_click_on_add_employee_option() {
        click(employeeSearchPage.addEmployee);
    }

    @Then("user enters firstName middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        sendText(addEmployeesPage.firstNameField, "Robert");
        sendText(addEmployeesPage.middleNameField, "Jr");
        sendText(addEmployeesPage.lastNameField, "Evan");

    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeesPage.saveBtn);
    }

    @Then("employee is added successfully")
    public void employee_is_added_successfully() {

        String expectedEmpID = employeeDetailPage.employeeID.getAttribute("value");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(employeeSearchPage.pimOption);
        sendText(employeeSearchPage.empIDSearchField, expectedEmpID);
        click(employeeSearchPage.searchBtn);

        String actualEmpID = employeeSearchPage.empIDNumber.getText();

        System.out.println(expectedEmpID);
        System.out.println(actualEmpID);

        Assert.assertEquals(expectedEmpID, actualEmpID);


    }

    @When("user adds multiple employees from excel file using {string} sheet and verify the employee added")
    public void user_adds_multiple_employees_from_excel_file_using_sheet_and_verify_the_employee_added(String sheetName) {

        List<Map<String, String>> newEmployees = ExcelReader.excelIntoMap(Constants.TESTDATA_FILEPATH, sheetName);
        Iterator<Map<String, String>> iterator = newEmployees.iterator();

        while (iterator.hasNext()) {
            Map<String, String> mapNewEmp = iterator.next();
            sendText(addEmployeesPage.firstNameField, mapNewEmp.get("firstName"));
            sendText(addEmployeesPage.middleNameField, mapNewEmp.get("middleName"));
            sendText(addEmployeesPage.lastNameField, mapNewEmp.get("lastName"));

            String expectedEmpID = addEmployeesPage.empIDField.getAttribute("value");

            System.out.println("expectedEmpID " + expectedEmpID);

            click(addEmployeesPage.saveBtn);
            click(employeeSearchPage.pimOption);
            sendText(employeeSearchPage.empIDSearchField, expectedEmpID);
            click(employeeSearchPage.searchBtn);

            for (int i = 0; i < employeeInfoPage.rowData.size(); i++) {
                String rowText = employeeInfoPage.rowData.get(i).getText();
                System.out.println("rowText " + rowText);
                String expectedData = expectedEmpID + " " + mapNewEmp.get("firstName") + " " + mapNewEmp.get("middleName") + " " + mapNewEmp.get("lastName");
                System.out.println("expectedData " + expectedData);

                Assert.assertEquals(expectedData, rowText);
            }

            click(employeeSearchPage.addEmployee);


        }

    }

}
