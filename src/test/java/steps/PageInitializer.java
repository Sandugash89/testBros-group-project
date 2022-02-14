package steps;

import pages.*;

public class PageInitializer {

    public static LoginPage loginPage;
    public static DashboardPage dash;
    public static TerminateEmployment terminateEmployment;
    public static ContactDetailsPage contactDetailsPage;
    public static DependentPage dependentPage;
    public static EmergencyContactsPage emergencyContactsPage;
    public static EmployeePersonalDetailsPage employeePersonalDetailsPage;
    public static EmployeeViewPage employeeViewPage;
    public static JobPage jobPage;
    public static LicensesPage licensesPage;
    public static QualificationsPage qualificationsPage;



    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dash = new DashboardPage();
        terminateEmployment = new TerminateEmployment();
        contactDetailsPage=new ContactDetailsPage();
        dependentPage=new DependentPage();
        emergencyContactsPage=new EmergencyContactsPage();
        employeePersonalDetailsPage=new EmployeePersonalDetailsPage();
        employeeViewPage=new EmployeeViewPage();
        jobPage=new JobPage();
        licensesPage=new LicensesPage();
        qualificationsPage=new QualificationsPage();

    }

}
