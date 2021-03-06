package steps;

import pages.*;

public class PageInitializers {

    public static LoginPage login;
    public static DashboardPage dashboard;
    public static AddEmployeesPage addEmployeesPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static EmployeeDetailPage employeeDetailPage;
    public static EmployeeInfoPage employeeInfoPage;
    public static PersonalDetailsPage personal;
    public static ViewMembershipsPage viewMembershipsPage;
    public static AdminMembershipPage adminMembershipPage;


    public static void initializePageObjects(){

        login = new LoginPage();
        dashboard = new DashboardPage();
        addEmployeesPage = new AddEmployeesPage();
        employeeSearchPage = new EmployeeSearchPage();
        employeeDetailPage = new EmployeeDetailPage();
        employeeInfoPage = new EmployeeInfoPage();
        personal = new PersonalDetailsPage();
        viewMembershipsPage = new ViewMembershipsPage();
        addEmployeesPage = new AddEmployeesPage();
        adminMembershipPage = new AdminMembershipPage();


    }
}
